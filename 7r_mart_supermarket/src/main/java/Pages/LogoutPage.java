package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LogoutPage {
	public WebDriver driver;
	public LogoutPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='nav-link' and @data-toggle='dropdown']")WebElement userlogo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']")WebElement logout;
	
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

