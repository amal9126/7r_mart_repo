package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='username']")WebElement usernameField;
	@FindBy(xpath="//input[@name='password']")WebElement passwordField;
	@FindBy(xpath="//button[@type='submit']")WebElement signinField;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboardField;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alert;
	
	

	public void enterTheUsername(String usernamevalue)
	{
		usernameField.sendKeys(usernamevalue);
	}
	
	public void enterThePassword(String passwordvalue)
	{
		passwordField.sendKeys(passwordvalue);
	}
	
	public void clickTheSignInButton()
	{
		signinField.click();
	}
	
	public boolean isdashboarddisplay()
	{
		return dashboardField.isDisplayed();
	}
	
	public boolean isalertdisplayed()
	{
		return alert.isDisplayed();
	}
}


