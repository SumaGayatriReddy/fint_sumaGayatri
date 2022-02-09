package pom_salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opportunities {
	//@FindBy(xpath="//input[@name='Name'] ")
	@FindBy(css="input[name=Name]")
	WebElement opportunityName;
	@FindBy(xpath="//input[@placeholder='Search Accounts...'] ")
	WebElement searchAccount;
	@FindBy(xpath="(//ul[@role='group'])/li[1]")
	WebElement selectAccount;
	@FindBy(xpath="//input[@name='CloseDate']")
	WebElement  closeDate;
	//@FindBy(xpath=" ")
	//WebElement  selectCloseDate;
	@FindBy(xpath="(//input[@aria-readonly='true'])[2]")
	WebElement stage;
	@FindBy(xpath="(//div[@role='listbox'])[4]/lightning-base-combobox-item[3]")
	WebElement stageSelect;			
	@FindBy(xpath="//button[@name='SaveEdit']")
	WebElement save;
	@FindBy(xpath="//button[@name='CancelEdit']")
	WebElement cancel;
	
	public Opportunities(WebDriver  driver)
	{
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void createOpportunity()   
	{
		opportunityName.sendKeys("ActivTrak");
		System.out.println("Opportunity Name");
		searchAccount.sendKeys("Ta");
		System.out.println("Search");	
		System.out.println(searchAccount.getText());
		selectAccount.click();
		System.out.println("Account Selected");
		System.out.println(selectAccount.getText());
		closeDate.click();
		System.out.println("closeDate");
		//closeDate.sendKeys(11/9/2021);
		//System.out.println("closeDate Select");
		stage.click();
		System.out.println("Stage");
		stageSelect.click();
		System.out.println("Stage Select");
		save.click();
		System.out.println("click on save");
		
		//cancel.click();
		//System.out.println("click on cancel");
		
	}
}
