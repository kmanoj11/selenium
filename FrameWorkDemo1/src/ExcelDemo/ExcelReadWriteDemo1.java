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

public class ExcelReadWriteDemo1 
{
	@Test
	public void ExcelReadDemo() throws IOException
	{
		FileInputStream fileinput = new FileInputStream("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemo\\Book1.xlsx");
		Workbook book = new XSSFWorkbook(fileinput);
		Sheet sheet = book.getSheet("TestData");
		Row row =sheet.getRow(1);
		int firstrowno = sheet.getFirstRowNum();
		System.out.println("firstrowno :"+firstrowno);
		int lastrowno =   sheet.getLastRowNum();
		System.out.println("lastrowno :"+lastrowno);
		int   firstcellno = row.getFirstCellNum();
		System.out.println("firstcellno :"+firstcellno);
		int lastcellno = row.getLastCellNum();
		System.out.println("lastcellno :"+lastcellno);

	}

}
