package salesforcePagesTestScripts;

import org.testng.annotations.Test;

import genericBaseScript.BaseLibrary;
import salesforcePages.Homepage;
import salesforcePages.Opportunities;

public class OpportunitiesScript extends BaseLibrary{
@Test
public void createNewOpportunity()  {
	
	Homepage dashBoard =  new Homepage(driver);
	Opportunities opportuntiy = new Opportunities(driver);
	
	dashBoard.opportunitySelect(); 
	dashBoard.createOpportunity();
	
	opportuntiy.createOpportunity();
}


}
