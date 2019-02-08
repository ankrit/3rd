package Com.VDOhire.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.VDOhire.generic.HighLighter;

public class JobConfigTabPage {
	
	@FindBy(xpath="//input[@name='externalJob']")
	private WebElement ExternalJobChkBox;
	
	@FindBy(xpath="//input[@value='interview']")
	private  WebElement interviewchekBox;
	
	@FindBy(xpath="//input[@value='assessment']")
	private WebElement assessmentchekBox;
	
	@FindBy(xpath="//input[@value='document']")
	private WebElement documentchekBox;
	
	
	public JobConfigTabPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
    public void setUpJobType(WebDriver driver) throws InterruptedException
    {
    	
    	Thread.sleep(1000l);
    	//HighLighter.highLightElement(driver, ExternalJobChkBox);
    	boolean flag = ExternalJobChkBox.isSelected();
    	//System.out.println(flag);
    	
    	 if(flag)
    	 {
    		 HighLighter.highLightElement(driver, ExternalJobChkBox);
    		 System.out.println("External checkbox is already selected");
    	 }
    	 else
    	 {
    		 HighLighter.highLightElement(driver, ExternalJobChkBox);
    		 ExternalJobChkBox.click();
    	 }
    	 
    	 HighLighter.highLightElement(driver,interviewchekBox);
    	 boolean flag2 = interviewchekBox.isSelected();
    	 
    	 if(flag2)
    	 {
    		 //System.out.println(flag2);
    		 HighLighter.highLightElement(driver,interviewchekBox);
    		 System.out.println("interview checkbox is already selected");
    	 }
    	 else
    	 {
    		 HighLighter.highLightElement(driver,interviewchekBox);
    		 interviewchekBox.click();
    	 }
    	
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
