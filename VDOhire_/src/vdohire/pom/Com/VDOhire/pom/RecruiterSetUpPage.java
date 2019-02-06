package Com.VDOhire.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.VDOhire.generic.HighLighter;

public class RecruiterSetUpPage {
	
	@FindBy(xpath="//a[text()='Recruiter Setup']")
	private WebElement recruiterBtnTab;
	
	@FindBy(xpath="//div[@id='level1Test_chosen']//ul[@class='chosen-choices']")
	private WebElement addLevel1Recruiter;
	
	
	@FindBy(xpath="///li[@class='result-selected']")
	private WebElement SelectID;
	
	@FindBy(xpath="//div[@class='padding-right46px']//button[@type='button'][contains(text(),'Save')]")
	private WebElement Savebtn;
	
	
	public RecruiterSetUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void setUpRecruiter(WebDriver driver) throws InterruptedException
	{
		
		Thread.sleep(2000l);
		 HighLighter.highLightElement(driver,recruiterBtnTab);
		recruiterBtnTab.click();
		
		Thread.sleep(2000l);
		 HighLighter.highLightElement(driver,addLevel1Recruiter);
		addLevel1Recruiter.click();		
		
		Thread.sleep(2000l);
		 HighLighter.highLightElement(driver,SelectID);
		//li[@class='result-selected']c
		SelectID.click();
		
		Thread.sleep(2000l);
		 HighLighter.highLightElement(driver, Savebtn);
		 Savebtn.click();
	}
	
	
	
	
	
	
	

}
