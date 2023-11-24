package com.sgtesting.excelfile;
// 2)Programmatically write 20 fruit names in sheet1 10th row.
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q2ExcelTwentyFruitNames 
{

	public static void main(String[] args) 
	{
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
			sh=wb.createSheet("Sheet1");
			
			// 10th row object
			row=sh.createRow(9);
			String[] fruits = {
                    "Apple", "Banana", "Orange", "Grapes", "Mango",
                    "Pineapple", "Strawberry", "Watermelon", "Kiwi", "Cherry",
                    "Blueberry", "Peach", "Pear", "Plum", "Raspberry",
                    "Cranberry", "Avocado", "Pomegranate", "Coconut", "Lemon"
            };
			for(int i=0;i<fruits.length;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue(fruits[i]);
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
