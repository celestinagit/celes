package org.datadrivenframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
public static void main(String[] args) throws IOException {
	//1.locate the file
	File f=new File("D:\\tina\\framework\\Fmaven\\target\\Exceldata\\MAN.xlsx");
	
	//2.to read the data from excel
	FileInputStream fin=new FileInputStream(f);
	
	//3.type of workbook
	Workbook w=new XSSFWorkbook(fin);
	
	//get the sheet
	Sheet s=w.getSheet("vamp");
	
	Row row=s.getRow(5);
	
	Cell cell=row.getCell(1);
	
	String val=cell.getStringCellValue();
	if(val.equals("TOM")) {
		cell.setCellValue("RMPCJR");
		FileOutputStream fout=new FileOutputStream(f);
		w.write(fout);
		System.out.println("success");
		
	}
	
	
	
}
}
