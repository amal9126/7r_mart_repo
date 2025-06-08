package test_script;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import constant.Constant;
import utilities.ExcelUtility;

public class LoginTest extends Base {
@Test(groups= {"regression"}, description="verify whether the user is able to login to the website with correct username and password", retryAnalyzer=retry.Retry.class)
public void logintest() throws IOException
{
	//String name="admin";
	//String password="admin";
	String name=ExcelUtility.getStringData(1, 0, "loginpage");
	String password=ExcelUtility.getStringData(1, 1, "loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean ishomepageavailable=loginpage.isdashboarddisplay();
	Assert.assertTrue(ishomepageavailable,Constant.LOGINCORRECTUSERNAMEPASSWORD);
}
@Test (description="verify whether the user is able to login to the website with correct username and incorrect password")
public void logintest1()
{
	String name="admin";
	String password="abcd";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertdisplayed=loginpage.isalertdisplayed();
	Assert.assertTrue(isalertdisplayed,Constant.LOGINCORRECTUSERNAMEWRONGPASSWORD);
}
@Test (description="verify whether the user is able to login to the website with incorrect username and correct password")
public void logintest2()
{
	String name="user";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertdisplayed=loginpage.isalertdisplayed();
	Assert.assertTrue(isalertdisplayed,Constant.LOGINWRONGUSERNAMECORRECTPASSWORD);
}
@Test (description="verify whether the user is able to login to the website with incorrect username and incorrect password")
public void logintest3()
{
	String name="user";
	String password="abcd";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	boolean isalertdisplayed=loginpage.isalertdisplayed();
	Assert.assertTrue(isalertdisplayed,Constant.LOGINWRONGUSERNAMEPASSWORD);
}

}

