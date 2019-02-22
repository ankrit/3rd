package Com.VDOhire.pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.VDOhire.generic.HighLighter;

public class RecruiterPage {
	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement OKBTN;
	
	@FindBy(xpath="//a[contains(text(),'Recruiters')]")
	private WebElement RecruiterTab;
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement AddRecruiter;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//textarea[@name='aboutMe']")
	private WebElement aboutrecruiter;
	
	@FindBy(xpath="//input[@id='datepicker-13']")
	private WebElement dob;
	
	
	@FindBy(xpath="//div[@class='col-md-5 padd_35_btm editfrm ed_gry_bg']//div[1]//div[1]//input[1]")
	private WebElement desi;
	
	@FindBy(xpath="//div[@class='col-md-5 padd_35_btm editfrm ed_gry_bg']//input[@id='name']")
	private WebElement companyname;
	
	@FindBy(xpath="//div[@class='col-md-5 padd_35_btm editfrm ed_gry_bg']//div[3]//div[1]//input[1]")
	private WebElement address;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement savebtn;

	
	public RecruiterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createRecruiter(WebDriver driver,String Name,String mobileno,String emailid) throws InterruptedException
	{
//		Thread.sleep(1000l);
//		 HighLighter.highLightElement(driver,OKBTN);
//		 OKBTN.click();
		 
		 Thread.sleep(2000l);
		 HighLighter.highLightElement(driver,RecruiterTab);
		 RecruiterTab.click();
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver, AddRecruiter);
		 AddRecruiter.click();
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,  name);
		 name.sendKeys(Name);
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,mobile);
		 mobile.sendKeys(mobileno);
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver, email);
		 email.sendKeys(emailid);
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,location);
		 location.sendKeys("noida");
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,dob);
		 dob.sendKeys("15/9/1994");
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,desi);
		 desi.sendKeys("QA");
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,companyname);
		 companyname.sendKeys("SYNERGY RELATIONSHIP MANAGEMENT SERVICES PVT. LTD.");
		 
		 Thread.sleep(1000l);
		 HighLighter.highLightElement(driver,address);
		 address.sendKeys("House No. A 121 Aman Vihar Colony, Mavana Road Near JP Academy.");
		 
		 address.sendKeys(Keys.ENTER);
		 
//		 Thread.sleep(1000l);
//		 HighLighter.highLightElement(driver,aboutrecruiter);
//		 aboutrecruiter.sendKeys("he has a almost 5 year exp.");
//		 
//		 Thread.sleep(1000l);
//		 HighLighter.highLightElement(driver, savebtn);
//		 savebtn.click();
	}
	
	
}
