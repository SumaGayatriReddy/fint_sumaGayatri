package executerScripts;

import org.testng.annotations.Test;

import genericScripts.BaseLib;
import pom_salesforce.Opportunities;
import pom_salesforce.Dashboard;

public class OpportunitiesScript extends BaseLib{
@Test
public void createNewOpportunity() throws Exception {
	
	Dashboard dashBoard =  new Dashboard(driver);
	Opportunities opportuntiy = new Opportunities(driver);
	
	dashBoard.oppSelect(); 
	dashBoard.createOpportunity();
	
	opportuntiy.createOpportunity();
}


}
