package Testclass;

import java.util.Set;

import org.testng.annotations.Test;

import common.BaseClass;
import common.GeneralReuseMethod;
import pages.SignUpPage;

public class spiceJetTest extends BaseClass {
	
	GeneralReuseMethod gReuseMethod =new GeneralReuseMethod(driver);
	SignUpPage signUp = new SignUpPage(driver);
	
	
	@Test
    public void validateHomePage() throws InterruptedException {
		
	String autualTitle=	gReuseMethod.gettitle(driver);
		
		if (autualTitle.contains("SpiceJet"))
		{
			System.out.println("Landed on correct page");
		
		}
		else {
			System.out.println("worng ad");
		}
		signUp.clickSignUpButton(driver);
		Thread.sleep(4000);
		
	
		 Set<String> Child_id = driver.getWindowHandles(); 
	        for (String a : Child_id) { 
	driver.switchTo().window(a);
	String SignUpTitle = 	gReuseMethod.gettitle(driver);
	String SignUpPageurl =driver.getCurrentUrl();
	
	System.out.println(SignUpTitle);
	System.out.println(SignUpPageurl);

	        }
		
		
			
    }

}
