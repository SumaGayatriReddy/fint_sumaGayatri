package executerScripts;

import org.testng.annotations.Test;

import genericScripts.BaseLib;
import pom_salesforce.Dashboard;
import pom_salesforce.ContentNote;

public class ContentNoteScript extends BaseLib{
@Test
public void contentNewNote() throws Exception {
	
	Dashboard dashBoard =  new Dashboard(driver);
	ContentNote contact = new ContentNote(driver);

	dashBoard.noteSelect(); 
	dashBoard.createNote();
	
	contact.createNoteNew();
	contact.addNote();
}


}
