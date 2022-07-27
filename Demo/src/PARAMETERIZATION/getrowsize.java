package PARAMETERIZATION;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getrowsize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Sharda\\Desktop\\Book1.xlsx");
		int data = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(data + 1);
	
		

		
		
	}
}
