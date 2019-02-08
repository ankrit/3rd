package Com.VDOhire.pom;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Com.VDOhire.generic.HighLighter;
import Com.VDOhire.generic.WaitStatementLib;


public class JobPage 
{
	public WebDriver driver;
	
	@FindBy(xpath="//a[text()='Jobs']")
	private  WebElement jobBtn;
	
	@FindBy(xpath="//button[text()='Add Job']")
	private WebElement AddJobBtn;
	
	@FindBy(xpath="//input[@id='titleOfJob']")
	private WebElement titlejob;
	
	@FindBy(xpath="//input[@value='Choose a Country']")
	private WebElement Country;
	
	@FindBy(xpath="//input[@value='Choose a Country']")
	private WebElement CountryName;
	
	@FindBy(xpath="//input[@value='City by selected Country']")
	private WebElement City;
	
	@FindBy(xpath="//input[@value='City by selected Country']")
	private WebElement CityName;
	
	@FindBy(name="salaryFrom")
	private WebElement salaryFrom;
	
	@FindBy(name="salaryTo")
	private WebElement salaryTo;
	
	@FindBy(xpath="//body[@data-id='jobDescription']/p")
	private WebElement disc;
	
	/*** second side ***/
	
	@FindBy(name="jobId")
	private WebElement JobID;
	
	@FindBy(id="numberofVacancies")
	private WebElement Vacancy;
	
	@FindBy(id="datepicker-addJob")
	private WebElement openTill;
	
	@FindBy (xpath="//span[text()='Next']")
	private WebElement Nextbtn;
	
	@FindBy(xpath="//a[text()='21']")
	private WebElement date;
	@FindBy(xpath="//div[@id='qualification_chosen']/ul")
	private WebElement Qualification;
	@FindBy(name="expFrom")
	private WebElement expfrombtn;
	@FindBy(name="expTo")
	private WebElement expTobtn;
	@FindBy(name="ageFrom")
	private WebElement ageFromBtn;	
	@FindBy(name="ageTo")
	private WebElement ageToBtn;
	@FindBy(id="noticePeriod")
	private WebElement Notice;
	
	@FindBy(xpath="(//button[text()='Save'])[1]")
	private WebElement saveBtn;
	@FindBy(tagName="iframe")
	private WebElement frame;
	
	@FindBy(xpath="//button[text()='Save and go to Job List']")
	private WebElement goTojobList;
	
	@FindBy(xpath="(//a[@title='Edit this job'])[1]")
	private WebElement edit;
	
	@FindBy(xpath="//a[text()='Configuration']")
	private WebElement configTab;
	
	
	
	
	public JobPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public  void clickJobtab(WebDriver driver)
	{
		HighLighter.highLightElement(driver, jobBtn);
		
		
		jobBtn.click();
		HighLighter.highLightElement(driver, AddJobBtn);
		
		AddJobBtn.click();
		
	}
	
	public void createJobInMainTab(WebDriver driver,String title, String country,String city) throws InterruptedException
	
	{
		HighLighter.highLightElement(driver, titlejob);
		
		WaitStatementLib.implicitWaitForSecond(driver, 10);
		
		
		titlejob.sendKeys(title);
		
		HighLighter.highLightElement(driver, Country);
		
		//Thread.sleep(2000l);
		WaitStatementLib.implicitWaitForSecond(driver, 20);
		
		//Thread.sleep(3000l);
		
		Country.click();
		Country.sendKeys(country);
		
		Thread.sleep(1000l);
		Country.sendKeys(Keys.ENTER);
	
		WaitStatementLib.implicitWaitForSecond(driver, 20);
		HighLighter.highLightElement(driver, City);
		//HighLighter.highLightElement(driver, City);
		City.click();
		City.sendKeys(city);
	    Thread.sleep(1000l);
	     CityName.sendKeys(Keys.ENTER);
	     
	    
	}
	public void SalarytoandFrom(WebDriver driver,String salaryfrom,String salaryto)
	{
		
	     HighLighter.highLightElement(driver,salaryFrom );
	     salaryFrom.sendKeys(salaryfrom);
	     
	     WaitStatementLib.implicitWaitForSecond(driver, 10);
	     HighLighter.highLightElement(driver, salaryTo);
	     salaryTo.sendKeys(salaryto);
	     
	     driver.switchTo().frame(frame);
	     
	     HighLighter.highLightElement(driver, disc);
	     Actions actions = new Actions(driver);
	     
		   actions.moveToElement(disc);
		   actions.click();
		   actions.sendKeys("hello shashank");
		   actions.build().perform();
		   
		   driver.switchTo().defaultContent();
	    //disc.sendKeys("HELLO");
		
	}
	
	public void SecondSideField(WebDriver driver,String jobid,String vacancy,String qualification,String notice) throws InterruptedException
	{
		HighLighter.highLightElement(driver, JobID);
		JobID.sendKeys(jobid);
		HighLighter.highLightElement(driver, Vacancy);
		Vacancy.sendKeys(vacancy);
		HighLighter.highLightElement(driver, openTill);
		openTill.click();
		HighLighter.highLightElement(driver, Nextbtn);
		Nextbtn.click();
		HighLighter.highLightElement(driver, date);
		date.click();
		
		/********For Scrolling the page**********/
		
		String jscode = "window.scrollTo(0,document.body.scrollHeight)";
		JavascriptExecutor je=(JavascriptExecutor)driver;
		   je.executeScript(jscode);
		   
		/******when we will get the execption like-webdriverException :unknown error : can not focus element*******/
		   
		   Actions actions = new Actions(driver);
		   HighLighter.highLightElement(driver, Qualification);
		   actions.moveToElement(Qualification);
		   actions.click();
		   actions.sendKeys(qualification);
		   actions.build().perform();
	   WaitStatementLib.implicitWaitForSecond(driver, 20);   
	   Thread.sleep(1000l);
		   actions.sendKeys(Keys.ENTER);
		
		
		WaitStatementLib.implicitWaitForSecond(driver, 10);
		HighLighter.highLightElement(driver, expfrombtn);
		Select sel=new Select(expfrombtn);
		sel.selectByIndex(5);
		HighLighter.highLightElement(driver, expTobtn);
		WaitStatementLib.implicitWaitForSecond(driver, 10);
		Select sel1=new Select(expTobtn);
		sel1.selectByIndex(8);
		HighLighter.highLightElement(driver, ageFromBtn);
		WaitStatementLib.implicitWaitForSecond(driver, 10);
		Select sel2=new Select(ageFromBtn);
		sel2.selectByIndex(3);
		WaitStatementLib.implicitWaitForSecond(driver, 10);
		HighLighter.highLightElement(driver, ageToBtn);
		Select sel3=new Select(ageToBtn);
		sel3.selectByIndex(7);
		
		HighLighter.highLightElement(driver,Notice);
		Notice.sendKeys(notice);
		
		Notice.sendKeys(Keys.ENTER);
		
//		 Thread.sleep(2000l);
//			HighLighter.highLightElement(driver, saveBtn);
//		saveBtn.click();
		
		 Thread.sleep(3000l);
		HighLighter.highLightElement(driver, goTojobList);
		goTojobList.click();
		
		 Thread.sleep(2000l);
			HighLighter.highLightElement(driver,edit);
			edit.click();
		
		
		HighLighter.highLightElement(driver,configTab );
		configTab.click();
	}

		
	//	((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		
//public void ScrollInjob(WebDriver driver) throws InterruptedException
//{
//	
//		/*****scroll up******/
////		Thread.sleep(3000l);
////		JavascriptExecutor js=((JavascriptExecutor)driver);
////		js.executeScript("window.scrollBy(0,-500");
//		
//		Actions actions = new Actions(driver);
//		actions.sendKeys(Keys.UP).build().perform();
//		actions.sendKeys(Keys.UP).build().perform();
//		actions.sendKeys(Keys.UP).build().perform();
//		
//		
//		//saveBtn.click();
////		HighLighter.highLightElement(driver, okbtn);
////		okbtn.click();
//		HighLighter.highLightElement(driver,configTab );
//		configTab.click();
		
}

	
	
	
	
	
	
	
	
	
	
	

