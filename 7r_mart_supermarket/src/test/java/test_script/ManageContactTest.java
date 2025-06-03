package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ManageContactPage;

public class ManageContactTest extends Base{
@Test
public void manageContactTest()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	ManageContactPage managecontactpage=new ManageContactPage(driver);
	String mail="varsha1234@gmail.com";
	String phone="1234567890";
	String address="abc,kzm,tvm";
	String dtime="5";
	String dcharge="15";
	managecontactpage.moreinfo();
	managecontactpage.actionbutton();
	managecontactpage.phone(phone);
	managecontactpage.email(mail);
	managecontactpage.address(address);
	managecontactpage.deliverytime(dtime);
	managecontactpage.deliverychargelimit(dcharge);
	//managecontactpage.deliverytime(dtime);
	managecontactpage.update();
	boolean isalertdisplayed=managecontactpage.alert();
	Assert.assertTrue(isalertdisplayed);
}
}
