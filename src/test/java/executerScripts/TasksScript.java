package executerScripts;

import org.testng.annotations.Test;

import genericScripts.BaseLib;
import pom_salesforce.Dashboard;
import pom_salesforce.Tasks;

public class TasksScript extends BaseLib{


@Test
public void createNewTask() throws Exception {
	Dashboard dashBoard =  new Dashboard(driver);
	dashBoard.taskSelect(); 
	dashBoard.createTask();
	Tasks task= new Tasks(driver);
	task.createNewTask();
}


}
