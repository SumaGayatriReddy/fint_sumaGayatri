package salesforcePagesTestScripts;

import org.testng.annotations.Test;

import genericBaseScript.BaseLibrary;
import salesforcePages.Login;


public class LoginScript extends BaseLibrary{

@Test
public void logIn()  {

	Login login= new Login(driver);
	
	//login.loginActivity();
	login.rememberMe();
	//login.submit();
	login.forgotPassword();
}

}
