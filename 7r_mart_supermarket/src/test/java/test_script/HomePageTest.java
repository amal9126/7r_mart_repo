package test_script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import constant.Constant;
import utilities.ExcelUtility;
import Pages.HomePage;

public class HomePageTest extends Base {
	HomePage homepage;

	@Test(description = "verify whether the user is able to logout successfully")
	public void verifyWhetherUserIsAbleToLogout() throws IOException {
		// String name="admin";
		// String password="admin";

		String name = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(name).enterThePassword(password);
		// loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();

		HomePage logoutpage = new HomePage(driver);
		logoutpage.userlogo();

		logoutpage.logout();
		
		boolean islogoutdisplayed=homepage.isLogoutDisplayed();
		Assert.assertTrue(islogoutdisplayed, Constant.LOGOUTDISPLAYEDERRORHOMEPAGE);
	}
}
