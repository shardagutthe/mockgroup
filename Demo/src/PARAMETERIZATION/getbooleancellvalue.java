package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getbooleancellvalue {//for O/P we need to enter true/false value in cell compulsory
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Sharda\\Desktop\\Book1.xlsx");
		boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
		System.out.println(data);
	}

}
