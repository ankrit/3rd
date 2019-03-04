package Com.VDOhire.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.VDOhire.generic.HighLighter;

public class InterviewTabPage {
	
	@FindBy(xpath="//a[text()='Interview Setup']")
	private WebElement interviewTab;
	
	@FindBy(xpath="//button[text()='Manage Interview Sets']")
	private WebElement manageinterview;
	
	@FindBy(xpath="//button[text()='Add Interview Set']")
	private WebElement addInterviewSetup;
	
	@FindBy(id="setname_value")
	private WebElement setName;
	
	@FindBy(xpath="(//button[text()='Add Random Questions'])[4]")
	private WebElement addRandomQue;
	
//	@FindBy(xpath="(//button[text()='Add Individual Question'])[4]")
//	private WebElement addInterviewQue;
	
	@FindBy(xpath="(//select[@name='question[0][questionBank]'])[2]")
	private WebElement SelectQueBank;
	
	@FindBy(xpath="//input[@class='form-control interviewQuestionBank']")
	private WebElement noOfque;
	
	@FindBy(xpath="(//button[text()='x'])[1]")
	private WebElement xbtn1;
	
//	@FindBy(xpath="(//button[text()='x'])[2]")
//	private WebElement xbtn2;
	
	@FindBy(xpath="(//button[text()='SAVE'])[5]")
	private WebElement saveBtn;
	
	/**********VH Interview Que*************/
	
	@FindBy(xpath="//button[text()='VH Question Bank']")
	private WebElement VHqueBank;
	
	@FindBy(xpath="(//tr[contains(@id,'trFjInterviewQuestionBank_')])[1]//img")
	private WebElement VHinterviewSet;
	
	@FindBy(xpath="(//button[text()='Back'])[7]")
	private WebElement backBtm;
	
	@FindBy(xpath="(//button[text()='My Question Banks'])[2]")
	private WebElement myQueBank;
	
	@FindBy(xpath="//button[@id='addInterviewQuestionBankButton']")
	private WebElement addQueBank;
	
	@FindBy(xpath="//input[@name='interviewQuestionBankname']")
	private WebElement SetnameforaddQuebnk;
	
	@FindBy(xpath="//select[@name='interviewQquestionType']")
	private WebElement QueBankType;
	
	@FindBy(xpath="//select[@id='interviewQquestionType'")
	private WebElement queType;
	
	@FindBy(xpath="(//button[text()='Save'])[4]")
	private WebElement saveBtn2;
	
	@FindBy(xpath="(//button[text()='×'])[2]")
	private WebElement cutTheInterviewpage;
	
	@FindBy(xpath="//span[text()='Select Interview']")
	private WebElement selectInterview;
	

	@FindBy(xpath="//div[@id='interviewAttach_chosen']//div[@class='chosen-search']/input")
	private WebElement searchField;
	
	

	public InterviewTabPage (WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
	
	public void setUpInterview(WebDriver driver,String setname,String noofque,String setname2) throws InterruptedException
	{
		Thread.sleep(1000l);
		HighLighter.highLightElement(driver, interviewTab);
		interviewTab.click();
		
		Thread.sleep(1000l);
		HighLighter.highLightElement(driver, manageinterview);
		manageinterview.click();
		
		Thread.sleep(1000l);
		HighLighter.highLightElement(driver, addInterviewSetup);
		addInterviewSetup.click();
		
		Thread.sleep(1000l);
		HighLighter.highLightElement(driver, setName);
		setName.sendKeys(setname);
		
		Thread.sleep(1000l);
		HighLighter.highLightElement(driver, addRandomQue);
		addRandomQue.click();
		
//		Thread.sleep(2000l);
//		HighLighter.highLightElement(driver,addInterviewQue);
//		addInterviewQue.click();
		
		Thread.sleep(1000l);
		HighLighter.highLightElement(driver, SelectQueBank);
		Select sel=new Select(SelectQueBank);
		sel.selectByIndex(4);
		
		Thread.sleep(1000l);
		HighLighter.highLightElement(driver, noOfque);
		 noOfque.sendKeys(noofque);
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,xbtn1);
		 xbtn1.click();
		 
//		 Thread.sleep(2000l);
//		 HighLighter.highLightElement(driver,xbtn2);
//		 xbtn2.click();
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,  saveBtn);
		 saveBtn.click();
		
		/***************VHinterviewSet**********************/
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver, VHqueBank);
		 VHqueBank.click();
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,VHinterviewSet);
		 VHinterviewSet.click();
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver, backBtm);
		 backBtm.click();
		
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,  myQueBank);
		 myQueBank.click();
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver, addQueBank);
		 addQueBank.click();
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,  SetnameforaddQuebnk);
		 SetnameforaddQuebnk.sendKeys(setname2);
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver, QueBankType);
		 Select sel2=new Select(QueBankType);
		  sel2.selectByIndex(1);
		  
		  Thread.sleep(1000l);
		  HighLighter.highLightElement(driver, saveBtn2);
		  saveBtn2.click();
		  
		  HighLighter.highLightElement(driver,cutTheInterviewpage);
		  cutTheInterviewpage.click();
		  
		  
		  Thread.sleep(1000l);
		  HighLighter.highLightElement(driver,selectInterview);
		  selectInterview.click();
		  
		  Thread.sleep(1000l);
		  HighLighter.highLightElement(driver, searchField);
		 searchField.sendKeys(setname+Keys.ENTER);
		  
		  
		  
//		Select sel4=new Select(selectInterview);
//		sel4.selectByIndex(2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
