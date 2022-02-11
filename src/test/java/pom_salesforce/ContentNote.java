package pom_salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContentNote {
	@FindBy(xpath ="//input[@class='inputText notesTitle flexInput input']")
	WebElement Title;
	@FindBy(xpath ="//div[@data-placeholder='Enter a note...']")
	WebElement note;
	@FindBy(xpath="//span[@class='slds-p-left--x-small']//span[text()='Done']")
	WebElement done;
	//@FindBy(xpath="//span[text()='Add to Records']//parent::button")
	//@FindBy(xpath="//span[text()='Add to Records']")
	@FindBy(xpath="//span[text()='Add to Records']//parent::button/parent::div//parent::div")
	WebElement add;
	@FindBy(xpath="//span[normalize-space()='Delete']")
	WebElement delete;
	WebDriver driver;

	public ContentNote(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	}
	public void createNoteNew() 
	{
		Title.clear();
		Title.sendKeys("Documentation");
		System.out.println("Title");
		note.clear();
		note.sendKeys(" Activity : story , user story, epic story");
		System.out.println("Content");
		
	}
	public void addNote()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
		System.out.println("click on add");
		add.click();
		System.out.println("success");
		
	}
}
