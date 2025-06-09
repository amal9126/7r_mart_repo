package test_script;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageCategoryPage;
import constant.Constant;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {
	ManageCategoryPage managecategorypage;
	HomePage homepage;

	@Test(description = "verify whether the user is able to add new category in the manage category page")
	public void verifyWhetherUserIsAbleTocreateNewCreategoryOnManageCategory() throws AWTException, IOException {
		// String name="admin";
		// String password="admin";

		String name = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(name).enterThePassword(password);
		// loginpage.enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();

		// ManageCategoryPage managecategorypage=new ManageCategoryPage(driver);
		managecategorypage = homepage.moreInfoManageCategoryPage();
		managecategorypage.newButton().category().selectGroup().choosefile().save();
		// managecategorypage.category();
		// managecategorypage.selectGroup();
		// managecategorypage.choosefile();
		// managecategorypage.save();
		boolean isalertdisplayed = managecategorypage.isAlertsDisplayMethod();
		Assert.assertTrue(isalertdisplayed, Constant.CREATECATEGORYERROR);

	}
}
