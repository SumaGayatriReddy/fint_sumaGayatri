package salesforcePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout {
	@FindBy(xpath="//div[@class='profileTrigger branding-user-profile bgimg slds-avatar slds-avatar_profile-image-small circular forceEntityIcon']")
	WebElement profileIcon;
	@FindBy(xpath="//a[@class='profile-link-label logout uiOutputURL']")
	WebElement logout ;
	
    WebDriver driver;
	
	public Logout(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void logOut() {
		profileIcon.click();
		System.out.println(profileIcon.getText());
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(logout));
		logout.click();
		System.out.println(logout.getText());
	}

}
