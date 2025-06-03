package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage
{
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(xpath="//a[contains(@href, 'uniqassosiates.com/admin/list-news')]")WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement createnew;
	@FindBy(xpath="//textarea[@id='news']")WebElement text;
	@FindBy(xpath="//button[@class='btn btn-danger']")WebElement savebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	@FindBy(xpath="//a[contains(@href, '/admin/news/delete') and contains(@class, 'btn-danger')]")WebElement deletebutton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement deletealert;

public void moreInfo()
{
	moreinfo.click();
}

public void createnew()
{
	createnew.click();
}
public void text(String entertext)
{
	text.sendKeys(entertext);
}
public void save()
{
	savebutton.click();	
}
public boolean alert()
{
	return alert.isDisplayed();
}

public void isSaveButtonDispalyed()
{
	if(savebutton.isDisplayed())
	{
		System.out.println("save button is displayed");
	}
	else
	{
		System.out.println("save button is not displayed");
	}
}

public void deleteNews()
{
	deletebutton.click();
	driver.switchTo().alert().accept();
}
public boolean deletealert()
{
	return deletealert.isDisplayed();
}
}