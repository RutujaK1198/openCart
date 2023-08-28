package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accountRegistrationPage extends baseClass {

	public  accountRegistrationPage (WebDriver driver)
	{
		super();
	}

    //Elements
	@FindBy(name="firstname") WebElement firstName;
	
	@FindBy(name="lastname") WebElement lastName;
	
	@FindBy(name="email") WebElement Email;
	
	@FindBy(name="password") WebElement Password;
	
	@FindBy(id="input-newsletter-no") WebElement noButton;
	
	@FindBy(name="agree") WebElement agreeButton;
	
	@FindBy(xpath="//*[@id=\"form-register\"]/div/div/button") WebElement continueButton;
	
	//actions
	public void setFirstName(String name)
	{
		firstName.sendKeys(name);
	}
	
	public void setLastName(String Lastname)
	{
		lastName.sendKeys(Lastname);
	}
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickNoButton()
	{
		continueButton.click();
	}
	public void clickAgreeButton()
	{
		agreeButton.click();
	}

	public void continueButton()
	{
		noButton.click();
	}
	
	
	
	
}
