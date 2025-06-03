package test_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{
	@Test(groups= {"regression"})
	public void loginTest()
	{
		String name="admin";
		String password="admin";
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(name);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
		
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		
		WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean ishomepageavailable=dashboard.isDisplayed();
		Assert.assertTrue(ishomepageavailable);
		
	}
}
