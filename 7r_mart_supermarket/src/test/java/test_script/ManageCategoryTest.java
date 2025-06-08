package test_script;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageCategoryPage;
import constant.Constant;

public class ManageCategoryTest extends Base{
	ManageCategoryPage managecategorypage;
	HomePage homepage;

@Test (description="verify whether the user is able to add new category in the manage category page")
public void manageCategoryTest() throws AWTException
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	homepage=loginpage.clickTheSignInButton();
	
	//ManageCategoryPage managecategorypage=new ManageCategoryPage(driver);
	managecategorypage=homepage.moreInfoManageCategoryPage();
	managecategorypage.newbutton().category().selectgroup().choosefile().save();
	//managecategorypage.category();
	//managecategorypage.selectgroup();
	//managecategorypage.choosefile();
	//managecategorypage.save();
	boolean isalertdisplayed=managecategorypage.alert();
	Assert.assertTrue(isalertdisplayed,Constant.CREATECATEGORYERROR);
	
}
}
