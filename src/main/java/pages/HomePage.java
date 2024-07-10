package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	static WebDriver driver;

	public HomePage (WebDriver driver) {
		this.driver= driver;
	}

	String oneWayTripCheckBox ="(//div[@class='css-1dbjc4n r-zso239'])[1]";
	String roundTripCheckBox ="(//div[@class='css-1dbjc4n r-zso239'])[2]";
	String fromTextBox ="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input)[1]";
	String toTextBox = "(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']/input)[2]";
	String SelectfromDatePicker ="//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']//div[contains(text(), '2024')]";
	String selectFromDate ="(//div[@class='css-1dbjc4n r-1awozwy r-1pi2tsx r-1777fci r-13qz1uu']//div[text()='5'])(1)";
	String selectPassDropDown ="//div[@class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']//div[contains(text(), 'Passengers')]";
	String selectadult ="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]";

	
	public void roundtripbutton(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")));
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fromform(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement fromElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='From']")));
            fromElement.click();

            WebElement kolkataElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Kolkata']")));
            kolkataElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void toForm(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement toElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Delhi']")));
            toElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onewaydepatureDate(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement dateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='20'])[1]")));
            dateElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Onewaytrippagepassengers(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement passengerElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='1 Adult']")));
            passengerElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Onewaytrippagecurrency(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement currencyElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='INR']")));
            currencyElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchflightButton(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement searchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='home-page-flight-cta']")));
            searchButton.click();
            wait.until(ExpectedConditions.elementToBeClickable(searchButton));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RoundTripPageTripFrom(WebDriver driver) {
        try {
            fromform(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RoundTripPageTripTo(WebDriver driver) {
        try {
            toForm(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RoundTripPageDepartureDate(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement startDateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='8'])[2]")));
            startDateElement.click();

            WebElement endDateElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='10'])[2]")));
            endDateElement.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logInClick(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[text()='Login'])")));
            loginButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void emailbutton(WebDriver driver) {
        try {
            
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement emailButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[4]")));
            emailButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void emailid(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='email']")));
            emailField.sendKeys("Gokul@gmai.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void password(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
            passwordField.sendKeys("Password@1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loginbutton(WebDriver driver) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid='login-cta']")));
            loginButton.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
