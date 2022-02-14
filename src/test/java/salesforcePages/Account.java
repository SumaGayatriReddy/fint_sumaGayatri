package salesforcePages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Account {
	@FindBy(xpath="(//input[@role='combobox'])[3]")
	WebElement accountSearch;
	@FindBy(xpath="(//ul[@class='lookup__list  visible'])[1]//li[1]")
	WebElement accountName;
	
	@FindBy(xpath="//button[@title='Save']")
	WebElement save;
	@FindBy(xpath="//button[@title='Cancel']")
	WebElement cancel;
	WebDriver driver;
	
	public Account(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void createNew()   
	{
		accountSearch.click();
		accountSearch.sendKeys("Samsung");
		accountSearch.sendKeys(Keys.RETURN);
		System.out.println("Account search");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(accountName));
		System.out.println("Account Name");
		System.out.println(accountName.getText()+"Account");
		accountName.click();
		save.click();
		System.out.println("click on save");
		
		//cancel.click();
		//System.out.println("click on cancel");
		
	}
}
