package pom_salesforce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opportunities {
	@FindBy(xpath="//input[@name='Name'] ")
	//@FindBy(css="input[name=Name]")
	WebElement opportunityName;
	@FindBy(xpath="//input[@placeholder='Search Accounts...'] ")
	WebElement searchAccount;
	@FindBy(xpath="(//ul[@role='group'])/li[1]")
	WebElement selectAccount;
	@FindBy(xpath="//input[@name='CloseDate']")
	WebElement  closeDate;
	@FindBy(xpath="// input[@name='CloseDate'] ")
	WebElement  selectCloseDate;
	@FindBy(xpath="(// input[@aria-haspopup='listbox'])[4]")
	WebElement stage;
	//@FindBy(xpath="//lightning-base-combobox-item[@data-value='Needs Analysis']")
	//WebElement stageSelect;			
	@FindBy(xpath="//button[@name='SaveEdit']")
	WebElement save;
	@FindBy(xpath="//button[@name='CancelEdit']")
	WebElement cancel;
	WebDriver driver;
	
	public Opportunities(WebDriver  driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public void createOpportunity()   
	{
		opportunityName.sendKeys("Logic");
		System.out.println("Opportunity Name");
		searchAccount.sendKeys("De");
		System.out.println("Search");	
		System.out.println(searchAccount.getText());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		selectAccount.click();
		System.out.println("Account Selected");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(selectAccount.getText());
		closeDate.click();
		System.out.println("closeDate");
		selectCloseDate.sendKeys("15/06/2019");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//System.out.println("closeDate Select");
		stage.click();
		System.out.println("Stage");
		//stageSelect.click();
		System.out.println("Stage Select");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		save.click();
		System.out.println("click on save");
		
		//cancel.click();
		//System.out.println("click on cancel");
		
	}
}
