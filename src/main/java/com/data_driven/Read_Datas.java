package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Datas {
//	public static void readAllData() throws IOException {
//		File f = new File(
//				"C:\\Users\\Galaxy\\eclipse-workspace\\mavenproject\\src\\main\\java\\com\\data_driven\\data driver\\Book1.xlsx");
//		FileInputStream fi = new FileInputStream(f);
//		Workbook w = new XSSFWorkbook(fi);
//		Sheet sheetAt = w.getSheetAt(0);
//		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
//		for (int i = 0; i < physicalNumberOfRows; i++) {
//			Row row = sheetAt.getRow(i);
//			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
//			for (int j = 0; j < physicalNumberOfCells; j++) {
//				Cell cell = row.getCell(j);
//				CellType cellType = cell.getCellType();
//				if (cellType.equals(CellType.STRING)) {
//					String stringCellValue = cell.getStringCellValue();
//					System.out.println(stringCellValue);
//				} 
//				else if (cellType.equals(CellType.NUMERIC)) {
//					double numericCellValue = cell.getNumericCellValue();
//					int data = (int) numericCellValue;
//					System.out.println(data);
//
//				}
//			}
//
//		}
//	}
	public static void readRowData() throws IOException {
		File f = new File(
				"C:\\\\Users\\\\Galaxy\\\\eclipse-workspace\\\\mavenproject\\\\src\\\\main\\\\java\\\\com\\\\data_driven\\\\data driver\\\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(0);
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

	public static void readColumnData() throws IOException {
		File f = new File(
				"C:\\\\Users\\\\Galaxy\\\\eclipse-workspace\\\\mavenproject\\\\src\\\\main\\\\java\\\\com\\\\data_driven\\\\data driver\\\\Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fi);
		Sheet sheetAt = w.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(0);
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
		// readAllData();
		System.out.println("==============================================================");
		readRowData();
		System.out.println("==============================================================");
		readColumnData();

	}

}
