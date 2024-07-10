package common;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports {
    private ExtentReports extentReports;
    private ExtentSparkReporter extentSparkReporter;
    private ExtentTest extentTest;

    @BeforeTest
    public void startReporter() {
        extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/extentReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        // Configuration items to change the look and feel
        // Add content, manage tests etc
        extentSparkReporter.config().setDocumentTitle("Simple Automation Report");
        extentSparkReporter.config().setReportName("Test Report");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
    }

    @AfterMethod
    public void getResult(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            extentTest = extentReports.createTest(result.getName());
            extentTest.log(Status.FAIL, result.getThrowable());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            extentTest = extentReports.createTest(result.getName());
            extentTest.log(Status.PASS, result.getName() + " passed");
        } else {
            extentTest = extentReports.createTest(result.getName());
            extentTest.log(Status.SKIP, result.getName() + " skipped");
        }
    }

    @AfterTest
    public void tearDown() {
        // Write or update test information to the reporter
        extentReports.flush();
    }
}