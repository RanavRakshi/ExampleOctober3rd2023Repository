package com.sgtesting.excelfile;
//1)	There is an Excel file in sheet1, 1st column it has 20 state names, 
//  read the content and write it into a 2nd sheet 10th column
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q6ExcelMAnualTwentyStateNames {

	public static void main(String[] args) {
		
		manualStates();
	}
	
	private static void manualStates()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row rowsh1=null;
		Row rowsh2=null;
		Cell cellsh1=null;
		Cell cellsh2=null;
		FileOutputStream fout=null;
		
		try 
		{
			fin=new FileInputStream("G:\\EXCEL\\ManualState.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			
			sh2=wb.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("Sheet2");
			}
			int rc=sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				rowsh1=sh1.getRow(r);
				rowsh2=sh2.getRow(r);
				if(rowsh2==null)
				{
					rowsh2=sh2.createRow(r);
				}
				int cc=rowsh1.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cellsh1=rowsh1.getCell(c);
					cellsh2=rowsh2.getCell(c);
					if(cellsh2==null)
					{
						cellsh2=rowsh2.createCell(9);
					}
					String data=cellsh1.getStringCellValue();
					cellsh2.setCellValue(data);
				}
			}
			fout=new FileOutputStream("G:\\EXCEL\\ManualState.xlsx");
			wb.write(fout);
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fin.close();
				fout.close();
				wb.close();
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
