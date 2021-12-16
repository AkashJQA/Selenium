package org.readexcelfile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadExcel {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis= new  FileInputStream("E:\\TestNewdata.xlsx\"");
		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
