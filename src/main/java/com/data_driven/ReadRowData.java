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

public class ReadRowData {
	public static void readRowData() throws IOException {
		File f = new File(
				"C:\\\\Users\\\\Galaxy\\\\eclipse-workspace\\\\mavenproject\\\\src\\\\main\\\\java\\\\com\\\\data_driven\\\\data driver\\\\Book2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(3);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			} else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int data = (int) numericCellValue;
				System.out.println(data);

			}
		}
	}


	public static void main(String[] args) throws IOException {
		readRowData();
		
	}


}
