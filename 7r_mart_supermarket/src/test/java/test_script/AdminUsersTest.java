package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AdminUsersPage;
import Pages.LoginPage;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
@Test (retryAnalyzer=retry.Retry.class)
	public void adminUsersTest()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	AdminUsersPage adminuserspage=new AdminUsersPage(driver);
	//String user="Amal";
	//String pass="abcd1234";
	FakerUtility faker=new FakerUtility();
	String user=faker.creatARandomFirstName();
	String pass=faker.creatARandomFirstName();
	adminuserspage.moreInfo();
	adminuserspage.createnew();
	adminuserspage.username(user);
	adminuserspage.password(pass);
	adminuserspage.userType();
	adminuserspage.save();
	boolean isalertdisplayed=adminuserspage.alert();
	Assert.assertTrue(isalertdisplayed);
}
}
