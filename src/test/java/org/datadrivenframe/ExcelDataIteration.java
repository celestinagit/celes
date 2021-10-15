package org.datadrivenframe;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataIteration {
	public static void main(String[] args) throws IOException {
		
		//1. locate the file
		File f=new File("D:\\tina\\framework\\Fmaven\\target\\Exceldata\\DT.xlsx");

		//2. to read the data from excel
		FileInputStream fins=new FileInputStream(f);

	    //3. type of workbook
		Workbook w=new XSSFWorkbook(fins);  //cls for .xlsx extention

	    //4. get the sheet
		Sheet s=w.getSheet("vampire");
		
		//5.iterate the excel data
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row row = s.getRow(i);
			
			for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
				Cell cell = row.getCell(j);
				
				
	int cellType=cell.getCellType();
			if(cellType==1)
			{
			String value=cell.getStringCellValue();
			System.out.println(value);
			} else if(cellType==0)
			{
				if(DateUtil.isCellDateFormatted(cell))
				{
					Date d=cell.getDateCellValue();
					SimpleDateFormat sim=new SimpleDateFormat("MM-dd-yyyy");
					String value=sim.format(d);
					System.out.println(value);
				}
				else {
					double d=cell.getNumericCellValue();
					//typecasting syn
					//newDataType ref=(newDataType)oldvariable
					long l=(long)d;
					String value=String.valueOf(l);
					System.out.println(value);
				}
			}
			
			
		}
		}
		}
}
