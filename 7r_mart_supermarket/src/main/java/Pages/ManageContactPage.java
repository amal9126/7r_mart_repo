package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageContactPage {
	public WebDriver driver;
	public ManageContactPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']")WebElement actionbutton;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//button[@type='submit' and @name='Update']")WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//textarea[@id='content' and @name='address']")WebElement address;
	@FindBy(xpath="//textarea[@name='del_time']")WebElement deliverytime;
	@FindBy(xpath="//input[@id='del_limit']")WebElement deliverychargelimit;
	

public void moreinfo()
{
	moreinfo.click();
}
public void actionbutton()
{
	actionbutton.click();
}
public void phone(String enterphonenumber)
{
	phone.clear();
	phone.sendKeys(enterphonenumber);
}
public void email(String enteremail)
{
	email.clear();
	email.sendKeys(enteremail);
}
public void address(String enteraddress)
{
	address.clear();
	address.sendKeys(enteraddress);
}

public void deliverytime(String enterdeliverytime)
{
	deliverytime.clear();
	deliverytime.sendKeys(enterdeliverytime);
}
public void deliverychargelimit(String enterdeliverychargelimit)
{
	deliverychargelimit.clear();
	deliverychargelimit.sendKeys(enterdeliverychargelimit);
}
public void update()
{
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();","update");
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.elementToBeClickable(update));
	Actions actions=new Actions(driver);
	actions.click(update).build().perform();
	//update.click();
}
public boolean alert()
{
	return alert.isDisplayed();
}
}
