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

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and contains(@class,'small-box-footer')]")WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement createnew;
	@FindBy(xpath="//input[@id='username']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//select[@id='user_type']")WebElement selectuser;
	@FindBy(xpath="//button[@name='Create']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	



public void moreInfo()
{
	moreinfo.click();
}

public void createnew()
{
	createnew.click();
}
public void username(String enterusername)
{
	username.sendKeys(enterusername);
}
public void password(String enterpassword)
{
	password.sendKeys(enterpassword);
}
public void userType()
{
	Select select=new Select(selectuser);
	select.selectByVisibleText("Staff");
	//
}
public void save()
{
	save.click();
}
public boolean alert()
{
	return alert.isDisplayed();
}

}