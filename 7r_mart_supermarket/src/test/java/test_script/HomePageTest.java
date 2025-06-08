package test_script;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.HomePage;

public class HomePageTest extends Base{

@Test (description="verify whether the user is able to logout successfully")
public void logouttest()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	
	HomePage logoutpage=new HomePage(driver);
	logoutpage.userlogo();
	
	logoutpage.logout();
}
}
