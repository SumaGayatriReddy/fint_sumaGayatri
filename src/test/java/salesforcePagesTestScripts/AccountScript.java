package salesforcePagesTestScripts;

import org.testng.annotations.Test;

import genericBaseScript.BaseLibrary;
import salesforcePages.Account;
import salesforcePages.Homepage;

public class AccountScript extends BaseLibrary{

@Test
public void account()  {

	Homepage dashBoard =  new Homepage(driver);
	Account account = new Account(driver);
	
	dashBoard.accountSelect(); 
	dashBoard.createAccount();
	
	account.createNew();
}

}
