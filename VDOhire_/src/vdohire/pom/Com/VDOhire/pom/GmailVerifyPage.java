package Com.VDOhire.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.VDOhire.generic.HighLighter;

public class  GmailVerifyPage 
{
   @FindBy(xpath="//input[@type='email']")
   
   private WebElement emailbox;
   
 @FindBy(xpath="//input[@type='password']")
   
   private WebElement passbox;
 
 @FindBy(xpath="//span[text()='Next']")
 
 private WebElement Nextbtn;
 
 @FindBy(xpath="(//span[text()='More'])[1]")
 private WebElement moreBtn;
 
 @FindBy(xpath="//a[text()='Spam']")
 private WebElement spanBtn;
 
 @FindBy(xpath="(//span[text()='VDOHire'])[1]")
 private WebElement vdohire;
 
 
 public GmailVerifyPage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public  WebElement loginOnuser(WebDriver driver,String username)
 {
	 HighLighter.highLightElement(driver, emailbox);
	 
	 emailbox.sendKeys(username);
	 
	 Nextbtn.click();
	
	return null;	 
 }
 public  WebElement loginWithpass(WebDriver driver, String password)
 {
	 HighLighter.highLightElement(driver, passbox);
	 passbox.sendKeys(password);
	 
	 HighLighter.highLightElement(driver, Nextbtn);
	 Nextbtn.click();
	 
	 HighLighter.highLightElement(driver, moreBtn);
	 moreBtn.click();
	 
	 HighLighter.highLightElement(driver, spanBtn);
	 spanBtn.click();
	 
	 HighLighter.highLightElement(driver, vdohire);
	 vdohire.click();
	 
	 
	return null;
	 
 }
 
	
	
	
}
