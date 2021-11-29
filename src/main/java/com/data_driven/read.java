package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class read {
	public static void all_data() throws IOException {
		   File f = new File("C:\\Users\\Galaxy\\eclipse-workspace\\mavenproject\\src\\main\\java\\com\\data_driven\\data driver\\Book1.xlsx");
	       FileInputStream fis = new FileInputStream(f);
	       Workbook w = new XSSFWorkbook(fis);
	       Sheet sheetAt = w.getSheetAt(0);
	       int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	       for (int i = 0; i < numberOfRows; i++) {
	    	   Row row = sheetAt.getRow(i);
                   int numberOfCells = row.getPhysicalNumberOfCells();
	           for (int j = 0; j <numberOfCells; j++) {
	        	   Cell cell = row.getCell(j);
	        	   CellType cellType = cell.getCellType();
	        	   if (cellType.equals(CellType.STRING)) {
	        		   String cellValue = cell.getStringCellValue();
	        		   System.out.println(cellValue);
	    			
	    		} 
	        	   else if (cellType.equals(CellType.NUMERIC)) {
	    			double numericCellValue = cell.getNumericCellValue();
	    			int value = (int) numericCellValue;
	    			System.out.println(value);
	        	   }
	           }
	       }
		}
		
		public static void main(String[] args) throws IOException {
			all_data();
		}


}
