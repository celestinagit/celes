package Datadriventasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
                      //DATA DRIVEN Q.NO.1,2
public class TaskOne {// TO CREATE A EXCEL WITH 10 STUDENTS AND THEIR COURSES AND FIND NUMBER OF ROWS AND COLS AND PRINT ALL DATAS
public static void main(String[] args) throws IOException {
	//1. locate the file
	File f=new File("D:\\tina\\framework\\Fmaven\\target\\Exceldata\\task 1.xlsx");
	
	//2. to read the data from excel
	FileInputStream fin=new FileInputStream(f);

	//3. type of workbook
	Workbook w=new XSSFWorkbook(fin);
	
	//4.get the sheet
	Sheet s=w.getSheet("Sheet1");
	
	//5.find the physical num of rows
	int pr=s.getPhysicalNumberOfRows();
	System.out.println("phyrows:"+pr);
	
	//6.find the physical num of cells
	Row r=s.getRow(0);
	int pc=r.getPhysicalNumberOfCells();
	System.out.println("phycol:"+pc);

	//7.iterate the excel data
	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
	Row row=s.getRow(i);
	
	for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
	Cell cell=row.getCell(j);
	
	int cellType=cell.getCellType();
	//System.out.println(cellType);
	if(cellType==1)
	{
		String value=cell.getStringCellValue();
		System.out.println(value);
	}
	//else if(DateUtil.isCellDateFormatted(cell))// there is no date present in the excel sheet so date part is hided
//	{
//		Date d=cell.getDateCellValue();
//		SimpleDateFormat sim=new SimpleDateFormat("MM-dd-yyyy");
//		String value=sim.format(d);
//		System.out.println(value);
//	}
	else {
		double d=cell.getNumericCellValue();
		//typecasting syn
		//newDataType ref=(newDataType)oldvariable
		long l=(long)d;
		String value= String.valueOf(l);
		System.out.println(value);
	}
	}
}
}
}
