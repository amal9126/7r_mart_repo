package test_script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageFooterText;
import constant.Constant;
import utilities.ExcelUtility;

public class ManageFooterTextTest extends Base {
	ManageFooterText managefootertext;
	HomePage homepage;

	@Test(description = "verify whether the user is able to add new information to the manage footer text page")
	public void verifyWhetherUserIsAbleToCreateNewFooterOnManageFooterText() throws IOException {
		// String name="admin";
		// String password="admin";

		String name = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(name).enterThePassword(password);
		// loginpage.enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();

		ManageFooterText managefootertest = new ManageFooterText(driver);
		managefootertext = homepage.moreInfoManageFooterText();
		String address=ExcelUtility.getStringData(1, 0, "managefooter");
		String email=ExcelUtility.getStringData(1, 1, "managefooter");
		String number=ExcelUtility.getIntegerData(1, 2, "managefooter");
		managefootertext.actionbutton().address(address).email(email).phone(number).update();
		// managefootertext.address();
		// managefootertext.email();
		// managefootertext.phone();
		// managefootertext.update();
		boolean isalertdisplayed = managefootertest.isAlertsDisplayMethod();
		Assert.assertTrue(isalertdisplayed, Constant.CREATEMANAGEFOOTERERROR);
	}

	@Test(description = "verify whether the update button is displayed in the manage footer text page")
	public void verifyWhetherTheUpdateButtonIsDisplayedOnManageFooterText() throws IOException {
		// String name="admin";
		// String password="admin";

		String name = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(name);
		loginpage.enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();

		ManageFooterText managefootertest = new ManageFooterText(driver);
		managefootertext = homepage.moreInfoManageFooterText();
		managefootertext.actionbutton().isUpdateButtonDisplayed();
		// managefootertext.isUpdateButtonDisplayed();
		boolean isupdatebuttondisplayedalert=managefootertest.isUpdateButtonDispalyedAlert();
		Assert.assertTrue(isupdatebuttondisplayedalert, Constant.UPDATEBUTTONNOTDISPLAYEDERRORMANAGEFOOTER);
	}
}
