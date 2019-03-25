package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexcel2 {
public static void main(String[] args) throws Exception {
		
		File src = new File("D:\\EXCEL\\exceldata.xlsx");
		FileInputStream fs = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
	
	XSSFSheet sheet1 = wb.getSheetAt(0);
	int rowcount = sheet1.getLastRowNum();
	
	System.out.println("Toatal no of rows is  "+rowcount);
	
	for(int i=0;i<rowcount;i++)
	{
		String data  =sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Test data from excel is  "+data);
	}
	
	
}
}