package Com.actitime.script;


import org.testng.annotations.Test;

import Com.actitime.generic.BaseLib;
import Com.actitime.generic.ExcelUtiities;
import Com.actitme.pageobject.ActiveProjCustPage;
import Com.actitme.pageobject.CreateNewCustPage;
import Com.actitme.pageobject.CreateNewProject;
import Com.actitme.pageobject.EditCustomerInfoPage;
import Com.actitme.pageobject.EnterTimeTrackPage;
import Com.actitme.pageobject.LoginPage;
import Com.actitme.pageobject.OpenTaskPage;

public class TaskTest extends BaseLib
{
	@Test
	public void createCustomer()
	{
		String filePath="E:\\eclipse\\Actittime\\testdata\\testdata.xlsx";
		 String username = ExcelUtiities.readData(filePath,"Sheet1",3,1);
		String password = ExcelUtiities.readData(filePath,"Sheet1",3,2);
		 
				
				
				
				
				LoginPage lp=new LoginPage(driver);
				 lp.login(username, password);
				 
				 EnterTimeTrackPage ettp=new  EnterTimeTrackPage(driver);
				 ettp.clickTasks();
				 
				 OpenTaskPage otp=new  OpenTaskPage(driver);
				 otp.clickOnProjNCustLink();
				 
				 ActiveProjCustPage apcp=new ActiveProjCustPage(driver);
				apcp.clickOnCreateCustBtn();
				
				String customerName = ExcelUtiities.readData(filePath,"Sheet1",3,3);
				
				
				
				CreateNewCustPage cncp= new CreateNewCustPage(driver);
				
				cncp.createCustomer(customerName);
				apcp.verifyCreateNewCustMsg(customerName);
				apcp.clickOnLogout();
	}
	@Test(dependsOnMethods= {"createCustomer"})
	public void deleteCustomer()
	{
		String filePath="E:\\eclipse\\Actittime\\testdata\\testdata.xlsx";
		
		String username = ExcelUtiities.readData(filePath,"Sheet1",4,1);
		String password = ExcelUtiities.readData(filePath,"Sheet1",4,2);
		LoginPage lp=new LoginPage(driver);
		
		lp.login(username, password);
		EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
		ettp.clickTasks();
		OpenTaskPage otp=new OpenTaskPage(driver);
		otp.clickOnProjNCustLink();
		
		    String customerName = ExcelUtiities.readData(filePath,"Sheet1",4,3);
		 ActiveProjCustPage apcp=new  ActiveProjCustPage(driver);
		 apcp.showCustomer(customerName);
		 EditCustomerInfoPage ecip=new  EditCustomerInfoPage(driver);
		 ecip.deleteCustomer();
		 apcp.verifyDeleteCustMsg();
		 apcp.clickOnLogout();
		 
				
	}
	  @Test(dependsOnMethods= {"createCustomer","deleteCustomer"})
	   public void CreateNeewProject()
	   {
		  String filepath="E:\\eclipse\\Actittime\\testdata\\testdata.xlsx"; 
		 String username = ExcelUtiities.readData(filepath, "Sheet1", 3, 1);
		 String password = ExcelUtiities.readData(filepath, "Sheet1", 3, 2);
		 
		 LoginPage lp=new LoginPage(driver);
		   lp.login(username, password);
		   
		   EnterTimeTrackPage et=new EnterTimeTrackPage(driver);
		   et.clickTasks();
		   
		   OpenTaskPage op=new OpenTaskPage(driver);
		   op.clickOnProjNCustLink();
		   
		   ActiveProjCustPage at=new ActiveProjCustPage(driver);
		   at.clickOnCreateCustBtn();
		   
		 String createcustname = ExcelUtiities.readData(filepath, "Sheet1", 3, 3);
		     
		 CreateNewCustPage cp=new CreateNewCustPage(driver);
		    cp.createCustomer(createcustname);
		    
		    
		    CreateNewProject cnp=new CreateNewProject(driver, createcustname);
		  
		     String createproj = ExcelUtiities.readData(filepath, "Sheet1", 5, 4);
		     
		    // cnp.ProjectName(createproj);
		    // cnp.createNewProject(createproj);
		     
		    	    
	   }

}
	  
		  
	  
	 
	  
	  
	  
	  
	  
	  

