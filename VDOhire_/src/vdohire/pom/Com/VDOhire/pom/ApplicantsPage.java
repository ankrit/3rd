package Com.VDOhire.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.VDOhire.generic.HighLighter;

public class ApplicantsPage {
	
	@FindBy(xpath="//a[text()='Applicants']")
	private WebElement Applicantstab;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	private WebElement closebtn;
	
	@FindBy(xpath="//select[@name='JobList']")
	private WebElement joblist;
	
	@FindBy(xpath="//select[@id='JobListdropdown']//option[text()='Marketing Manager (6/3)']")
	private WebElement optionjoblist;
	
	//select[@id='JobListdropdown']//option[text()='Marketing Manager (6/3)']
	
	@FindBy(xpath="//video[@id='videoShowAnswerbox']")
	private WebElement clickvideo;
	
	@FindBy(xpath="//div[@id='Insights']")
	private WebElement AiScore;

	@FindBy(xpath="//a[@class='btn resume-div-buttons']")
	private WebElement resumeBtn;
	
	@FindBy(xpath="//button[@class='btn resume-downloadbutton']")
	private WebElement downloadBox;
	
	@FindBy(xpath="//div[@id='UserResume']//button[@type='button'][contains(text(),'×')]")
	private WebElement xbtn;
	
	@FindBy(xpath="(//div[@class='comment-form-section']//label)[3]")
	private WebElement ratingbtn;
	
	@FindBy(xpath="//select[@id='interview_status_dropdown']")
	private WebElement myRecument;

	@FindBy(xpath="(//select[@id='interview_status_dropdown']/option)[2]")
	private WebElement shortlistBtn;
	
	@FindBy(xpath="//textarea[@id='interview_comment']")
	private WebElement cummentBox;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement save;
	
	//@FindBy(id="inputRecruiterLoginButton")
//	private WebElement Loginbuttn;
	
	@FindBy(xpath="//a[@class='btn share-user-interview sharereal-interview-button']")
	private WebElement sharebtn;

	@FindBy(xpath="//input[@id='receiverEmail1']")
	private WebElement emailid;
	
	@FindBy(xpath="//button[@id='sendInterview']")
	private WebElement sendInterview;
	
	//@FindBy(xpath="//input[@name='password']")
	//private WebElement passTxBox;
	
	@FindBy(xpath="//b[contains(text(),'Interview Feedback ')]")
	private WebElement feedback;
	
	
	
	public ApplicantsPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	
	public void ApplicantspageCheck(WebDriver driver) throws InterruptedException
	{
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver, Applicantstab); 
	       Applicantstab.click();
		
	       Thread.sleep(1000l);
			HighLighter.highLightElement(driver,closebtn); 
		closebtn.click();
		
		 Thread.sleep(1000l);
		 
			HighLighter.highLightElement(driver,joblist); 
//		Select sel=new Select(joblist);
//		sel.selectByValue("Marketing Manager (6/3)");
		joblist.click();
		
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,optionjoblist); 
		optionjoblist.click();
		
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,clickvideo); 
	clickvideo.click();
		
	 Thread.sleep(1000l);
		HighLighter.highLightElement(driver,AiScore); 
		AiScore.click();

		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,resumeBtn); 
		resumeBtn.click();
		
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,downloadBox); 
	downloadBox.click();
		
	 Thread.sleep(1000l);
		HighLighter.highLightElement(driver, xbtn); 
		 xbtn.click();
		
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,ratingbtn); 
		ratingbtn.click();
		
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,myRecument); 
		myRecument.click();
		
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,shortlistBtn); 
shortlistBtn.click();
		
Thread.sleep(1000l);
HighLighter.highLightElement(driver,cummentBox); 
		cummentBox.sendKeys("good candidate");
		
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,save); 
		save.click();
		
		//@FindBy(id="inputRecruiterLoginButton")
		save.sendKeys(Keys.ENTER);
		//private WebElement Loginbuttn;
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,sharebtn); 
		sharebtn.click();

		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,emailid); 
		emailid.sendKeys("shashanktwr1994@gmail.com");
		
		 Thread.sleep(1000l);
			HighLighter.highLightElement(driver,sendInterview); 
	sendInterview.click();
		
		//@FindBy(xpath="//input[@name='password']")
		//private WebElement passTxBox;
	save.sendKeys(Keys.ENTER);
	 Thread.sleep(1000l);
		HighLighter.highLightElement(driver,feedback); 
		feedback.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
