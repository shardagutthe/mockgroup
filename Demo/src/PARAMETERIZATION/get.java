package PARAMETERIZATION;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class get {
	
	public static void main(String[] args) throws IOException  {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Sharda\\Desktop\\Book1.xlsx");
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
	
	
	}

}
