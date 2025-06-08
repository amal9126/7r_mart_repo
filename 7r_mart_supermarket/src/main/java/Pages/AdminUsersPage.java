package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
		
	}

	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and contains(@class,'small-box-footer')]")WebElement moreInfoAdminUserPage;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement createnew;
	@FindBy(xpath="//input[@id='username']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//select[@id='user_type']")WebElement selectuser;
	@FindBy(xpath="//button[@name='Create']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	



/* public void moreInfoAdminUserPage()
{
	moreInfoAdminUserPage.click();
} */

public AdminUsersPage createnew()
{
	createnew.click();
	return this;
}
public AdminUsersPage username(String enterusername)
{
	username.sendKeys(enterusername);
	return this;
}
public AdminUsersPage password(String enterpassword)
{
	password.sendKeys(enterpassword);
	return this;
}
public AdminUsersPage userType()
{
	Select select=new Select(selectuser);
	select.selectByVisibleText("Staff");
	//
	return this;
}
public AdminUsersPage save()
{
	save.click();
	return this;
}
public boolean alert()
{
	return alert.isDisplayed();
}

}