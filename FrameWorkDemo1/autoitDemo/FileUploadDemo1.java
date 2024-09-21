package autoitDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDemo1 
{
   @Test
   public void Fileuploadtest() throws IOException
   {
	   WebDriver driver = new ChromeDriver();
	   driver.get("file:///C:/Users/k.manoj%20kumar/Downloads/FileUploadDemo1%20(1).html");
	   driver.findElement(By.xpath("//input[@id='RBG']")).click();
	   Runtime.getRuntime().exec("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\FrameWorkDemo\\Autoit");
	   System.out.println("done");
	   
   }
}
