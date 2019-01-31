package Com.VDOhire.test;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Screencast;

import Com.VDOhire.generic.BaseClass;
import Com.VDOhire.generic.BasicExtentReport;
import Com.VDOhire.generic.ExcelUtility;
import Com.VDOhire.generic.PropertyFiles;
import Com.VDOhire.generic.WaitStatementLib;
import Com.VDOhire.pom.GmailVerifyPage;
import Com.VDOhire.pom.LoginPage;
import Com.VDOhire.pom.SendInvitationsPage;

public class LoginTest extends BasicExtentReport  
{
   
	//@Test(priority=1)
	
	        /**********login on vdohire with valid username and password************/
	
	public void logInWithPositiveValue() throws EncryptedDocumentException, FileNotFoundException, IOException, InvalidFormatException, InterruptedException, FindFailed
	{
		 test = extent.createTest("logInWithPositiveValue", "PASSED test case");
		
		LoginPage login= new  LoginPage(driver);
		
		 login.LoginForEmpButton();
		 
		 String excelpath="C:\\Users\\vinda\\eclipse-workspace\\VDOhire_\\ExcelSheet\\testdata.xlsx";
		
		String username = ExcelUtility.getExcelSheet(excelpath, "Shashank", 1, 1);
		
		String password = ExcelUtility.getExcelSheet(excelpath, "Shashank", 1, 2);
		
		
		 login.getLoginPage(username, password);		
		
		 login.varifyWithAssert(driver);
		 
		 SendInvitationsPage si=new SendInvitationsPage(driver);
		
		 
		Thread.sleep(2000l);
		   si.SendInvitation(driver);
		   Thread.sleep(2000l);
		   si.InviteUsers(driver);
		 
		   
/******  use sikuli for desktop app  ************/
		   
		   Screen src=new Screen();
		   
		  org.sikuli.script.Pattern pattern=new org.sikuli.script.Pattern("C:\\Users\\vinda\\Desktop\\filename.PNG");
	
		   org.sikuli.script.Pattern openbtn=new org.sikuli.script.Pattern("C:\\Users\\vinda\\Desktop\\open.PNG");
			 src.type(pattern,"C:\\Users\\vinda\\Desktop\\test1.csv");
			 WaitStatementLib wait=new WaitStatementLib();
				
				wait.implicitWaitForSecond(driver, 20); 
			 
			
			  src.click(openbtn);
			  
			  Thread.sleep(2000l);
			  si.SendInvitedBtn(driver);
			  
 /******  end sikuli code for desktop app  ************/			  
		  	   
		 Assert.assertTrue(true);
		   		 
	}
	
	/**********login on vdohire with Invalid username and password
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * 
	 * @throws EncryptedDocumentException 
	 * @throws InvalidFormatException ****/
	
	
	//@Test(priority=2)
	
	public void logInWithInvalidvalue() throws EncryptedDocumentException, FileNotFoundException, IOException, InvalidFormatException 
	{

		 test = extent.createTest("logInWithInvalidvalue", "PASSED test case");
		 
		WaitStatementLib wait=new WaitStatementLib();
		
		wait.implicitWaitForSecond(driver, 20);
		   
		LoginPage login= new  LoginPage(driver);
		
		
		
		    login.LoginForEmpButton();
		    
		    String excelpath="C:\\Users\\vinda\\eclipse-workspace\\VDOhire_\\ExcelSheet\\testdata.xlsx";
		    
		 String username = ExcelUtility.getExcelSheet(excelpath,"Shashank", 2, 1);
		  String password = ExcelUtility.getExcelSheet(excelpath,"Shashank", 2, 2); 
		   
		   login.getLoginPage(username, password);
		   
		   login.verifyInvalidErrormsg(driver);
		   
		   Assert.assertTrue(true);
	}
	
	@Test(priority=3)
	
	public void verifyGmailAC() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, InterruptedException
	{
		 test = extent.createTest("verifyGmailAC", "PASSED test case");
		driver.get("https://www.gmail.com");
		
		 String excelpath="C:\\Users\\vinda\\eclipse-workspace\\VDOhire_\\ExcelSheet\\testdata.xlsx";
		 
		String username = ExcelUtility.getExcelSheet(excelpath,"Shashank",3, 1);
		String password = ExcelUtility.getExcelSheet(excelpath,"Shashank",3, 2);
		
		GmailVerifyPage  gmail=new GmailVerifyPage(driver);
		
		
		
		gmail.loginOnuser(driver, username);
		
		Thread.sleep(2000l);
		
		
		gmail.loginWithpass(driver, password);
		

		
		
		
		
		 Assert.assertTrue(true);
	}

}
