package org.datadrivenframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToReadExcelData {
public static void main(String[] args) throws IOException {
	
	//1. locate the file
	File f=new File("D:\\tina\\framework\\Fmaven\\target\\Exceldata\\Data.xlsx");

	//2. to read the data from excel
	FileInputStream fins=new FileInputStream(f);

    //3. type of workbook
	Workbook w=new XSSFWorkbook(fins);  //cls for .xlsx extention

    //4. get the sheet
	Sheet s=w.getSheet("vampire");
	
	//5.get the row
	Row r = s.getRow(3);  //index posi
	
	//6. get the cell
	Cell cl = r.getCell(1); //index posi
	System.out.println(cl);
	
	//7.find the physical num of rows
	int pr=s.getPhysicalNumberOfRows();
	System.out.println("physicalrows:"+pr);
	
    //8.find the physical num of cells
	int pc=r.getPhysicalNumberOfCells();
	System.out.println("physcialcells:"+pc);
	
	

}
}
