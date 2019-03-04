package Com.VDOhire.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Com.VDOhire.generic.HighLighter;
import Com.VDOhire.generic.WaitStatementLib;

public class LoginPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@id='loginForEmployer']")
	private WebElement LoginForEmpBtn;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement userTxBox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passTxBox;
	
	@FindBy(id="inputRecruiterLoginButton")
	private WebElement Loginbuttn;
	
	@FindBy(xpath="//div[@class='error-list']")
	private WebElement errormsg;

	


	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void LoginForEmpButton() throws InterruptedException
	
	{
		//WaitStatementLib.implicitWaitForSecond(driver,10);
		Thread.sleep(5000l);
		// HighLighter.highLightElement(driver,LoginForEmpBtn);
		LoginForEmpBtn.click();
		
	}
	public void getLoginPage( String username , String password) throws InterruptedException

	{
//		Thread.sleep(1000l);
//		HighLighter.highLightElement(driver,userTxBox);
		userTxBox.sendKeys(username);
//		Thread.sleep(500);
//		HighLighter.highLightElement(driver,passTxBox);
		passTxBox.sendKeys(password);
//		Thread.sleep(500);
//		HighLighter.highLightElement(driver,Loginbuttn);
		Loginbuttn.click();
		
	}
	 
	public WebDriver varifyWithAssert(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000l);
		String expected= "VDOHire";
		
		String actual = driver.getTitle();
		System.out.println(actual);
		
		 Assert.assertEquals(actual,expected, "Home-page title is not verified..!!!" );
		 
		 Reporter.log("Home-page title is verified:)VDO!hire" , true);
		return driver;
	}
	
	public WebDriver verifyInvalidErrormsg(WebDriver driver)
	{
   String expected ="The Email field must contain a valid email address.";
 
		String actual1 = errormsg.getText();
		   System.out.println(actual1);
		
		Assert.assertEquals(expected, actual1, "error smg is not coming");
		
		Reporter.log("error msg is verifyed successfully ):", true);
		
		return driver;
	}
		
	}
	
	
	
	
	
	
	


