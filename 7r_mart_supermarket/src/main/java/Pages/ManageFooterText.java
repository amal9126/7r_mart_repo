package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterText
{
	public WebDriver driver;
	public ManageFooterText(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")WebElement moreinfo;
	@FindBy(xpath="//a[contains(@href,'admin/Footertext/edit?edit=1')]")WebElement actionbutton;
	@FindBy(xpath="//textarea[@id='content']")WebElement enteraddress;
	@FindBy(xpath="//input[@id='email']")WebElement enteremail;
	@FindBy(xpath="//input[@id='phone']")WebElement enterphone;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")WebElement updatebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	


public void moreinfo()
{
	moreinfo.click();
}	
public void actionbutton()
{
	actionbutton.click();
}
public void address()
{
	enteraddress.clear();
	enteraddress.sendKeys("kzm,Trivandrum");
}
public void email()
{
	enteremail.clear();
	enteremail.sendKeys("amal@gmail.com");
}
public void phone()
{
	enterphone.clear();
	enterphone.sendKeys("0987654321");
}
public void update()
{
	updatebutton.click();
}
public boolean alert()
{
	return alert.isDisplayed();
}

public void isUpdateButtonDisplayed()
{
	if(updatebutton.isDisplayed())
	{
		System.out.println("update button is displayed");
	}
	else
	{
		System.out.println("update button is not displayed");
	}
}
}
