package Testclass;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import common.BaseClass;
import common.GeneralReuseMethod;
import common.Reports;
import pages.HomePage;
import pages.SignUpPage;

public class spiceJetTest extends BaseClass {

	GeneralReuseMethod gReuseMethod =new GeneralReuseMethod(driver);
	SignUpPage signUp = new SignUpPage(driver);
HomePage homePage =new HomePage(driver);
Reports R = new Reports() ;
	@Test(priority = 1)
	public void validateSignUpPage() throws InterruptedException {

		String autualTitle=	gReuseMethod.gettitle(driver);

//		if (autualTitle.contains("SpiceJet"))
//		{
//			System.out.println("Landed on correct page");
//		}
//		else {
//			System.out.println("worng ad");
//		}
		signUp.clickSignUpButton(driver);
		
		Set<String> Child_id = driver.getWindowHandles(); 
		for (String a : Child_id) { 
			driver.switchTo().window(a);
		}
		signUp.printTitleandCurUrl(driver);
		signUp.titleClic(driver);
		signUp.enterFistAndLastName(driver);
		signUp.selectContry(driver);
		signUp.dobField(driver);
		signUp.enterMobileNo(driver);
		signUp.enterEmailId(driver);
		signUp.enterPassword(driver);
		signUp.selectCheckBox(driver);
	
		
		
}
	@Test (priority = 2)
	public void onewaytrip() throws InterruptedException {
		
	String homeurl=gReuseMethod.gettitle(driver);
	System.out.println(homeurl);
	homePage.fromform(driver);
	homePage.toForm(driver);
	homePage.onewaydepatureDate(driver);
	homePage.Onewaytrippagepassengers(driver);
	homePage.Onewaytrippagecurrency(driver);
	homePage.Onewaytrippagecurrency(driver);
		
	}
	@Test(priority = 3)
	
	public void twoWaytrip() throws InterruptedException {
		String homeurl=gReuseMethod.gettitle(driver);
		System.out.println(homeurl);
		homePage.roundtripbutton(driver);
		homePage.RoundTripPageTripFrom(driver);
		homePage.RoundTripPageTripTo(driver);
		homePage.RoundTripPageDepartureDate(driver);
		homePage.Onewaytrippagepassengers(driver);
		homePage.searchflightButton(driver);
		
	}
	
	@Test(priority = 4)
	public void loginValidation() throws InterruptedException {
		String homeurl=gReuseMethod.gettitle(driver);
		System.out.println(homeurl);
		homePage.logInClick(driver);
		homePage.emailbutton(driver);
		homePage.emailid(driver);
		homePage.password(driver);
		homePage.loginbutton(driver);
		
		
		
	}
	
	
	

}
