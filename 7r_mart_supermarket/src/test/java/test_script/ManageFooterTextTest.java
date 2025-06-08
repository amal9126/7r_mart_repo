package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageFooterText;
import constant.Constant;

public class ManageFooterTextTest extends Base{
	ManageFooterText managefootertext;
	HomePage homepage;

@Test (description="verify whether the user is able to add new information to the manage footer text page")
public void ManageFooterTest()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	homepage=loginpage.clickTheSignInButton();
	
	ManageFooterText managefootertest=new ManageFooterText(driver);
	managefootertext=homepage.moreInfoManageFooterText();
	managefootertext.actionbutton().address().email().phone().update();
	//managefootertext.address();
	//managefootertext.email();
	//managefootertext.phone();
	//managefootertext.update();
	boolean isalertdisplayed=managefootertest.alert();
	Assert.assertTrue(isalertdisplayed,Constant.CREATEFOOTERMESSAGEERROR);
}

@Test (description="verify whether the update button is displayed in the manage footer text page")
public void isUpdateButtonDisplayed()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	homepage=loginpage.clickTheSignInButton();
	
	ManageFooterText managefootertest=new ManageFooterText(driver);
	managefootertext=homepage.moreInfoManageFooterText();
	managefootertext.actionbutton().isUpdateButtonDisplayed();
	//managefootertext.isUpdateButtonDisplayed();
}
}
