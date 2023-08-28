package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends baseClass {

	public homePage(WebDriver driver)
	{
		super();	
	}
	
	//Elements
	@FindBy (xpath="//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/a/span")
	WebElement linkMyAccount;
	
	@FindBy(xpath="//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[1]/a")
	WebElement linkRegister;
	
	//actions
	public void clickMyAccount()
	{
		linkMyAccount.click();
	}
	
	public void clickRegister()
	{
		linkRegister.click();
	}
}
