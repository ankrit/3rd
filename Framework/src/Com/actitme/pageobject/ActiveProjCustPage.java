package Com.actitme.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class ActiveProjCustPage extends BasePage {
	@FindBy(css="input[value='Create New Customer']")
	private WebElement createNewCustBtn;
	
	@FindBy(className="successmsg")
	private WebElement successmsg;
	@FindBy(name="selectedCustomer")
	private WebElement custDropDwn;
	@FindBy(css="input[value*=' Show ']")
	private WebElement showBtn;
	@FindBy(xpath="//td[starts-with(@id,'customerNameCell')]//a[contains(@href,'customerId')]")
	private List<WebElement> custNameLink; 
	@FindBy(xpath="//input[@value='Create New Project']")
	private WebElement CreateNewProject;
	
	
	
	
	
	public ActiveProjCustPage(WebDriver driver)
	
	{
		super(driver);
	PageFactory.initElements(driver,this);	
	}
	
	public void clickOnCreateCustBtn()
	{
		createNewCustBtn.click();
	}
	
	public void verifyCreateNewCustMsg(String customerName)
	{
		Assert.assertTrue(successmsg.isDisplayed());
		Assert.assertTrue(successmsg.getText().contains(customerName));
		Reporter.log(successmsg.getText());
	}
	public void showCustomer( String customerName)
	{
		Select sel=new Select(custDropDwn);
		sel.selectByVisibleText(customerName);
		showBtn.click();
		
		if(custNameLink.get(0).getText().equalsIgnoreCase(customerName))
		{
			custNameLink.get(0).click();
		}		
	     else
		{
			
			System.out.println(customerName+"customer is not matching"+custNameLink.get(0).getText());	
		}
	}	
	public void verifyDeleteCustMsg()
	{
		String expMsg = "Customer has been successfully deleted.";
		String actMsg = successmsg.getText();
		
		Assert.assertEquals(actMsg, expMsg);
		Reporter.log(expMsg,true);
		
	}
	public void CreateNewProject()
	{
		CreateNewProject.click();	
	}
	

}

