package test_script;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ManageNewsPage;
import constant.Constant;

public class ManageNewsTest extends Base{
	ManageNewsPage managenewspage;
	HomePage homepage;
@Test (description="verify whether the user is able to add new news information in the manage news page")
	public void manageNewsTest()
	{
		String name="admin";
		String password="admin";

		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(name);
		loginpage.enterThePassword(password);
		homepage=loginpage.clickTheSignInButton();
		//ManageNewsPage managenewspage=new ManageNewsPage(driver);
		String news="new product launch";
		managenewspage=homepage.moreInfoManageNewsPage();
		managenewspage.createnew().text(news).save();
		//managenewspage.text(news);
		//managenewspage.save();
		boolean isalertdisplayed=managenewspage.alert();
		Assert.assertTrue(isalertdisplayed,Constant.CREATENEWSERROR);
		
	}

@Test (description="verify whether the save button is displayed in the manage news page")
public void isSaveButtonDisplayed()
{
	String name="admin";
	String password="admin";

	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterTheUsername(name);
	loginpage.enterThePassword(password);
	homepage=loginpage.clickTheSignInButton();
	
	//ManageNewsPage managenewspage=new ManageNewsPage(driver);
	managenewspage=homepage.moreInfoManageNewsPage();
	managenewspage.createnew().isSaveButtonDispalyed();
	//managenewspage.isSaveButtonDispalyed();
}

@Test (description="verify whether the user is able to delete a news in the manage news page")
	public void manageNewsDelete()
	{
		
		String name="admin";
		String password="admin";

		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(name);
		loginpage.enterThePassword(password);
		homepage=loginpage.clickTheSignInButton();
		//ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage=homepage.moreInfoManageNewsPage();
		managenewspage.deleteNews();
		boolean isdeletealertdisplayed=managenewspage.deletealert();
		Assert.assertTrue(isdeletealertdisplayed,Constant.DELETENEWSERROR);
	
	}
}
