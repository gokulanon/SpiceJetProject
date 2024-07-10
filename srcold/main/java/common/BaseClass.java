package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseClass {
	protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest test;;
	
@BeforeMethod
	public void Launch() {
	 //extent = ExtentManager.getInstance();
	WebDriverManager.chromedriver().setup();
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--remote-allow-origins=*");
	  System.setProperty("webdriver.chrome.silentOutput", "true");
	   driver = new ChromeDriver(options);
	   driver.manage().window().maximize();
	   driver.get("https://www.spicejet.com/");

	}

//@AfterClass
		public void close() {
			driver.quit();
		}

protected void createTest(String testName) {
    test = extent.createTest(testName);
}
}
