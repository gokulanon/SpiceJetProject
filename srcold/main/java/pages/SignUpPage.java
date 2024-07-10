package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
	
static WebDriver driver;
	
	public SignUpPage (WebDriver driver) {
		this.driver= driver;
		
	}
	
	
	String signUpButton ="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[2]";
	
	String nameTitleDropDown = "//select[@class='form-control form-select ']";
	
	String firstName ="//input[@id='first_name']";
	
	String lastName = "//input[@id='last_name']";
	
	String countryDropDown ="//select[@class='form-control form-select']";
	
	String dateField = "//img[@class='d-inline-block datepicker']";
	
	String mobileNumber = "//input[@class=' form-control']";
	
	String emailID = "//input[@id='email_id']";
	
	String passwordField = "//input[@id='new-password']";
	
	String confirmPassword = "//input[@id='c-password']";
	
	String SignUPCheckBox = "//input[@id='defaultCheck1']";
	
	
	public void clickSignUpButton(WebDriver driver) {
		
		driver.findElement(By.xpath(signUpButton)).click();
		
	}


	
	

}
