package pom_salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasks {
	@FindBy(xpath="(//input[@role='combobox'])[3]")
	WebElement subject;
	@FindBy(xpath="//button[@title='Save']")
	WebElement save;
	@FindBy(xpath="//button[@title='Cancel']")
	WebElement cancel;
	 WebDriver driver;
	
	public Tasks(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	public void createNewTask() 
	{	
		System.out.println("subject");
		subject.click();
		subject.sendKeys("  Reminder : Call in 15 minutes ");
		System.out.println("subject");
		save.click();
		System.out.println("click on save");
		//cancel.click();
		//System.out.println("click on cancel");
		
	}
}
