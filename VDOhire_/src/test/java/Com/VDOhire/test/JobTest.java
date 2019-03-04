
package Com.VDOhire.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import Com.VDOhire.generic.BasicExtentReport;
import Com.VDOhire.generic.ExcelUtility;
import Com.VDOhire.generic.HighLighter;
import Com.VDOhire.generic.WaitStatementLib;
import Com.VDOhire.pom.ApplicantsPage;
import Com.VDOhire.pom.DeleteInterviewSetAndJob;
import Com.VDOhire.pom.InterviewTabPage;
import Com.VDOhire.pom.JobConfigTabPage;
import Com.VDOhire.pom.JobPage;
import Com.VDOhire.pom.LoginPage;
import Com.VDOhire.pom.ManageAssessmentSetsPage;
import Com.VDOhire.pom.RecruiterPage;
import Com.VDOhire.pom.RecruiterSetUpPage;
import Com.VDOhire.pom.ReportPage;
import Com.VDOhire.pom.SendInvitationsPage;


public class JobTest extends BasicExtentReport
{
	
	//public WebDriver driver;
	
	@Test
	public void logInforJobCreation() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException, InterruptedException, FindFailed 
	{
	
		test = extent.createTest("logInWithPositiveValue", "PASSED test case");
		
		 LoginPage login= new  LoginPage(driver);
		
		 Thread.sleep(2000l);
		
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
	Thread.sleep(3000l);
	
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
	
	Thread.sleep(2000l);
	job.createJobInMainTab(driver,title,country,city);
	
	job.SalarytoandFrom(driver,salaryfrom,salaryto);
	
	job.SecondSideField(driver, jobid, vacancy, qualification,notice );
	
//	job.ScrollInjob(driver);
	
	JobConfigTabPage config=new JobConfigTabPage(driver);
	Thread.sleep(5000l);
	config.setUpJobType(driver);
	
	
	
	String setname = ExcelUtility.getExcelSheet(excelpath, "Shashank", 16, 1);
	String noofque = ExcelUtility.getExcelSheet(excelpath, "Shashank", 16, 2);
	
	String setname2 = ExcelUtility.getExcelSheet(excelpath, "Shashank", 16, 3);
	
	InterviewTabPage interview=new InterviewTabPage(driver);
	Thread.sleep(1000l);
	  interview.setUpInterview(driver,setname, noofque, setname2);
	
	  
	  String setname1 = ExcelUtility.getExcelSheet(excelpath, "Shashank", 19, 1);
	  String duration = ExcelUtility.getExcelSheet(excelpath, "Shashank", 19, 2);
	  noofque=  ExcelUtility.getExcelSheet(excelpath, "Shashank", 19, 3);
	  String setque2 = ExcelUtility.getExcelSheet(excelpath, "Shashank", 19, 4);
	  String selectType = ExcelUtility.getExcelSheet(excelpath, "Shashank", 19, 5);
	  
//	  ExcelUtility.getExcelSheet(excelpath, "Shashank", 16, 1);
//	  ExcelUtility.getExcelSheet(excelpath, "Shashank", 16, 1);
	
	  ManageAssessmentSetsPage manage=new ManageAssessmentSetsPage(driver);
	  
	  Thread.sleep(1000l);
	  manage.setTheAssessmentTypeQue(driver, setname1, duration, noofque, setque2, selectType);
	
	
	
	
	  //String RecruiterEmailID = ExcelUtility.getExcelSheet(excelpath, "Shashank", 16, 1);
	  Thread.sleep(1000l);
	  RecruiterSetUpPage recu=new RecruiterSetUpPage(driver);
	
	recu.setUpRecruiter(driver);
	
/*************************************/	
	
	 SendInvitationsPage si=new SendInvitationsPage(driver);
		
	 
		Thread.sleep(1000l);
//		   si.SendInvitation(driver);
//		   Thread.sleep(2000l);
		   si.InviteUsers(driver);
		 
		   
/******  use sikuli for desktop app  ************/
		   
		   Screen src=new Screen();
		   
		  org.sikuli.script.Pattern pattern=new org.sikuli.script.Pattern("C:\\Users\\vinda\\git\\shashank\\VDOhire_\\ScreenshotForSikuli\\filename.PNG");
	
		   org.sikuli.script.Pattern openbtn=new org.sikuli.script.Pattern("C:\\Users\\vinda\\git\\shashank\\VDOhire_\\ScreenshotForSikuli\\open.PNG");
			
				src.type(pattern,"C:\\Users\\vinda\\Desktop\\test1.csv");
			
			 WaitStatementLib wait=new WaitStatementLib();
				
				wait.implicitWaitForSecond(driver, 20); 
			 
				
			  src.click(openbtn);
			  
			  Thread.sleep(1000l);
			  si.SendInvitedBtn(driver);
			  
/******  end sikuli code for desktop app  ************/			  
		  	   
	
			  DeleteInterviewSetAndJob delete=new DeleteInterviewSetAndJob(driver);
			  delete.deleteJobAndDettachInterviewSet(driver);
			  
			  Thread.sleep(2000l);
			  String Name = ExcelUtility.getExcelSheet(excelpath, "Shashank", 22, 1);
			  String mobileno = ExcelUtility.getExcelSheet(excelpath, "Shashank", 22, 2);
			  String emailid = ExcelUtility.getExcelSheet(excelpath, "Shashank", 22, 3);
			  
			  RecruiterPage re=new RecruiterPage(driver);
			   re.createRecruiter(driver,Name, mobileno, emailid);
			   
//			   ApplicantsPage appli=new ApplicantsPage(driver);
//			   appli.ApplicantspageCheck(driver);
			   
			   Thread.sleep(2000l);
			   ReportPage report=new ReportPage(driver);
			   report.reporttab(driver);
	
	}	
}
