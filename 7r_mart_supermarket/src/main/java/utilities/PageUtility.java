package utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;



public class PageUtility {

	public void selectByVisibleText(WebElement element,String visibleText) {

		  Select select =new Select(element);

		  select.selectByVisibleText(visibleText);;

		  		 }

	public void selectByValue(WebElement element,String value) {

		  Select select =new Select(element);

		  select.selectByValue(value);;

		  		 }

	public void selectByIndex(WebElement element,int index) {

		  Select select =new Select(element);

		  select.selectByIndex(index);;

		     	 }

	public void scroll(WebDriver driver,WebElement element) {

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,300)","");

	}

	public void sendKeys(WebDriver driver,WebElement element,String stringvalue)

	{

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].value='stringvalue';",element);

	}

	public void jsclick(WebDriver driver,WebElement element)

	{

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].click();",element);

	}

	public void dragAndDrop(WebDriver driver,WebElement element1,WebElement element2)

	{

		Actions actions=new Actions(driver);

		actions.dragAndDrop(element1, element2).build().perform();

	}

	public void rightClick(WebDriver driver,WebElement element1)

	{

		Actions actions=new Actions(driver);

		actions.contextClick(element1).build().perform();

	}

	public void mouseHover(WebDriver driver,WebElement element1)

	{

		Actions actions=new Actions(driver);

		actions.moveToElement(element1).build().perform();

	}

	public void doubleClick(WebDriver driver,WebElement element1)

	{

		Actions actions=new Actions(driver);

		actions.doubleClick(element1).build().perform();

	}
	public void click(WebDriver driver,WebElement element1)

	{

		Actions actions=new Actions(driver);

		actions.click(element1).build().perform();

	}

	
}