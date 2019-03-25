package ReadExcelData;

import java.util.List;

import lib.readDataConfig;

public class ReadMain {

	public static void main(String[] args) {

		
		readDataConfig Data = new readDataConfig("D:\\EXCEL\\login.xlsx");
		String output = Data.getdata(0, 1, 0);
		System.out.println(output);
		String output1 = Data.getdata(0, 1, 1);
		System.out.println(output1);
		String output2 = Data.getdata(0, 2, 0);
		System.out.println(output2);
		String output3 = Data.getdata(0, 2, 1);
		System.out.println(output3);
		String output4 = Data.getdata(0, 3, 0);
		System.out.println(output4);
		String output5 = Data.getdata(0, 3, 1);
		System.out.println(output5);
		String output6 = Data.getdata(0, 4, 0);
		System.out.println(output6);
		String output7 = Data.getdata(0, 4, 1);
		System.out.println(output7);
		
		
		
		
		List<String> list = Data.getRowData(0, 1, 0, 2);
		System.out.println();
		
		
		for(String col : list){
			System.out.println(col);
		}
		
		
		
	}
	
}
