package org.datadrivenframe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWrite {
public static void main(String[] args) throws IOException {
	//1.file location
	File f=new File("D:\\tina\\framework\\Fmaven\\target\\Exceldata\\Dat.xlsx");
	
	//2.create the file
	boolean a=f.createNewFile();
	System.out.println(a);
	
	//3.type of workbook
	Workbook w=new XSSFWorkbook();
	
	//4.create the sheet
	Sheet sheet=w.createSheet("vampire");
	
	//5.create the row
	Row row=sheet.createRow(8);
	
    //6.create the cell
	Cell cell=row.createCell(5);
	
	//7.set the value
	cell.setCellValue("java");
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
	
	System.out.println("success");
	
}
}
