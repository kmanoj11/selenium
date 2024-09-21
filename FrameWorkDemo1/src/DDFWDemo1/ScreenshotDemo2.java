package DDFWDemo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotDemo2 
{
	@Test
	public void ScreenshotDemo() throws IOException, InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		File source =  driver.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemo\\screenshots\\text2.png");
		FileUtils.copyFile(source, target);
		System.out.println("done");

	}


}
