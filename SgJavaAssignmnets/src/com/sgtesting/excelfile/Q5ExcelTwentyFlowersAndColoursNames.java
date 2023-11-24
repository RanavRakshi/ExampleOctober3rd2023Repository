package com.sgtesting.excelfile;
//5)Programmatically write 20 flower names and 20 color names in 1st sheet , 
// 1st and 2nd column of an Excel file.
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q5ExcelTwentyFlowersAndColoursNames {

	public static void main(String[] args) {

		flowerAndColours();
	}

	private static void flowerAndColours()
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
				cell=row.createCell(0);
				cell.setCellValue("Flowers"+(i+1));

				cell=row.createCell(1);
				cell.setCellValue("Colour"+(i+1));	
			}
			fout=new FileOutputStream("G:\\EXCEL\\FlowAndCol.xlsx");
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
