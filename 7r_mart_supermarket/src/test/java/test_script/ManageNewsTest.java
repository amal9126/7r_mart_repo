package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.ManageNewsPage;

public class ManageNewsTest extends Base{
@Test
	public void manageNewsTest()
	{
		String name="admin";
		String password="admin";

		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(name);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		String news="new product launch";
		managenewspage.moreInfo();
		managenewspage.createnew();
		managenewspage.text(news);
		managenewspage.save();
		boolean isalertdisplayed=managenewspage.alert();
		Assert.assertTrue(isalertdisplayed);
		
	}

@Test
public void isSaveButtonDisplayed()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	loginpage.clickTheSignInButton();
	
	ManageNewsPage managenewspage=new ManageNewsPage(driver);
	managenewspage.moreInfo();
	managenewspage.createnew();
	
	managenewspage.isSaveButtonDispalyed();
}

@Test
	public void manageNewsDelete()
	{
		
		String name="admin";
		String password="admin";

		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(name);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.moreInfo();
		managenewspage.deleteNews();
		boolean isdeletealertdisplayed=managenewspage.deletealert();
		Assert.assertTrue(isdeletealertdisplayed);
	
	}
}
