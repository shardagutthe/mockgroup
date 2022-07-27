package PARAMETERIZATION;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Celltype1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\Sharda\\Desktop\\Book1.xlsx");
		Cell sh = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0);
		CellType ex = sh.getCellType();
		
		if(ex==CellType.STRING) {
			System.out.println(sh.getStringCellValue());
		}
		else if(ex==CellType.BOOLEAN) {
			System.out.println(sh.getBooleanCellValue());
		}
		else if(ex==CellType.NUMERIC)
			System.out.println(sh.getNumericCellValue());
		
	}
}
