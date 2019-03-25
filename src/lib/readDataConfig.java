package lib;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readDataConfig {
	FileInputStream fs;
	XSSFWorkbook wb;
	

	public readDataConfig(String excelpath) {

		try {
			File src = new File(excelpath);
			FileInputStream fs = new FileInputStream(src);
			wb = new XSSFWorkbook(fs);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getdata(int  sheetno,int row,int column){
		XSSFSheet shhet1 = wb.getSheetAt(sheetno);
		String data = shhet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	
	public List<String> getRowData(int sheetno, int rownum, int startCol, int endCol){
		
		XSSFSheet sheet = wb.getSheetAt(sheetno);
		
		List<String> list = new ArrayList<>();
		
		XSSFRow row = sheet.getRow(rownum);
		
		for(int i= startCol ; i<= endCol; i++){
			String cellVal = row.getCell(i).getStringCellValue();
			list.add(cellVal);
		}
		
		return list;
		
	}
	
}
