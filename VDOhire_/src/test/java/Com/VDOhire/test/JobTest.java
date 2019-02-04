
package Com.VDOhire.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import Com.VDOhire.generic.BasicExtentReport;
import Com.VDOhire.generic.ExcelUtility;
import Com.VDOhire.generic.HighLighter;
import Com.VDOhire.generic.WaitStatementLib;
import Com.VDOhire.pom.JobPage;
import Com.VDOhire.pom.LoginPage;


public class JobTest extends BasicExtentReport
{
	
	//public WebDriver driver;
	
	@Test
	public void logInforJobCreation() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, InterruptedException 
	{
	
		test = extent.createTest("logInWithPositiveValue", "PASSED test case");
		
		 LoginPage login= new  LoginPage(driver);
		
		 Thread.sleep(5000l);
		
		 login.LoginForEmpButton();
		 
		 String excelpath="C:\\Users\\vinda\\git\\shashank\\VDOhire_\\ExcelSheet\\testdata1.xlsx";
				
		 	String username = ExcelUtility.getExcelSheet(excelpath, "Shashank", 1, 1);
			
		 	String password = ExcelUtility.getExcelSheet(excelpath, "Shashank", 1, 2);
		
		
		
		 login.getLoginPage(username, password);		
			
	
	 login.varifyWithAssert(driver);
	 
	//Thread.sleep(50000l);
	WaitStatementLib.implicitWaitForSecond(driver, 20);
	
	//WaitStatementLib.getWaitStatementforExplicitvisibility(driver,jobBtn,20);
	
	JobPage job=new JobPage(driver);
	job.clickJobtab(driver);
	
	/******Creating Job in main Tab*********/
	
	System.out.println("Start Creating Job in main Tab");
	
	 //String excelpath1="C:\\Users\\vinda\\eclipse-workspace\\VDOhire_\\ExcelSheet\\testdata.xlsx";
	Thread.sleep(8000l);
	
	String title=null;
	String country =null;
	String city =null;
	String salaryfrom =null;
	String salaryto =null;
	String jobid=null;
	String vacancy=null;
	String notice=null;
	String qualification=null;
	
	try {
		
	
	 title = ExcelUtility.getExcelSheet(excelpath, "Shashank", 13, 0);
	 country = ExcelUtility.getExcelSheet(excelpath, "Shashank", 13, 7);
	 city = ExcelUtility.getExcelSheet(excelpath, "Shashank", 13, 8);
	salaryfrom= ExcelUtility.getExcelSheet(excelpath, "Shashank", 13, 1);
	salaryto= ExcelUtility.getExcelSheet(excelpath, "Shashank", 13, 2);
	
	 jobid = ExcelUtility.getExcelSheet(excelpath, "Shashank", 13, 4);
	 vacancy = ExcelUtility.getExcelSheet(excelpath, "Shashank", 13, 5);
	 notice = ExcelUtility.getExcelSheet(excelpath, "Shashank", 13, 6);
	 qualification = ExcelUtility.getExcelSheet(excelpath, "Shashank", 13, 9);
	
	
	
	 
	}
	catch(NullPointerException e)
	{
		
	}
//	System.out.println(title);
//	System.out.println(country);
//	 System.out.println(city);
//	 System.out.println(salaryfrom);
//	 System.out.println(salaryto);
//	 System.out.println(qualification);
//	 System.out.println(notice);

	 
	//String title1 = ExcelUtility.getExcelSheet(excelpath, "Shashank", 13, 1);
	
	Thread.sleep(3000l);
	job.createJobInMainTab(driver,title,country,city);
	
	job.SalarytoandFrom(driver,salaryfrom,salaryto);
	
	job.SecondSideField(driver, jobid, vacancy, qualification,notice );
	
	}	
}
