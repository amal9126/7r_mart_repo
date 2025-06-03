package test_script;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.LogoutPage;

public class LogoutTest extends Base{

@Test
public void logouttest()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	
	LogoutPage logoutpage=new LogoutPage(driver);
	logoutpage.userlogo();
	
	logoutpage.logout();
}
}
