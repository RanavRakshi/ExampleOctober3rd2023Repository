package com.sgtesting.tests.reflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Runner 
{
	public static void main(String[] args)
	{
		executeMethods();
	}
	
	private static void executeMethods()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try {
			fin=new FileInputStream(".\\datafiles\\Data_Runner.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodName=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgClassName=cell.getStringCellValue();
				System.out.println(methodName+"   -->"+pkgClassName);
				
				//create object dynamically
				Class objClass=Class.forName(pkgClassName);
				Object obj=objClass.getConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodName, null);
				method.invoke(obj, null);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally 
		{
			try {
				fin.close();
				wb.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
