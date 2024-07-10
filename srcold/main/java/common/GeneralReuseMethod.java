package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	
	
	
	

}
