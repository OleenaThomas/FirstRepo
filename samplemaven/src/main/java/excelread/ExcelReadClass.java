package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadClass {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	public static String getStringData(int a, int b) throws IOException {
		f=new FileInputStream("/Users/oleenathomas/Downloads/ExcelReadJavaSample.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow row=s.getRow(a);
		XSSFCell cell=row.getCell(b);
		return cell.getStringCellValue();
	}
	public static int getIntegerData(int a, int b) throws IOException {
		f=new FileInputStream("/Users/oleenathomas/Downloads/ExcelReadJavaSample.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow row=s.getRow(a);
		XSSFCell cell=row.getCell(b);
		return (int) cell.getNumericCellValue();
	}
	
	public static void main(String[] args) throws IOException {	
		System.out.println(getStringData(0,0));
		System.out.println(getStringData(0,1));
		System.out.println(getStringData(1,0));
		System.out.println(getStringData(2,0));
		System.out.println(getStringData(3,0));
		
		System.out.println(getIntegerData(1,1));
		System.out.println(getIntegerData(2,1));
		System.out.println(getIntegerData(3,1));
	}

}
