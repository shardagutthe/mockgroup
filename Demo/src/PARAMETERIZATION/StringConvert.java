package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StringConvert {  //change data in excel sheet(fkt int asel tr ' compulsory and abc(char asel tr ' not compulsory)
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Sharda\\Desktop\\Book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String data = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		
	}

}
