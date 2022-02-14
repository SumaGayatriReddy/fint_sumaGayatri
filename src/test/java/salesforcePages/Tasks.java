package salesforcePages;

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
		
		PageFactory.initElements(driver, this);
		
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
