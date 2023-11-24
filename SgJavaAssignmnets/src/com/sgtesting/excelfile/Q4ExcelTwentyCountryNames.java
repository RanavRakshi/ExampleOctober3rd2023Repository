package com.sgtesting.excelfile;
//4)Programmatically write 20 country names in 1st sheet 5th column of an 
// Excel file
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q4ExcelTwentyCountryNames {

	public static void main(String[] args) {
		
		countryNames();
	}
	
	private static void countryNames()
	{
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		FileOutputStream fout=null;
		
		try 
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Sheet1");
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(4);
				cell.setCellValue("Country"+(i+1));
			}
			fout=new FileOutputStream("G:\\EXCEL\\Country.xlsx");
			wb.write(fout);
					
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fout.close();
				wb.close();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
