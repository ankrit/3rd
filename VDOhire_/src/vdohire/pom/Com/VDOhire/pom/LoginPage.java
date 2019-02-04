package Com.VDOhire.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

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
		Thread.sleep(5000l);
		LoginForEmpBtn.click();
		
	}
	public void getLoginPage( String username , String password)

	{
		
		userTxBox.sendKeys(username);
		passTxBox.sendKeys(password);
		Loginbuttn.click();
		
	}
	 
	public WebDriver varifyWithAssert(WebDriver driver)
	{
		String expected= "VDOHire";
		
		String actual = driver.getTitle();
		//System.out.println(actual);
		
		 Assert.assertEquals(actual,expected, "Home-page title is not verified..!!!" );
		 
		 Reporter.log("Home-page title is verified:)VDO!hire" , true);
		return driver;
	}
	
	public WebDriver verifyInvalidErrormsg(WebDriver driver)
	{
   String expected ="The Email field must contain a valid email address.";
 
		String actual = errormsg.getText();
		   //System.out.println(actual);
		
		Assert.assertEquals(expected, actual, "error smg is not coming");
		
		Reporter.log("error msg is verifyed successfully ):", true);
		
		return driver;
	}
		
	}
	
	
	
	
	
	
	


