package com.sgtesting.stringassignment;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {

	public static void main(String[] args) {
		writeExcel();
	}

	private static void writeExcel()
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

			for(int r=0;r<20;r++)
			{
				row=sh.createRow(r);

				cell=row.createCell(0);
				cell.setCellValue("Flower"+(r+1));
			}
			fout=new FileOutputStream("G:\\EXCEL\\Fruits1.xlsx");
			wb.write(fout);

		}
		catch(Exception e)
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
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}

