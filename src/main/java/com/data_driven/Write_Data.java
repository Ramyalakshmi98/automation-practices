package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Galaxy\\eclipse-workspace\\mavenproject\\src\\main\\java\\com\\data_driven\\data driver\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook w= new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("automationpractices2");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("url");
		w.getSheet("automationpractices2").getRow(0).createCell(1).setCellValue("a@gmail.com");
		w.getSheet("automationpractices2").createRow(1).createCell(0).setCellValue("password");
		w.getSheet("automationpractices2").getRow(1).createCell(1).setCellValue(1234);
	//	w.getSheet("automationpractices").getRow(0).createCell(1).setCellValue(1234);
		FileOutputStream fo=new FileOutputStream(f);
		w.write(fo);
		w.close();
		System.out.println("Successfully");
	}

}
