package Com.VDOhire.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.VDOhire.generic.HighLighter;

public class DeleteInterviewSetAndJob {
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement OKBTN;
	
	@FindBy(xpath="(//a[@title='Edit this job'])[1]/i")
	private WebElement EditBTN;
	
	@FindBy(xpath="//a[contains(text(),'Interview Setup')]")
	private WebElement InterviewDelete;
	
	@FindBy(xpath="//span[contains(text(),'Test')]")
	private WebElement dettachInterview;
	
	@FindBy(xpath="//li[text()='Select Interview']")
	private WebElement dettach;
	
	@FindBy(xpath="//a[contains(text(),'Recruiter Setup')]")
	private WebElement recruitertab;
	
	@FindBy(xpath="//div[@class='padding-right46px']//button[@type='button'][contains(text(),'Save')]")
	private WebElement save;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement okbtn;
	
	@FindBy(xpath="//button[contains(text(),'Save and go to Job List')]")
	private WebElement gotojoblistbtn;
	
	@FindBy(xpath="(//a[@title='Delete this job'])[1]/i")
	private WebElement deletebtn;
	
	
	public DeleteInterviewSetAndJob(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void deleteJobAndDettachInterviewSet(WebDriver driver) throws InterruptedException
	{
		
		Thread.sleep(3000l);
		HighLighter.highLightElement(driver,OKBTN);
		OKBTN.click();
		
		Thread.sleep(1000l);
		HighLighter.highLightElement(driver, EditBTN);
		 EditBTN.click();
		 
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,InterviewDelete);
			InterviewDelete.click();
			 
			 Thread.sleep(1000l);
				HighLighter.highLightElement(driver,dettachInterview); 
			dettachInterview.click();
			
			
			 Thread.sleep(1000l);
				HighLighter.highLightElement(driver,dettach);	 
			dettach.click();
			
			Thread.sleep(1000l);
			HighLighter.highLightElement(driver,recruitertab);
			recruitertab.click();
			
			
			Thread.sleep(1000l);
			HighLighter.highLightElement(driver, save);
			save.click();
			
			Thread.sleep(1000l);
			HighLighter.highLightElement(driver, okbtn);
			okbtn.click();
			
			Thread.sleep(2000l);
			HighLighter.highLightElement(driver,gotojoblistbtn);
			gotojoblistbtn.click();
			
			Thread.sleep(1000l);
			HighLighter.highLightElement(driver,deletebtn);
			deletebtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
