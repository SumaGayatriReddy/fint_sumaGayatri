package executerScripts;

import org.testng.annotations.Test;

import genericScripts.BaseLib;
import pom_salesforce.Dashboard;
import pom_salesforce.ContentNote;

public class ContentNoteScript extends BaseLib{
@Test
public void contentNewNote() throws Exception {
	Dashboard dashBoard =  new Dashboard(driver);
	dashBoard.noteSelect(); 
	dashBoard.createNote();
	ContentNote contact = new ContentNote(driver);
	contact.createNoteNew();
}


}
