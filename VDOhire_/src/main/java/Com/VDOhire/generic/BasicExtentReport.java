package Com.VDOhire.generic;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Com.VDOhire.test.LoginTest;

import org.testng.annotations.Parameters;

import com.aventstack.extentreports.reporter.configuration.ChartLocation;

public class BasicExtentReport extends BaseClass
{
	
	//builds a new report using the html template 


	public static ExtentHtmlReporter htmlReporter;
    
   public static ExtentReports extent;
    
    //helps to generate the logs in test report.
    public static ExtentTest test;
    
    @Parameters({ "OS", "browser" })
    
    @BeforeSuite
    
    public void startReport(String OS, String browser) {
    	
    	// initialize the HtmlReporter
       htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
       // htmlReporter = new ExtentHtmlReporter(System.getProperty("./test-output/testReport.html"));
        
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
         
        //To add system or environment info by using the setSystemInfo method.
        extent.setSystemInfo("OS", OS);
        extent.setSystemInfo("Browser", browser);
        
        //configuration items to change the look and feel
        //add content, manage tests etc
        
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("VDO!hire Report Demo");
        htmlReporter.config().setReportName("Test Report of VDO!hire");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }
    
//    @Test(enabled=false)
//    public void testCase2() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException {
//        test = extent.createTest("logInWithInvalidvalue", "PASSED test case");
//        	
//        login.logInWithInvalidvalue();
//        Assert.assertTrue(true);
//    }
//    
//    @Test(enabled=false)
//    public void testCase3() {
//        test = extent.createTest("Test Case 3", "PASSED test case");
//        Assert.assertTrue(true);
//    }
//     
//    @Test(enabled=false)
//    public void testCase4() {
//        test = extent.createTest("Test Case 4", "PASSED test case");
//        Assert.assertTrue(false);
//    }
//     
//    @Test(enabled=false)
//    public void testCase5() {
//        test = extent.createTest("Test Case 5", "SKIPPED test case");
//        throw new SkipException("Skipping this test with exception");
//    }
//    
//    @Test(enabled=false)
//    
//	public void testCase6(){
//			test = extent.createTest("Test Case 6", "I'm Not Ready, please don't execute me");
//		}
   
    /***********After method with Interface - ITestResult   ************/
    
    @AfterMethod
    public void getResult(ITestResult result)
    {
        if(result.getStatus() == ITestResult.FAILURE) 
        {
        	
            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
            test.fail(result.getThrowable());
            //test.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
        }
    
        else if(result.getStatus() == ITestResult.SUCCESS) 
        {
        	
            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
        }
        else 
        {
            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
            test.skip(result.getThrowable());
        }
    }
     
     
    @AfterSuite
    public void tearDown() {
    	//to write or update test information to reporter
        extent.flush();
    }
}


/*  Note: these line code is not present in ExtentReport for version 4.0.6
 * 
 *  htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Extent Report Demo");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
 * 
 * so better use version 3.1.5(this dependency)
 * 
 * <dependency>
     <groupId>com.aventstack</groupId>
     <artifactId>extentreports</artifactId>
     <version>3.1.5</version>
</dependency>
 * 
 */
 
	
