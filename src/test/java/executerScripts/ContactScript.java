package executerScripts;

import org.testng.annotations.Test;

import genericScripts.BaseLib;
import pom_salesforce.Dashboard;
import pom_salesforce.Contact;

public class ContactScript extends BaseLib{
@Test
public void contact() throws Exception {
	Dashboard dashBoard =  new Dashboard(driver);
	dashBoard.conSelect(); 
	dashBoard.createContact();
	Contact contact = new Contact(driver);
	contact.createContactNew();
}



}
