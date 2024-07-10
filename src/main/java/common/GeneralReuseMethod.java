package common;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GeneralReuseMethod {
	
	static WebDriver driver;
	
	public GeneralReuseMethod (WebDriver driver) {
		this.driver= driver;
		
	}
	
	public static void sendKeys(WebDriver driver, By locator, String keysToSend) {
        driver.findElement(locator).sendKeys(keysToSend);
    }
	
	public static void clickElement(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }
	
	public String gettitle(WebDriver driver) {
		return driver.getTitle();
		
	}
	public void visibiltiyofElement(WebElement ele, int timeout,WebDriver driver)

		{
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.visibilityOf(ele));
		}
	
	
	
	
	
	

}
