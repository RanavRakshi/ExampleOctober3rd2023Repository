package com.sgtesting.excelfile;
/*3)There is an  Excel file it has 20 rows of student details that includes Fname,
Lname, CourseName, BranchName, Cityname, address, statename read  
this content and write it into a new Excel file*/
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q8ExcelManualTwentyStudentDetails {

	public static void main(String[] args) {
		
		studentDetails();
	}
	
	private static void studentDetails()
	{
		FileInputStream fin=null;
		Workbook wb1=null;
		Workbook wb2=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row rowsh1=null;
		Row rowsh2=null;
		Cell cellsh1=null;
		Cell cellsh2=null;
		FileOutputStream fout=null;
		
		try 
		{
			fin=new FileInputStream("G:\\EXCEL\\ManualStudentDetails.xlsx");
			wb1=new XSSFWorkbook(fin);
			wb2=new XSSFWorkbook();
			sh1=wb1.getSheet("Sheet1");
			
			sh2=wb2.getSheet("Sheet1");
			if(sh2==null)
			{
				sh2=wb2.createSheet("Sheet1");
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
						cellsh2=rowsh2.createCell(c);
					}
					String data=cellsh1.getStringCellValue();
					cellsh2.setCellValue(data);
				}
			}
			fout=new FileOutputStream("G:\\EXCEL\\ManualStudentDetailsNew.xlsx");
			wb2.write(fout);
			
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
				wb2.close();
				
			} catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
