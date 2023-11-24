package com.sgtesting.excel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelContentDemo 
{
	public static void main(String[] args) 
	{
		writeContent();
	}
	private static void writeContent()
	{
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		FileOutputStream fout=null;
		
		try 
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Credentials");
			//  1st row object
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("UserName");
			cell=row.createCell(1);
			cell.setCellValue("Password");
			
			// 2nd row object
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("Ranav");
			cell=row.createCell(1);
			cell.setCellValue("password");
			
			fout=new FileOutputStream("G:\\EXCEL\\Creadentials.xlsx");
			wb.write(fout);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fout.close();
				wb.close();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
