package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNewsPage {
	public WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(xpath="//a[contains(@href,
	// 'uniqassosiates.com/admin/list-news')]")WebElement moreInfoManageNewsPage;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement createnew;
	@FindBy(xpath = "//textarea[@id='news']")
	WebElement text;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	@FindBy(xpath = "//a[contains(@href, '/admin/news/delete') and contains(@class, 'btn-danger')]")
	WebElement deletebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement deletealert;

	/*
	 * public void moreInfoManageNewsPage() { moreInfoManageNewsPage.click(); }
	 */

	public ManageNewsPage createnew() {
		createnew.click();
		return this;
	}

	public ManageNewsPage text(String entertext) {
		text.sendKeys(entertext);
		return this;
	}

	public ManageNewsPage save() {
		WaitUtility waitutility = new WaitUtility();
		waitutility.waitForElementToBeClickable(driver, savebutton);
		savebutton.click();
		return this;
	}

	public boolean isAlertsDisplayMethod() {
		return alert.isDisplayed();
	}

	public ManageNewsPage isSaveButtonDispalyed() {
		if (savebutton.isDisplayed()) {
			System.out.println("save button is displayed");
		} else {
			System.out.println("save button is not displayed");
		}
		return this;
	}

	public ManageNewsPage deleteNews() {
		deletebutton.click();
		driver.switchTo().alert().accept();
		return this;
	}

	public boolean deletealert() {
		return deletealert.isDisplayed();
	}
	public boolean isSaveButtonDisplayedAlert() {
		return savebutton.isDisplayed();
	}
}