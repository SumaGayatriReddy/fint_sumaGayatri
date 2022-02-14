package salesforcePagesTestScripts;

import org.testng.annotations.Test;

import genericBaseScript.BaseLibrary;
import salesforcePages.Contact;
import salesforcePages.Homepage;

public class ContactScript extends BaseLibrary{
@Test
public void contact() {

	Homepage dashBoard =  new Homepage(driver);
	Contact contact = new Contact(driver);

	dashBoard.contactSelect(); 
	dashBoard.createContact();
	
	contact.createContactNew();
}



}
