package salesforcePagesTestScripts;

import org.testng.annotations.Test;

import genericBaseScript.BaseLibrary;
import salesforcePages.ContentNote;
import salesforcePages.Homepage;

public class ContentNoteScript extends BaseLibrary{
@Test
public void contentNewNote()  {
	
	Homepage dashBoard =  new Homepage(driver);
	ContentNote contact = new ContentNote(driver);

	dashBoard.noteSelect(); 
	dashBoard.createNote();
	
	contact.createNoteNew();
	contact.addNote();
}


}
