package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AdminUsersPage;
import Pages.HomePage;
import Pages.LoginPage;
import constant.Constant;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	AdminUsersPage adminuserspage;
	HomePage homepage;
	
@Test (description="verify whether the user is able to add new data in the Admin user page",retryAnalyzer=retry.Retry.class)
	public void adminUsersTest()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	homepage=loginpage.clickTheSignInButton();
	//AdminUsersPage adminuserspage=new AdminUsersPage(driver);
	//String user="Amal";
	//String pass="abcd1234";
	FakerUtility faker=new FakerUtility();
	String user=faker.creatARandomFirstName();
	String pass=faker.creatARandomFirstName();
	adminuserspage=homepage.moreInfoAdminUserPage();
	adminuserspage.createnew().username(user).password(pass).userType().save();
	//adminuserspage.username(user);
	//adminuserspage.password(pass);
	//adminuserspage.userType();
	//adminuserspage.save();
	boolean isalertdisplayed=adminuserspage.alert();
	Assert.assertTrue(isalertdisplayed, Constant.CREATEADMINUSERERROR);
}
}
