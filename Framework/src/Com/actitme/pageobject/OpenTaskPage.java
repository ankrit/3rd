package Com.actitme.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPage {
	@FindBy(linkText="Projects & Customers")
	
	private WebElement projNCustLink;
	
	public OpenTaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	public void clickOnProjNCustLink()
	{
		
		projNCustLink.click();
	}
	

}
