package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {

		
		File src = new File("D:\\EXCEL\\login.xlsx");
		FileInputStream fs = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet shhet1= wb.getSheetAt(0);
		
	String data =	shhet1.getRow(1).getCell(0).getStringCellValue();
	System.out.println("Data from excel is  "+data);
	String data1 =	shhet1.getRow(1).getCell(1).getStringCellValue();
	System.out.println("Data from excel is  "+data1);
	
	System.out.println("");
	
	String data2 =	shhet1.getRow(2).getCell(0).getStringCellValue();
	System.out.println("Data from excel is  "+data2);
	String data3 =	shhet1.getRow(2).getCell(1).getStringCellValue();
	System.out.println("Data from excel is  "+data3);
	
	System.out.println("");
	
	String data4 =	shhet1.getRow(3).getCell(0).getStringCellValue();
	System.out.println("Data from excel is  "+data4);
	String data5 =	shhet1.getRow(3).getCell(1).getStringCellValue();
	System.out.println("Data from excel is  "+data5);
	System.out.println("");
	
	String data6 =	shhet1.getRow(4).getCell(0).getStringCellValue();
	System.out.println("Data from excel is  "+data6);
	String data7 =	shhet1.getRow(4).getCell(1).getStringCellValue();
	System.out.println("Data from excel is  "+data7);
	
	wb.close();

	}

}
