package salesforcePagesTestScripts;

import org.testng.annotations.Test;

import genericBaseScript.BaseLibrary;
import salesforcePages.Homepage;
import salesforcePages.Tasks;

public class TasksScript extends BaseLibrary{


@Test
public void createNewTask()  {
	
	Homepage dashBoard =  new Homepage(driver);
	Tasks task= new Tasks(driver);

	dashBoard.taskSelect(); 
	dashBoard.createTask();
	
	task.createNewTask();
}


}
