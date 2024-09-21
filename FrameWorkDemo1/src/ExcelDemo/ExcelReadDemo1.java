package ExcelDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadDemo1 
{
	@Test
	public void ExcelReadDemo() throws IOException
	{
		FileInputStream fileinput = new FileInputStream("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemo\\Book1.xlsx");
		Workbook book = new XSSFWorkbook(fileinput);
		Sheet sheet = book.getSheet("TestData");
		 Row row =sheet.getRow(0);
		Cell cell =  row.getCell(0);
		String celldata = cell.getStringCellValue();
		System.out.println("celldata :"+celldata);
		
	}

}
