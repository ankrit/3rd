package Com.VDOhire.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.VDOhire.generic.HighLighter;

public class SendInvitationsPage  {

//	@FindBy(xpath="//a[text()='Send Job Invitation']")
//	private WebElement SendInvitationbtn;
	
	
	@FindBy(xpath="(//a[@title='Invite users'])[1]/i")
	private WebElement InvtUser;
	
	@FindBy(xpath="(//input[@id='inviteFrom_2'])[1]")
	private WebElement smsCheckbox;
	
	@FindBy(xpath="(//input[@type='file'])[2]")
	private WebElement browserbtn;
	
	@FindBy(xpath="(//button[text()='Send Invitation'])[1]")
	private WebElement SendInvitationbtn2;
	
	
	
	
	public SendInvitationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
//	public void SendInvitation(WebDriver driver)
//	{
//		
//		SendInvitationbtn.click();
//	}
	
	public void InviteUsers(WebDriver driver) throws InterruptedException
	{
		HighLighter.highLightElement(driver,InvtUser);
		InvtUser.click();
		
		Thread.sleep(1000l);
		HighLighter.highLightElement(driver,smsCheckbox);
		smsCheckbox.click();
		HighLighter.highLightElement(driver,browserbtn);
		browserbtn.click();
		
	}
	
	public void SendInvitedBtn(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(1000l);
		HighLighter.highLightElement(driver,SendInvitationbtn2);
		SendInvitationbtn2.click();
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
