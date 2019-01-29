package Com.VDOhire.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ExcelUtility {

	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet ;
	static String excelpath="C:\\Users\\vinda\\eclipse-workspace\\VDOhire_\\ExcelSheet\\testdata.xlsx";

	public static String getExcelSheet(String excelpath,String Sheetname, int Rowname, int Cellname) throws EncryptedDocumentException, FileNotFoundException, IOException, InvalidFormatException 
	{

	
		workbook = new XSSFWorkbook(excelpath);
		sheet = workbook.getSheet(Sheetname);

		String cellData = sheet.getRow(Rowname).getCell(Cellname).getStringCellValue();
		   
			return cellData;

		/**	File file=new File(excelpath);
		FileInputStream fis=new FileInputStream(file);

			Workbook factory = WorkbookFactory.create(fis);

			   Sheet sheet = factory.getSheet(Sheetname);
			                Row row = sheet.getRow(Rowname);
			                Cell cell = row.createCell(Cellname);
			                String value = cell.getStringCellValue();

			                 System.out.println(value);   **/



	}

}
