package Com.VDOhire.generic;


import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	 
	 public WebDriver driver;
	 @BeforeMethod()
	 
	 @Parameters({"browser","url"})
	
	 
	 
	public String confiBrowser(String browser,String url) 
	{
		 if(browser.equalsIgnoreCase("firefox"))
		 {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinda\\eclipse-workspace\\VDOhire_\\exefiles\\geckodriver.exe");
	        driver =new FirefoxDriver();
	        Reporter.log("firefox launch", true);
	      
		 }
		 
	    else if (browser.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
		        driver =new ChromeDriver();
		        Reporter.log("Chrome launch", true);
		      //  driver.get(PropertyFiles.getPropertyValue("URL"));
		 }
		 
		 else if(browser.equalsIgnoreCase("ie"))
		 {
			 System.setProperty("webdriver.ie.driver", ".\\exefiles\\IEDriverServer.exe");
			 
		        driver=new InternetExplorerDriver();
		        Reporter.log("InternetExplorer launch", true);
		       // driver.get(PropertyFiles.getPropertyValue("URL"));
		 }
		 WaitStatementLib.implicitWaitForSecond(driver, 20);
		 driver.get(url);
		 driver.manage().window().maximize();
		// driver.navigate().to(url);
		 driver.navigate().refresh();
		 WaitStatementLib.implicitWaitForSecond(driver, 20);
		return url;
		 	 
		
	} 

	 @AfterMethod
	 
	 public void takeMethodName(ITestResult result) throws IOException
	 {
		 if (result.isSuccess())
		 {
			 System.out.println("Method passed");
		 }
		 else 
		 {
			String filename = result.getMethod().getMethodName();
			
			System.out.println("taking screenshot with methodName : " + filename);
	
	   
			ScreenShotLib scr=new ScreenShotLib();
			
			   scr.getScreenShotAs(driver, filename);
			   Reporter.log("screenshot captured",true);
    
}
		// driver.quit();
		 //Reporter.log("browser closed",true);
	 }

	
	 
}
		 
