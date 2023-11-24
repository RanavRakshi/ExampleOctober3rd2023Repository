package com.sgtesting.excelfile;
//3)Programmatically write 12-month names in a 1st sheet diagonally.
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q3ExcelTwelveMonthsNameDiagonally {

	public static void main(String[] args) {

		twelveMonths();
	}

	private static void twelveMonths()
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
			for(int i=0;i<12;i++)
			{
				row=sh.createRow(i);
				for(int j=i;j<=i;j++)
				{
					cell=row.createCell(j);
					cell.setCellValue("Months"+(i+1));
				}
			}
			fout=new FileOutputStream("G:\\EXCEL\\Months.xlsx");
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
