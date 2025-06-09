package test_script;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageContactPage;
import constant.Constant;
import utilities.ExcelUtility;

public class ManageContactTest extends Base {
	ManageContactPage managecontactpage;
	HomePage homepage;

	@Test(description = "verify whether the user is able to add new contact information in the manage contact page")
	public void verifyWhetherUserIsAbleToCreateNewContactOnManageContact() throws IOException {
		// String name="admin";
		// String password="admin";

		String name = ExcelUtility.getStringData(1, 0, "loginpage");
		String password = ExcelUtility.getStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(name).enterThePassword(password);
		// loginpage.enterThePassword(password);
		homepage = loginpage.clickTheSignInButton();
		// ManageContactPage managecontactpage=new ManageContactPage(driver);
		/*
		 * String mail = "varsha1234@gmail.com";
		 * String phone = "1234567890"; 
		 * String address = "abc,kzm,tvm";
		 * String dtime = "5"; 
		 * String dcharge = "15";
		 */
		String mail = ExcelUtility.getStringData(1, 0, "managecontact");
		String phone = ExcelUtility.getIntegerData(1, 1, "managecontact");
		String address = ExcelUtility.getStringData(1, 2, "managecontact");
		String dtime = ExcelUtility.getIntegerData(1, 3, "managecontact");
		String dcharge = ExcelUtility.getIntegerData(1, 4, "managecontact");
		managecontactpage = homepage.moreInfoManageContactPage();
		managecontactpage.actionbutton().phone(phone).email(mail).address(address).deliverytime(dtime)
				.deliverychargelimit(dcharge).update();
		// managecontactpage.phone(phone);
		// managecontactpage.email(mail);
		// managecontactpage.address(address);
		// managecontactpage.deliverytime(dtime);
		// managecontactpage.deliverychargelimit(dcharge);
		// managecontactpage.deliverytime(dtime);
		// managecontactpage.update();
		boolean isalertdisplayed = managecontactpage.isAlertsDisplayMethod();
		Assert.assertTrue(isalertdisplayed, Constant.CREATEMANAGECONTACTERROR);
	}
}
