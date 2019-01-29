package Com.VDOhire.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFiles{
 
	
	
	
	public static String filepath="C:\\Users\\vinda\\eclipse-workspace\\VDOhire_\\Properties\\config.properties";
	
	public static String getPropertyValue( String URL) throws FileNotFoundException
	{
			
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream(new File(filepath));
		  
		
		 try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 prop.getProperty(URL);
		 //prop.getProperty(filepath);
			
		return null;
		
	}

}
