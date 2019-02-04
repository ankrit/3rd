package Com.VDOhire.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobConfigTabPage {
	
	@FindBy(xpath="//input[@name='externalJob']")
	private WebElement ExternalJobChkBox;
	
	@FindBy(xpath="//input[@value='interview']")
	private WebElement interviewchekBox;
	
	@FindBy(xpath="//input[@value='assessment']")
	private WebElement assessmentchekBox;
	
	@FindBy(xpath="//input[@value='document']")
	private WebElement documentchekBox;
	
	
	public void JobConfigTabPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
    public static void setUpJobType(WebDriver driver)
    {
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
