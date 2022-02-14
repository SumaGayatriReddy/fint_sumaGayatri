package salesforcePagesTestScripts;

import org.testng.annotations.Test;

import genericBaseScript.BaseLibrary;
import salesforcePages.Homepage;
import salesforcePages.Logout;

public class LogoutScript extends BaseLibrary{
	@Test
	public void logOut() throws Exception {
		
		Homepage dashBoard =  new Homepage(driver);
		Logout signOut = new Logout(driver);
		
		dashBoard.home();
		signOut.logOut();
	}
}
