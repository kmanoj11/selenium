package autoitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDemo2 
{
   @Test
   public void Fileuploadtest()
   {
	   WebDriver driver = new ChromeDriver();
	   driver.get("file:///C:/Users/k.manoj%20kumar/Downloads/FileUploadDemo1%20(1).html");
	   driver.findElement(By.xpath("//input[@id='RBG']")).sendKeys("C:\\Users\\k.manoj kumar\\OneDrive\\Desktop\\manojgit");
	   System.out.println("done");
	   
   }
}
