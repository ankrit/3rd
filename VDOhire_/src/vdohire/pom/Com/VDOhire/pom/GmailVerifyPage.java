package Com.VDOhire.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  GmailVerifyPage 
{
   @FindBy(xpath="//input[@type='email']")
   
   private WebElement emailbox;
   
 @FindBy(xpath="//input[@type='password']")
   
   private WebElement passbox;
 
 @FindBy(xpath="//span[text()='Next']")
 
 private WebElement Nextbtn;

 public GmailVerifyPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public  WebElement loginOnuser(WebDriver driver,String username)
 {
	 emailbox.sendKeys(username);
	 Nextbtn.click();
	
	return null;	 
 }
 public  WebElement loginWithpass(WebDriver driver, String password)
 {
	 passbox.sendKeys(password);
	 Nextbtn.click();
	return null;
	 
 }
 
	
	
	
}
