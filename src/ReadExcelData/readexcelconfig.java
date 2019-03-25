package ReadExcelData;

import lib.exceldataconfig;

public class readexcelconfig {

public static void main(String args[])	{
	exceldataconfig excel = new exceldataconfig("D:\\EXCEL\\exceldata.xlsx");
	System.out.println(excel.getdata(1, 0, 0));
}
	
}
