package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataconfig {
	FileInputStream fs;
	XSSFWorkbook wb;
	XSSFSheet shhet1;

	public exceldataconfig(String excelpath) {
		try {
			File src = new File(excelpath);
			FileInputStream fs = new FileInputStream(src);
			wb = new XSSFWorkbook(fs);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getdata(int sheetno, int row, int column) {
		shhet1 = wb.getSheetAt(sheetno);
		String data = shhet1.getRow(row).getCell(column).getStringCellValue();
		return data;

	}

}
