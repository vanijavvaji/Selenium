package ReadExcelData;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeData {

	public static void main(String[] args) throws IOException, Throwable {
      

		File src = new File("D:\\EXCEL\\login.xlsx");
		FileInputStream fs = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet shhet1= wb.getSheetAt(0);
		XSSFSheet sheet2= wb.getSheetAt(1);
		Robot robot = new Robot();
		//robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		shhet1.getRow(1).createCell(2).setCellValue(true);
		shhet1.getRow(2).createCell(2).setCellValue(false);
		shhet1.getRow(3).createCell(2).setCellValue(false);
		shhet1.getRow(4).createCell(2).setCellValue(false);
		FileOutputStream fos = new FileOutputStream(src);
		wb.write(fos);
		sheet2.getRow(1).createCell(2).setCellValue(true);
		sheet2.getRow(2).createCell(2).setCellValue(false);
		sheet2.getRow(3).createCell(2).setCellValue(false);
		sheet2.getRow(4).createCell(2).setCellValue(false);
		FileOutputStream fos1 = new FileOutputStream(src);
			
		wb.write(fos1);
		wb.close();
		
		
		
	}

}
