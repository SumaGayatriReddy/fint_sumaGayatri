package salesforcePagesTestScripts;

import org.testng.annotations.Test;

import genericBaseScript.BaseLibrary;
import salesforcePages.Homepage;
public class HomepageScript extends BaseLibrary{

@Test
public void dashBoard()  {

	Homepage dashBoard =  new Homepage(driver);
	
	dashBoard.accountSelect(); 
	dashBoard.contactSelect(); 
	dashBoard.opportunitySelect();
	dashBoard.taskSelect(); 
	dashBoard.noteSelect(); 
}


}
