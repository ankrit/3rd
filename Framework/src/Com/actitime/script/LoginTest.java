package Com.actitime.script;

import org.testng.annotations.Test;

import Com.actitime.generic.BaseLib;
import Com.actitime.generic.ExcelUtiities;
import Com.actitime.generic.ScreenshotLib;
import Com.actitime.generic.WaitStatementLib;
import Com.actitme.pageobject.EnterTimeTrackPage;
import Com.actitme.pageobject.LoginPage;

public class LoginTest extends BaseLib {
	

	@Test(priority=1)
	public void validLogin()
	{
		
		
		
		String filepath="E:\\eclipse\\Actittime\\testdata\\testdata.xlsx";
		String username=ExcelUtiities.readData(filepath,"Sheet1",1,1);
		String password = ExcelUtiities.readData(filepath,"Sheet1",1,2);
		LoginPage lp=new LoginPage(driver);
		lp.login(username, password);
		
		EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
		ettp.verifyLogo();
		ettp.verifyTitle(driver);
	}
		/**************************************************************************************/
		@Test(priority=2)
		public void invalidLogin()
		{
			String filepath="E:\\eclipse\\Actittime\\testdata\\testdata.xlsx";
			String username=ExcelUtiities.readData(filepath, "Sheet1", 2, 1);
			String password=ExcelUtiities.readData(filepath, "Sheet1", 2, 2);
			LoginPage lp=new LoginPage(driver);
			lp.login(username, password);
			
			WaitStatementLib.eWaitForVisible(driver, 20, lp.getInvalidLoginMsg());
			
			
			
			     lp.verifyInvalidLoginMsg();
			
			
			
			
		}
		
		
		
		
	}
	


























//bn.takeScreenshot(driver, "failed sreenshot");
