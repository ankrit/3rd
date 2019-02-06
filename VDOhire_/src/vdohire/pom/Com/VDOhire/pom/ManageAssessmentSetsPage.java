package Com.VDOhire.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.VDOhire.generic.HighLighter;

public class ManageAssessmentSetsPage {

	@FindBy(xpath="//button[text()='Manage Assessment Sets']")
	private WebElement managesetsbtn;
	
	@FindBy(xpath="//button[text()='Add Assessment Set']")
	private WebElement addAssessmentSetsbutton;
	
	@FindBy(name="name")
	private WebElement setNamebtn;
	
	@FindBy(name="duration")
	private WebElement durtionbtn;
	
	@FindBy(xpath="//input[@class='form-control assessmentQuestion']")
	private WebElement noOfQuetxt;
	
	@FindBy(id="addAssessmentIndividualQuestionBank-0")
	private WebElement QueTypeBank;
	
	@FindBy(xpath="//select[@class='selectpicker assessmentIndividualQuestion']")
	private WebElement Queselect;
	
	@FindBy(xpath="(//button[text()='Add Random Questions'])[1]")
	private WebElement AddrondomQuebtn;
	
	@FindBy(xpath="//button[text()='x']")
	private WebElement Xbtn;
	
	@FindBy(xpath="(//button[text()='SAVE'])[2]")
	private WebElement savebtn;
	
	@FindBy(xpath="//button[text()='VH Question Banks']")
	private WebElement VHqueBnkbtn;
	
	@FindBy(xpath="(//button[text()='Back'])[2]")
	private WebElement backbtn;
	
	@FindBy(xpath="(//button[text()='My Question Banks'])[1]")
	private WebElement myQueBnkbtn;
	
	/*********************/
	
	
	@FindBy(xpath="(//button[text()='Add Question Bank'])[1]")
	private WebElement addQuebtn;
	
	@FindBy(name="assessmentQuestionBankname")
	private WebElement setname2txtbx;
	
	@FindBy(id="assessmenQquestionType")
	private WebElement selecttype;
	
	@FindBy(xpath="(//button[text()='Save'])[2]")
	private WebElement savebtn2;
	
	
	public ManageAssessmentSetsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setTheAssessmentTypeQue(WebDriver driver,String setname1,String duration,String noOfQue,String setque2,String selectType)
	{
		 HighLighter.highLightElement(driver,managesetsbtn);
		managesetsbtn.click();
		
		 HighLighter.highLightElement(driver,addAssessmentSetsbutton);
		addAssessmentSetsbutton.click();
		
		 HighLighter.highLightElement(driver,setNamebtn);
		setNamebtn.sendKeys(setname1);
		
		 HighLighter.highLightElement(driver,durtionbtn);
		durtionbtn.sendKeys(duration);
		
		 HighLighter.highLightElement(driver,noOfQuetxt);
		noOfQuetxt.sendKeys(noOfQue);
		
		 HighLighter.highLightElement(driver, QueTypeBank);
		Select sel=new Select( QueTypeBank);
		sel.selectByIndex(5);
		
		 HighLighter.highLightElement(driver,Queselect);
		Select sel1=new Select(Queselect);
		sel1.selectByIndex(5);
		
		 HighLighter.highLightElement(driver,AddrondomQuebtn);
		AddrondomQuebtn.click();
		
		 HighLighter.highLightElement(driver,Xbtn);
		Xbtn.click();
		
		 HighLighter.highLightElement(driver,savebtn);
		savebtn.click();
		
		 HighLighter.highLightElement(driver,VHqueBnkbtn);
		VHqueBnkbtn.click();
		
		 HighLighter.highLightElement(driver, backbtn);
		 backbtn.click();
		 
		 HighLighter.highLightElement(driver, myQueBnkbtn);
		 myQueBnkbtn.click();
		 
		 HighLighter.highLightElement(driver,addQuebtn);
		 addQuebtn.click();
		 
		 HighLighter.highLightElement(driver,setname2txtbx);
		 setname2txtbx.sendKeys(setque2);
		 
		 HighLighter.highLightElement(driver,selecttype);
		 Select sel2=new Select(selecttype);
			sel2.selectByIndex(5);
			
			 HighLighter.highLightElement(driver, selecttype);
			selecttype.sendKeys(selectType);
		
		
			 HighLighter.highLightElement(driver,savebtn2);
			savebtn2.click();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
