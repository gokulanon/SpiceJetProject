package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.GeneralReuseMethod;

public class SignUpPage {
	
static WebDriver driver;
	
	public SignUpPage (WebDriver driver) {
		this.driver= driver;
		
	}
	
	
	
	
	String signUpButton ="//div[text()='Signup']";
	
	String nameTitleDropDown = "//select[@class='form-control form-select ']";
	//String nameTitleDropDown = "//*[@id=\"react-root\"]/div/div/div[2]/div[2]/div/div[1]/div[1]/div[2]/select]";
	String firstName ="//input[@id='first_name']";
	
	String lastName = "//input[@id='last_name']";
	
	String countryDropDown ="//select[@class='form-control form-select']";
	String countryCode = "//select[@class='form-control form-select']/option[@value='IN']";
	
	String dateField = "//img[@class='d-inline-block datepicker']";
	String monthSelect ="//select[@class='react-datepicker__month-select']";
	String yearSelect = "//select[@class='react-datepicker__year-select']";
	String monthTable = "//div[@class='react-datepicker__day react-datepicker__day--027']";
	
	String mobileNumber = "//input[@class=' form-control']";
	
	String emailID = "//input[@class='form-control ']";
	
	String passwordField = "//input[@class='form-control ']";
	
	String confirmPassword = "//input[@id='c-password']";
	
	String checkBox ="//input[@class='form-check-input mt-02']";
	
	String SignUPCheckBox = "//input[@id='defaultCheck1']";
	String submitButton = "//button[@class='btn btn-red']";
	
	GeneralReuseMethod Gr = new GeneralReuseMethod(driver);
	
	public void visibilityOfElement(WebDriver driver, WebElement element, int timeout) {
        new WebDriverWait(driver, Duration.ofSeconds(timeout))
            .until(ExpectedConditions.visibilityOf(element));
    }

    public void clickSignUpButton(WebDriver driver) {
        try {
            WebElement ele = driver.findElement(By.xpath(signUpButton));
            ele.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void titleClic(WebDriver driver) {
        try {
            WebElement ele = driver.findElement(By.xpath(nameTitleDropDown));
            visibilityOfElement(driver, ele, 10);
            Select titleDropDown = new Select(ele);
            titleDropDown.selectByVisibleText("Mr");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterFistAndLastName(WebDriver driver) {
        try {
            WebElement ele = driver.findElement(By.xpath(firstName));
            visibilityOfElement(driver, ele, 5);
            ele.sendKeys("gokul");

            WebElement ele2 = driver.findElement(By.xpath(lastName));
            visibilityOfElement(driver, ele2, 5);
            ele2.sendKeys("SR");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectContry(WebDriver driver) {
        try {
            WebElement ele = driver.findElement(By.xpath(countryDropDown));
            visibilityOfElement(driver, ele, 5);
            ele.click();
            WebElement country = driver.findElement(By.xpath(countryCode));
            visibilityOfElement(driver, country, 5);
            country.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dobField(WebDriver driver) {
        try {
            driver.findElement(By.xpath(dateField)).click();

            Select dropdownmonth = new Select(driver.findElement(By.xpath(monthSelect)));
            dropdownmonth.selectByVisibleText("August");

            Select dropdownYear = new Select(driver.findElement(By.xpath(yearSelect)));
            dropdownYear.selectByValue("1999");

            driver.findElement(By.xpath(monthTable)).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMobileNo(WebDriver driver) {
        try {
            WebElement ele = driver.findElement(By.xpath(mobileNumber));
            visibilityOfElement(driver, ele, 5);
            ele.sendKeys("9988700000");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterEmailId(WebDriver driver) {
        try {
            WebElement ele = driver.findElement(By.id("email_id"));
            ele.click();
            Thread.sleep(4000);
            visibilityOfElement(driver, ele, 5);
            ele.sendKeys("Gokul@gmail.com");
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(WebDriver driver) {
        try {
            
            WebElement newPasswordField = driver.findElement(By.id("new-password"));
            visibilityOfElement(driver, newPasswordField, 5);
            newPasswordField.click();
            newPasswordField.sendKeys("GUVIjava@1SG");

            WebElement confirmPasswordField = driver.findElement(By.id("c-password"));
            visibilityOfElement(driver, confirmPasswordField, 5);
            confirmPasswordField.sendKeys("GUVIjava@1SG");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectCheckBox(WebDriver driver) {
        try {
            WebElement checkbox = driver.findElement(By.xpath(checkBox));
            visibilityOfElement(driver, checkbox, 5);
            checkbox.click();
            if (checkbox.isSelected()) {
                System.out.println("The Tick Box is Selected");
            } else {
                System.out.println("The Tick Box is not selected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSubmit(WebDriver driver) {
        try {
            WebElement ele = driver.findElement(By.xpath(submitButton));
            visibilityOfElement(driver, ele, 5);
            ele.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printTitleandCurUrl(WebDriver driver) {
        try {
            String title = driver.getTitle();
            System.out.println(title);
            String curUrl = driver.getCurrentUrl();
            System.out.println(curUrl);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	
	

}
