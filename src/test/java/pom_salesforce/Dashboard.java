package pom_salesforce;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



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
	@FindBy(xpath="//*[@data-id='Task']//div/one-app-nav-bar-menu-button/a")
	WebElement taskdropDwn;
	@FindBy(xpath="//span[text()='New Task']")
	WebElement newTask;
	
	@FindBy(xpath="//*[@data-id='ContentNote']")
	WebElement noteBtn;
	@FindBy(xpath="//div[@title='New']")
	WebElement newNote;
	
	@FindBy(xpath="//*[@data-id='home']/a")	
	WebElement homeBtn;

public Dashboard(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	System.out.println("Dashboard");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
	System.out.println(newTask.getText());
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