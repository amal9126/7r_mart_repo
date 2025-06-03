package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ManageFooterText;

public class ManageFooterTextTest extends Base{

@Test
public void ManageFooterTest()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	
	ManageFooterText managefootertest=new ManageFooterText(driver);
	managefootertest.moreinfo();
	managefootertest.actionbutton();
	managefootertest.address();
	managefootertest.email();
	managefootertest.phone();
	managefootertest.update();
	boolean isalertdisplayed=managefootertest.alert();
	Assert.assertTrue(isalertdisplayed);
}

@Test
public void isUpdateButtonDisplayed()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	
	ManageFooterText managefootertest=new ManageFooterText(driver);
	managefootertest.moreinfo();
	managefootertest.actionbutton();
	managefootertest.isUpdateButtonDisplayed();
}
}
