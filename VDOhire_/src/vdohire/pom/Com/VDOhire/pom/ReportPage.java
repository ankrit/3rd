package Com.VDOhire.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.VDOhire.generic.HighLighter;

public class ReportPage {
	
	@FindBy(xpath="(//a[@href='https://vdohire.com/admin/analytics/list'])[1]")
	private WebElement reportab;
	
	@FindBy(xpath="//a[contains(text(),'Applications')]")
	private WebElement apptab;
	
	@FindBy(xpath="//canvas[@id='jobApplicationsGraphView']")
	private WebElement report;
	
	@FindBy(xpath="//span[@class='username']")
	private WebElement vdohire;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logout;
	//a[contains(text(),'Logout')]
	
	public ReportPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void reporttab(WebDriver driver) throws InterruptedException
	{
		 Thread.sleep(2000l);
		 HighLighter.highLightElement(driver, reportab);
		reportab.click();
		
		 Thread.sleep(2000l);
		 HighLighter.highLightElement(driver, apptab);
		 apptab.click();
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver, report);
		String test = report.getText();
		
		
		System.out.println(test);
		
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver, vdohire);
		vdohire.click();
		
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver, logout);
		
		logout.click();
		
		
	}
	
	
	

}
