package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageContactPage;
import constant.Constant;

public class ManageContactTest extends Base{
	ManageContactPage managecontactpage;
	HomePage homepage;
@Test (description="verify whether the user is able to add new contact information in the manage contact page")
public void manageContactTest()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	homepage=loginpage.clickTheSignInButton();
	//ManageContactPage managecontactpage=new ManageContactPage(driver);
	String mail="varsha1234@gmail.com";
	String phone="1234567890";
	String address="abc,kzm,tvm";
	String dtime="5";
	String dcharge="15";
	managecontactpage=homepage.moreInfoManageContactPage();
	managecontactpage.actionbutton().phone(phone).email(mail).address(address).deliverytime(dtime).deliverychargelimit(dcharge).update();
	//managecontactpage.phone(phone);
	//managecontactpage.email(mail);
	//managecontactpage.address(address);
	//managecontactpage.deliverytime(dtime);
	//managecontactpage.deliverychargelimit(dcharge);
	//managecontactpage.deliverytime(dtime);
	//managecontactpage.update();
	boolean isalertdisplayed=managecontactpage.alert();
	Assert.assertTrue(isalertdisplayed,Constant.CREATEUSERERROR);
}
}
