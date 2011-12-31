package Com.actitme.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProject {
	
	@FindBy( xpath="//input[@value='Create New Project']")
	private WebElement createProjectbutton;
		
	@FindBy( name="customerId")
	private WebElement customerIdbox;
	
	@FindBy(xpath="//option[text()='GE HealthCare']")
	private WebElement GEHealthCare;
	
	@FindBy( name="createProjectSubmit")
	private WebElement createProjectSubmit;
	
	@FindBy(name="name")
	private WebElement projectname;
	
	
	
	public CreateNewProject(WebDriver driver,String name)
	{
		PageFactory.initElements(driver,this);
	
	
	
		createProjectbutton.click();
		customerIdbox.click();
		GEHealthCare.click();
		projectname.sendKeys(name);
		createProjectSubmit.click();
			
	}
//	public void ProjectName(String name)
//	{
//		projectname.sendKeys(name);	
//		
//	}
//	
		
	
	
	
	

}
