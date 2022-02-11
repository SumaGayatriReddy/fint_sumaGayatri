package executerScripts;

import org.testng.annotations.Test;

import genericScripts.BaseLib;
import pom_salesforce.Dashboard;
public class DashboardScript extends BaseLib{

@Test
public void dashBoard() throws Exception {

	Dashboard dashBoard =  new Dashboard(driver);
	dashBoard.accSelect(); 
	dashBoard.conSelect(); 
	dashBoard.oppSelect();
	dashBoard.taskSelect(); 
	dashBoard.noteSelect(); 
}


}
