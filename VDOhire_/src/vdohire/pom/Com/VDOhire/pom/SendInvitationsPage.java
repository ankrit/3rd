package Com.VDOhire.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SendInvitationsPage  {

	@FindBy(xpath="//a[text()='Send Job Invitation']")
	private WebElement SendInvitationbtn;
	
	
	@FindBy(xpath="(//a[@title='Invite users'])[1]")
	private WebElement InvtUser;
	
	@FindBy(xpath="(//input[@id='inviteFrom_2'])[1]")
	private WebElement smsCheckbox;
	
	@FindBy(xpath="//input[@type='file']")
	private WebElement browserbtn;
	
	@FindBy(xpath="(//button[text()='Send Invitation'])[1]")
	private WebElement SendInvitationbtn2;
	
	
	
	public SendInvitationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SendInvitation(WebDriver driver)
	{
		
		SendInvitationbtn.click();
	}
	
	public void InviteUsers(WebDriver driver)
	{
		InvtUser.click();
		smsCheckbox.click();
		browserbtn.click();
		
	}
	
	public void SendInvitedBtn(WebDriver driver)
	{
		SendInvitationbtn2.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
