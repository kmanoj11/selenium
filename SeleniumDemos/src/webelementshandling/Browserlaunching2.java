package webelementshandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserlaunching2
{

	public static void main(String[] args) 
	{
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com/login/");
      
      
      WebDriver driver1 = new FirefoxDriver();
      driver1.get("https://www.facebook.com/login/");
      
      
      WebDriver driver3 = new EdgeDriver();
      driver3.get("https://www.facebook.com/login/");
	}

}
