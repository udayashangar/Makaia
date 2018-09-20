package practise;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		//public void writeExcel() throws IOException {
			
			XSSFWorkbook wBook = new XSSFWorkbook();
			XSSFSheet sheet = wBook.createSheet("TC001");
			XSSFRow row = sheet.createRow(0);
			XSSFCell cell = row.createCell(0);
			cell.setCellValue("All the Best to Everyone");
			
			FileOutputStream fos = new FileOutputStream("./data/writeExcel.xlsx");
			wBook.write(fos);
			wBook.close();
			fos.close();
			
		}
	}


