package com.sgtesting.tests;

public class ExecuteAutoItScript {

	public static void main(String[] args) {
		executeFile();
	}
	
	private static void executeFile()
	{
		try {
			// Runtime.getRuntime().exec("\"G:\\Git_Repository\\Autoit\\DisplayMessageWindow.exe\"");
		
			// note: .getRuntime() is purely a singleton concept so we accessing .exec() file 
			// (.exec() is a instance method if we elaborate the "Runtime.getRuntime().exec()"
			// it will exceute through classname obj=classname.static method and based on the 
			// object we execute the instance method (.exec()) file.
			
			Runtime obj=Runtime.getRuntime();
			obj.exec("\"G:\\\\Git_Repository\\\\Autoit\\\\DisplayMessageWindow.exe\"");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
