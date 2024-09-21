package ExtentReportDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SeleniumWithExtentReports
{
	@Test
	public void ScreenshotDemo() throws IOException, InterruptedException
	{
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	TakesScreenshot screenshot = (TakesScreenshot) driver;
	File source =  screenshot.getScreenshotAs(OutputType.FILE);
	File target = new File("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemo\\screenshots\\text5.png");
	FileUtils.copyFile(source, target);
	System.out.println("done");
	}
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest parentExtentLogger;
	public static ExtentTest childExtentLogger;

	
	{
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemo\\ExtentReportDemo1\\test5.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		parentExtentLogger = extent.createTest("Test1");
		childExtentLogger=parentExtentLogger.createNode("senario_1");
		childExtentLogger.log(Status.PASS,MarkupHelper.createLabel(" - Test Case passed", ExtentColor.GREEN));
		childExtentLogger.pass("",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemo\\screenshots\\text5.png").build());		
		extent.flush();
		System.out.println("Done");

	}

}
