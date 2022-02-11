package pom_salesforce;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Dashboard {
	@FindBy(xpath="//*[@data-id='Account']")
	WebElement accBtn;
	@FindBy(xpath="//a[@title='New']")
	WebElement newAccount;

	@FindBy(xpath="//*[@data-id='Contact']")
	WebElement conBtn;
	@FindBy(xpath="//*[@data-id='Contact']//div/one-app-nav-bar-menu-button/a")
	WebElement dropDwn;
	@FindBy(css="a[title='New']")
	WebElement newContact;
	
	@FindBy(xpath="//*[@data-id='Opportunity']")
	WebElement oppBtn;
	@FindBy(xpath="//div[@title='New']")
	WebElement newOpp;
	
	@FindBy(xpath="//*[@data-id='Task']")
	WebElement taskBtn;
	@FindBy(xpath="//a[@class='slds-button slds-button--icon-x-small slds-button--icon-border-filled']")
	WebElement taskdropDwn;
	@FindBy(xpath="//a[@title='New Task']//parent::li//parent::ul//parent::div//parent::div")
	WebElement newTask;
	
	@FindBy(xpath="//*[@data-id='ContentNote']")
	WebElement noteBtn;
	@FindBy(xpath="//div[@title='New']")
	WebElement newNote;
	
	@FindBy(xpath="//*[@data-id='home']/a")	
	WebElement homeBtn;
	WebDriver driver;

public Dashboard(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	System.out.println("Dashboard");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

public void accSelect()   {  

	accBtn.click();
	System.out.println(accBtn.getText());
	
}
public void createAccount()   { 
	newAccount.click();
	System.out.println(newAccount.getText());
	
}  
public void conSelect()   {  

	conBtn.click();
	System.out.println(conBtn.getText());
	dropDwn.click();
	System.out.println("dropDwn click");
	System.out.println(dropDwn.getText());
	System.out.println(dropDwn.getTagName());
}
public void createContact() 
{
	newContact.click();
	System.out.println(newContact.getText());
	
}  
public void oppSelect() 
{  
	
	oppBtn.click();
	System.out.println(oppBtn.getText());

	}
public void createOpportunity() 
{
	newOpp.click();
	System.out.println(newOpp.getText());
	
}  

public void taskSelect() 
{  

	taskBtn.click();
	System.out.println(taskBtn.getText());

}
public void createTask() 
{
	taskdropDwn.click();
	System.out.println(taskdropDwn.getText());
	WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeClickable(newTask));
	newTask.click();
	System.out.println(newTask.getText());
	
}  
public void noteSelect() 
{  

	noteBtn.click();
	System.out.println(noteBtn.getText());

}
public void createNote() 
{
	newNote.click();
	System.out.println(newNote.getText());
	
}  

}