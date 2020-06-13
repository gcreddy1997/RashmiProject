package Java_Programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOI_Code {
static int sum=0;
static int j=0;
static int sum1 = 0;

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\ApachePOI_Excel.xlsx");
		
	//	FileInputStream fis = new FileInputStream("‪C:\\Users\\DELL\\Desktop\\ApachePOI_Excel.xlsx");
		XSSFWorkbook rwb = new XSSFWorkbook(fis);
		XSSFSheet rsh = rwb.getSheet("Sheet1");
		//XSSFSheet rsh = rwb.getSheetAT(0);
		
		int nur = rsh.getPhysicalNumberOfRows();
		int nuc = rsh.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("nur :" + nur);
		System.out.println("nuc :" + nuc);
		
		for (int i=0; i<nur;i++){
			j= 0; sum =0;
			for ( j=0; j<nuc; j++){
				XSSFCell cell = rsh.getRow(i).getCell(j);
				//  String x = cell.getStringCellValue();
				// String x = rsh.getRow(i).getCell(j).getStringCellValue();
				// Data Formatter code
				DataFormatter  formatter = new DataFormatter();
				String x = formatter.formatCellValue(cell);
				sum = sum + Integer.parseInt(x);
				
			  }
			System.out.println(sum);
			
			
			XSSFCell cell1 = rsh.getRow(i).createCell(nuc);
			cell1.setCellValue(Integer.toString(sum));
		} 
		for (int i=0; i<nuc;i++){
			j= 0; sum =0;
			for ( j=0; j<nur; j++){
				XSSFCell cell = rsh.getRow(j).getCell(i);
				//  String x = cell.getStringCellValue();
				// String x = rsh.getRow(i).getCell(j).getStringCellValue();
				// Data Formatter code
				DataFormatter  formatter = new DataFormatter();
				String x = formatter.formatCellValue(cell);
				sum = sum + Integer.parseInt(x);
				
			  }
			System.out.println(sum);
						
			XSSFCell cell1 = rsh.getRow(nuc).createCell(i);
			cell1.setCellValue(Integer.toString(sum));
		}
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\DELL\\Desktop\\Rashmi.xlsx");
		rwb.write(fout);
	rwb.close();
	
	
	
	}

}
