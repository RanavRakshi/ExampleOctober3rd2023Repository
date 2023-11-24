package com.sgtesting.excelfile;
// 1)Programmatically write 20 flower names in first sheet 1st column of an
// Excel file
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1ExcelTwentyFlowerNames {

	public static void main(String[] args) {

		twentyFlowers();
	}

	private static void twentyFlowers()
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

			// 1st row object
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue("Flower "+(i+1));
			}
			fout=new FileOutputStream("G:\\Excel\\Flowers.xlsx");
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
