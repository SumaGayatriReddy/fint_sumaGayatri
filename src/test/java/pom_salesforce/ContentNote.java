package pom_salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentNote {
	@FindBy(xpath ="//input[@placeholder='Untitled Note']")
	WebElement Title;
	@FindBy(xpath ="//div[@data-placeholder='Enter a note...']")
	WebElement note;
	@FindBy(xpath="//span[text()='Add to Records]")
	WebElement add;
	
	
	public ContentNote(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void createNoteNew() 
	{
		Title.sendKeys("Key Points");
		System.out.println("Title");
		note.sendKeys("A(1),B(2)");
		System.out.println("Content");
		add.click();
		System.out.println("click on add");
		
	}
}
