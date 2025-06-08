package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='nav-link' and @data-toggle='dropdown']")WebElement userlogo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and contains(@class,'small-box-footer')]")WebElement moreInfoAdminUserPage;
	@FindBy(xpath="//a[contains(@href, 'uniqassosiates.com/admin/list-news')]")WebElement moreInfoManageNewsPage;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")WebElement moreInfoManageContactPage;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']")WebElement moreInfoManageCategoryPage;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")WebElement moreInfoManageFooterText;
	
	public AdminUsersPage moreInfoAdminUserPage()
	{
		moreInfoAdminUserPage.click();
		return new AdminUsersPage(driver);
	}

	public ManageNewsPage moreInfoManageNewsPage()
	{
		moreInfoManageNewsPage.click();
		return new ManageNewsPage(driver);
	}
	public ManageContactPage moreInfoManageContactPage()
	{
		moreInfoManageContactPage.click();
		return new ManageContactPage(driver);
	}
	public ManageCategoryPage moreInfoManageCategoryPage()
	{
		moreInfoManageCategoryPage.click();
		return new ManageCategoryPage(driver);
	}
	public ManageFooterText moreInfoManageFooterText()
	{
		moreInfoManageFooterText.click();
		return new ManageFooterText(driver) ;
	}	
	
public void userlogo()
{
	Actions actions=new Actions(driver);
	actions.click(userlogo).build().perform();
	//userlogo.click();
	//Select select=new Select(userlogo);
	//select.selectByVisibleText("Logout");
}
public void logout()
{
	logout.click();
}

}

