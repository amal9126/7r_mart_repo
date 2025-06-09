package test_script;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import constant.Constant;
import utilities.ExcelUtility;

public class LoginTest extends Base {
@Test(groups= {"regression"}, description="verify whether the user is able to login to the website with correct username and password", retryAnalyzer=retry.Retry.class)
public void verifyWhetherUserIsAbleToLoginWithValidUsernamePassword() throws IOException
{
	//String name="admin";
	//String password="admin";
	String name=ExcelUtility.getStringData(1, 0, "loginpage");
	String password=ExcelUtility.getStringData(1, 1, "loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name).enterThePassword(password).clickTheSignInButton();
	//loginpage.enterThePassword(password);
	//loginpage.clickTheSignInButton();
	boolean ishomepageavailable=loginpage.isdashboarddisplay();
	Assert.assertTrue(ishomepageavailable,Constant.LOGINCORRECTUSERNAMEPASSWORD);
}
@Test (description="verify whether the user is able to login to the website with correct username and incorrect password")
public void verifyWhetherUserIsAbleToLoginWithValidUsernameAndInvalidPassword() throws IOException
{
	//String name="admin";
	//String password="abcd";
	String name=ExcelUtility.getStringData(2, 0, "loginpage");
	String password=ExcelUtility.getStringData(2, 1, "loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name).enterThePassword(password).clickTheSignInButton();
	//loginpage.enterThePassword(password);
	//loginpage.clickTheSignInButton();
	boolean isalertdisplayed=loginpage.isalertdisplayed();
	Assert.assertTrue(isalertdisplayed,Constant.LOGINCORRECTUSERNAMEWRONGPASSWORD);
}
@Test (description="verify whether the user is able to login to the website with incorrect username and correct password")
public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameAndValidPassword() throws IOException
{
	//String name="user";
	//String password="admin";
	String name=ExcelUtility.getStringData(3, 0, "loginpage");
	String password=ExcelUtility.getStringData(3, 1, "loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name).enterThePassword(password).clickTheSignInButton();
	//loginpage.enterThePassword(password);
	//loginpage.clickTheSignInButton();
	boolean isalertdisplayed=loginpage.isalertdisplayed();
	Assert.assertTrue(isalertdisplayed,Constant.LOGINWRONGUSERNAMECORRECTPASSWORD);
}
@Test (description="verify whether the user is able to login to the website with incorrect username and incorrect password")
public void verifyWhetherUserIsAbleToLoginWithInvalidUsernameAndInvalidPassword() throws IOException
{
	//String name="user";
	//String password="abcd";
	String name=ExcelUtility.getStringData(4, 0, "loginpage");
	String password=ExcelUtility.getStringData(4, 1, "loginpage");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name).enterThePassword(password).clickTheSignInButton();
	//loginpage.enterThePassword(password);
	//loginpage.clickTheSignInButton();
	boolean isalertdisplayed=loginpage.isalertdisplayed();
	Assert.assertTrue(isalertdisplayed,Constant.LOGINWRONGUSERNAMEPASSWORD);
}

}

