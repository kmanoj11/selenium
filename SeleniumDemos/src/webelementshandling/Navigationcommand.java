package webelementshandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommand 
{

	public static void main(String[] args) throws InterruptedException
	{
      WebDriver driver = new ChromeDriver();
      driver.navigate().to("https://www.facebook.com/login/");
      driver.get("https://mail.google.com/mail/u/0/#inbox");
      
      Thread.sleep(3000);
      
      driver.navigate().forward();
      driver.navigate().back();
	}

}
