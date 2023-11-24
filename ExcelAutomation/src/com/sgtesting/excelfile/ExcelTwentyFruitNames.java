package com.sgtesting.excelfile;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTwentyFruitNames {

	public static void main(String[] args) {
		twentyFruits();

	}
	
	private static void twentyFruits()
	{
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		FileOutputStream fout=null;
		
		try 
		{
			wb=new XSSFWorkbook();
			sh=wb.getSheet("Sheet1");
			
			// 10th row object
			row=sh.createRow(10);
			for(int i=0;i<10;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue("Fruit"+(i+1));
			}
			fout=new FileOutputStream("G:\\EXCEL\\Fruits.xlsx");
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
