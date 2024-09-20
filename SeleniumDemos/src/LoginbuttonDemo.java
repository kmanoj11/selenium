import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginbuttonDemo
{

	public static void main(String[] args)
	{
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.facebook.com/login/");
       driver.findElement(By.xpath("//button[@id='loginbutton']"));
        WebElement loginbutton  = driver.findElement(By.xpath("//button[@id='loginbutton']"));
        
        boolean actualloginbuttonisdiplayed=loginbutton.isDisplayed();
        boolean expectedloginbuttonisdisplayed=true;
        
        if(actualloginbuttonisdiplayed==expectedloginbuttonisdisplayed)
        {
        	System.out.println("loginbutton is displayed");
        
        }
        else
        {
        	System.out.println("loginbutton is not displayed");
        }
        
        boolean actualloginbuttonisenabled=loginbutton.isEnabled();
        boolean expectedloginbuttonisenabled=true;
        
        if(actualloginbuttonisenabled==expectedloginbuttonisenabled)
        {
        	System.out.println("loginbutton is enabled");
        
        }
        else
        {
        	System.out.println("loginbutton is not enabled");
        }
        
        boolean actualloginbuttonisselected=loginbutton.isEnabled();
        boolean expectedloginbuttonisselected=true;
        
        if(actualloginbuttonisselected==expectedloginbuttonisselected)
        {
        	System.out.println("loginbutton is selected");
        
        }
        else
        {
        	System.out.println("loginbutton is not selected");
        }
        String actual=loginbutton.getAttribute("name");
        String expected="loginbutton";
        
        if(actual.equals(expected))
        {
       	 System.out.println("button is matched");
        }
        else 
        {
       	 System.out.println("button is not matched");
        }
     loginbutton.click();
        
	}
}
