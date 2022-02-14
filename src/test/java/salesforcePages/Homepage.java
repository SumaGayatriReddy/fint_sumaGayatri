package salesforcePages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Homepage {
	@FindBy(xpath="//*[@data-id='Account']")
	WebElement accountBtn;
	@FindBy(xpath="//a[@title='New']")
	WebElement newAccount;

	@FindBy(xpath="//*[@data-id='Contact']")
	WebElement contactBtn;
	@FindBy(xpath="//*[@data-id='Contact']//div/one-app-nav-bar-menu-button/a")
	WebElement contactdropDown;
	@FindBy(css="a[title='New']")
	WebElement newContact;
	
	@FindBy(xpath="//*[@data-id='Opportunity']")
	WebElement opportunityBtn;
	@FindBy(xpath="//div[@title='New']")
	WebElement newOpportunity;
	
	@FindBy(xpath="//*[@data-id='Task']")
	WebElement taskBtn;
	@FindBy(xpath="//a[@class='slds-button slds-button--icon-x-small slds-button--icon-border-filled']")
	WebElement taskdropDown;
	@FindBy(xpath="//a[@title='New Task']//parent::li//parent::ul//parent::div//parent::div")
	WebElement newTask;
	
	@FindBy(xpath="//*[@data-id='ContentNote']")
	WebElement noteBtn;
	@FindBy(xpath="//div[@title='New']")
	WebElement newNote;
	
	@FindBy(xpath="//*[@data-id='home']/a")	
	WebElement homeBtn;
	WebDriver driver;

public Homepage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	System.out.println("Dashboard");
	
}

public void accountSelect()   {  

	accountBtn.click();
	System.out.println(accountBtn.getText());
	
}
public void createAccount()   { 
	newAccount.click();
	System.out.println(newAccount.getText());
	
}  
public void contactSelect()   {  

	contactBtn.click();
	System.out.println(contactBtn.getText());
	contactdropDown.click();
	System.out.println("dropDown click");
	System.out.println(contactdropDown.getText());
	System.out.println(contactdropDown.getTagName());
}
public void createContact() 
{
	newContact.click();
	System.out.println(newContact.getText());
	
}  
public void opportunitySelect() 
{  
	
	opportunityBtn.click();
	System.out.println(opportunityBtn.getText());

	}
public void createOpportunity() 
{
	newOpportunity.click();
	System.out.println(newOpportunity.getText());
	
}  

public void taskSelect() 
{  

	taskBtn.click();
	System.out.println(taskBtn.getText());

}
public void createTask() 
{
	taskdropDown.click();
	System.out.println(taskdropDown.getText());
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf(newTask));
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
public void home()
{
	System.out.println("Dashboard Homepage");
	homeBtn.getText();
	System.out.println(homeBtn.getText());
}
}