package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("D:\\EXCEL\\exceldata.xlsx");
		FileInputStream fs = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet shhet1= wb.getSheetAt(0);
	String data =	shhet1.getRow(0).getCell(0).getStringCellValue();
	System.out.println("Data from excel is  "+data);
	String data1 =	shhet1.getRow(0).getCell(1).getStringCellValue();
	System.out.println("Data from excel is  "+data1);
	wb.close();

	}

}
