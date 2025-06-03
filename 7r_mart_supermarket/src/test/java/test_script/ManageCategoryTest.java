package test_script;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ManageCategoryPage;

public class ManageCategoryTest extends Base{

@Test
public void manageCategoryTest() throws AWTException
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	
	ManageCategoryPage managecategorypage=new ManageCategoryPage(driver);
	managecategorypage.moreinfo();
	managecategorypage.newbutton();
	managecategorypage.category();
	managecategorypage.selectgroup();
	managecategorypage.choosefile();
	managecategorypage.save();
	boolean isalertdisplayed=managecategorypage.alert();
	Assert.assertTrue(isalertdisplayed);
	
}
}
