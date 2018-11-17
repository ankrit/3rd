package API_TESTING_.API_TESTING_;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestManager {  
	
	
	
	
    static Map extentTestMap = new HashMap();
    
    static ExtentReports extent = ExtentManager.getReporter();

    public static synchronized ExtentTest getTest() 
    {
		
    	//ExtentTest s=new ExtentTest(null, null);
    	  
        return (ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId()));
    }

    public static synchronized void endTest() 
    {
        extent.endTest((ExtentTest) extentTestMap.get((int) (long) (Thread.currentThread().getId())));
    }

    public static synchronized ExtentTest startTest(String testName) 
    {
        return startTest(testName, "");
    }

    public static synchronized ExtentTest startTest(String testName, String desc) 
    {
        ExtentTest test = extent.startTest(testName, desc);
        
        extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);

        return test;
    }
}


/** Extent Test class==> about go to here
 * https://dzone.com/articles/creating-extent-reports-in-selenium-using-extent-a
 * 
 * 
 * just go through this link for Extent report and extent test---->>
 * https://www.youtube.com/results?search_query=sselenium+advance+%3Auseof+extent+report+and+extent+test+
 * 
 * 
 * document of extend reports
 * http://extentreports.com/docs/versions/2/java/
 * 
 */


