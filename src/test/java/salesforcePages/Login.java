package salesforcePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy (id = "username")
	private WebElement userNameTxtBox;
	@FindBy (id = "password")
	private WebElement passwordTxtBox;
	@FindBy (id = "Login")
	private WebElement submitBtn;
	
	@FindBy(css="a#forgot_password_link")
	WebElement forgotPassword;

	@FindBy(css="input[type='checkbox'][name='rememberUn']")
	WebElement rememberMe;
	
	WebDriver driver;
	
	public Login(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
/*	public void loginActivity()
	{
		userNameTxtBox.click();
		passwordTxtBox.click();
	}
	public void submit() {
		submitBtn.click();
		System.out.println("Login Success");
	}*/
	public void forgotPassword()   
	{
		forgotPassword.click();
		System.out.println("Forgot Password");
		
	}
	public void rememberMe()   
	{
		rememberMe.click();
		System.out.println("Remember Me");
		
	}

}
