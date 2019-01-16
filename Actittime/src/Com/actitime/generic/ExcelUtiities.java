package Com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Ankrit
 * review Diganta sir
 * created on 7/06/2018
 */




public class ExcelUtiities
{
/**
 * description readdata from excel sheet	
 * @param FilePath
 * @param sheet
 * @param row
 * @param cell
 * @return String
 * @throws IOException 
*/
	public static String readData(String FilePath,String sheet,int row,int cell) 
	{
		String value=null;
		try
		{
		 Workbook wb = WorkbookFactory.create(new FileInputStream(new File(FilePath)));
		 value=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		
		catch(EncryptedDocumentException e)
		{
		e.printStackTrace();	
		}
		
		catch(InvalidFormatException e)
		{
			e.printStackTrace();		
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();		
		}
		catch( IOException e)
		{
		e.printStackTrace();
		}
		
		 
		 return value;
			
	}
	}



