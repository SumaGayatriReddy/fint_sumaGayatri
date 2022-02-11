package executerScripts;

import org.testng.annotations.Test;

import genericScripts.BaseLib;
import pom_salesforce.Dashboard;
import pom_salesforce.Account;

public class AccountScript extends BaseLib{

@Test
public void account() throws Exception {

	Dashboard dashBoard =  new Dashboard(driver);
	Account account = new Account(driver);
	
	dashBoard.accSelect(); 
	dashBoard.createAccount();
	
	account.createNew();
}

}
