package pom_salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {

	//@FindBy(css="input[name='salutation']")
	//@FindBy(xpath="//input[@name='salutation']")
	@FindBy(xpath="(//lightning-base-combobox-item[@role='option'])[3]")
	WebElement salutation;
	//@FindBy(css=" [name='firstName']")
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstName;
	//@FindBy(css="[name='middleName']")
	@FindBy(xpath="//input[@name='middleName']")
	WebElement middleName;
	//@FindBy(css="[name='lastName']")
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastName;
	//@FindBy(css="input[name='suffix']")
	@FindBy(css="//input[@name='suffix']")
	WebElement suffix;
	//@FindBy(css="input[name='Search Accounts...']")
	@FindBy(xpath="//input[@placeholder='Search Accounts...']")
	WebElement searchAccount;
	@FindBy(xpath="(//ul[@role='group'])//li[1]")
	WebElement selectAccount;
	//@FindBy(css="input[name='Search Contacts...']")
	@FindBy(xpath="//input[@name='Search Contacts...']")
	WebElement reports;
	//@FindBy(css="input[name='Title']")
	@FindBy(xpath="//input[@name='Title']")
	WebElement title;
	//@FindBy(css="input[name='Email']")
	@FindBy(xpath="//input[@name='Email']")
	WebElement email;
	//@FindBy(css="input[name='Phone']")
	@FindBy(xpath="//input[@name='Phone']")	
	WebElement phone;
	//@FindBy(css="input[name='Department']")
	@FindBy(xpath="//input[@name='Department']")
	WebElement department;
	//@FindBy(css="input[name='Fax']")
	@FindBy(xpath="//input[@name='Fax']")
	WebElement fax;
	//@FindBy(css="textarea[name='street']")
	@FindBy(xpath="//textarea[@name='street']")
	WebElement street;
	//@FindBy(css="input[name='city']")
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	//@FindBy(css="input[name='province']")
	@FindBy(xpath="//input[@name='province']")
	WebElement state;
	@FindBy(xpath="//input[@name='postalCode']")
	//@FindBy(css="input[name='postalCode']")
	WebElement code;
	//@FindBy(css="input[name='country']")
	@FindBy(xpath="//input[@name='country']")
	WebElement country;
	//@FindBy(css="button[name='SaveEdit']")
	@FindBy(xpath="//button[@name='SaveEdit']")
	WebElement save;
	@FindBy(xpath="//button[@name='CancelEdit']")
	WebElement cancel;
	
	public Contact(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void createContactNew()  
	{
		
		//salutation.click();
		//System.out.println("salutation");
		firstName.sendKeys("ABCD");
		System.out.println("Firstname");
		lastName.sendKeys("ZXYW");
		System.out.println("contact name");
		searchAccount.sendKeys("Ma");
		System.out.println("Search");	
		System.out.println(searchAccount.getText());
		selectAccount.click();
		System.out.println("Account Selected");
		System.out.println(selectAccount.getText());
		save.click();
		System.out.println("click on save");
		
		//cancel.click();
		//System.out.println("click on cancel");
	}
}
