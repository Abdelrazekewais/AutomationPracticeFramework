package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportManager implements ITestListener {
    public ExtentSparkReporter sparkReporter;
    public ExtentReports extent;
    public ExtentTest test;

    public void onStart(ITestContext context) {

        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html"); // specify location

        sparkReporter.config().setDocumentTitle("Task for automation practice framework"); // Title of report
        sparkReporter.config().setReportName("Automation Task for QPros"); // name of the report
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);

        extent.setSystemInfo("Computer Name", "Local Laptop");
        extent.setSystemInfo("Environment", "Test");
        extent.setSystemInfo("Tester Name", "Abdelrazek");
        extent.setSystemInfo("os", "Windows11");
        extent.setSystemInfo("Browser name", "Chrome");
    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
        test.log(Status.PASS, "Test passed successfully: " + result.getName());
       // test.pass("Test passed");
    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
        test.log(Status.FAIL, "Test Failed: " + result.getName());
        test.log(Status.FAIL, "Test Failure reason: " + result.getThrowable());
        // test.pass("Test passed");
    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
        test.log(Status.SKIP, "Test Failed: " + result.getName());
        // test.pass("Test passed");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }


}
