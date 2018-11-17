package Extnt.Extnt;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class report {
	
	public static void main(String[] args) throws IOException {
		
		
		  ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Learn/extent.html");
		  
		  ExtentReports extent = new ExtentReports();
		 
		  
		  extent.attachReporter(htmlReporter);
		  
		  
		  ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

	        
	        test.log(Status.INFO, "This step shows usage of log(status, details)");
 
	       // test.info("This step shows usage of info(details)");
	        
	        // calling flush writes everything to the log file
	       // extent.flush();
	        
	        
	        test.log(Status.PASS, "This step shows usage of log(status, details)");
	        //test.pass("PASS HAI " );
	        
	        extent.flush();
	    }
	
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}
	
	
	
	
	
	
	
	


