package pom_salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Account {
	@FindBy(xpath="(//input[@role='combobox'])[3]")
	WebElement accSearch;
	@FindBy(xpath="(//ul[@class='lookup__list  visible'])[1]//li[1]")
	WebElement accName;
	
	@FindBy(xpath="//button[@title='Save']")
	WebElement save;
	@FindBy(xpath="//button[@title='Cancel']")
	WebElement cancel;
	WebDriver driver;
	
	public Account(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void createNew()   
	{
		accSearch.click();
		accSearch.sendKeys("Macy");
		System.out.println("Account search");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(accName));
		System.out.println("Account Name");
		System.out.println(accName.getText()+"Account");
		accName.click();
		
		save.click();
		System.out.println("click on save");
		
		//cancel.click();
		//System.out.println("click on cancel");
		
	}
}
