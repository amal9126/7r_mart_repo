package test_script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageNewsPage;
import constant.Constant;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {
	ManageNewsPage managenewspage;
	HomePage homepage;

	@Test(description = "verify whether the user is able to add new news information in the manage news page")
	public void verifyWhetherUserIsAbleToCreateNewNewsOnManageNews() throws IOException {
		// String name="admin";
		// String password="admin";

		String name = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(name).enterThePassword(password);
		// loginpage.enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		// ManageNewsPage managenewspage=new ManageNewsPage(driver);
		String news = "new product launch";
		managenewspage = homepage.moreInfoManageNewsPage();
		managenewspage.createnew().text(news).save();
		// managenewspage.text(news);
		// managenewspage.save();
		boolean isalertdisplayed = managenewspage.isAlertsDisplayMethod();
		Assert.assertTrue(isalertdisplayed, Constant.CREATENEWSERROR);

	}

	@Test(description = "verify whether the save button is displayed in the manage news page")
	public void verifyWhetherTheSaveButtonIsDisplayedOnTheManageNews() throws IOException {
		// String name="admin";
		// String password="admin";

		String name = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(name);
		loginpage.enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();

		// ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage = homepage.moreInfoManageNewsPage();
		managenewspage.createnew().isSaveButtonDispalyed();
		// managenewspage.isSaveButtonDispalyed();
	}

	@Test(description = "verify whether the user is able to delete a news in the manage news page")
	public void verifyWhetherUserIsAbleToDeleteNewsOnManageNews() throws IOException {

		// String name="admin";
		// String password="admin";

		String name = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(name);
		loginpage.enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		// ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage = homepage.moreInfoManageNewsPage();
		managenewspage.deleteNews();
		boolean isdeletealertdisplayed = managenewspage.deletealert();
		Assert.assertTrue(isdeletealertdisplayed, Constant.DELETENEWSERROR);

	}
}
