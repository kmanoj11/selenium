import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 
{

	public static void main(String[] args)
	{
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
     WebElement loginbutton = driver.findElement(By.xpath("//button[@id='loginbutton']"));
    
     WebElement loginbuttonforclick = driver.findElement(By.xpath("//button[@id='loginbutton']"));

     boolean actualloginbuttonisdisplayed = loginbutton.isDisplayed();
     boolean expectedloginbuttonisdisplayed = true;
     
     if(actualloginbuttonisdisplayed ==expectedloginbuttonisdisplayed)
     {
    	 System.out.println("data is matching");
     }
     else
     {
    	 System.out.println("data is not matching");
     }
     
     boolean actualloginbuttonisdisenabled = loginbutton.isEnabled();
     boolean expectedloginbuttonisenabled= true;
     
     if(actualloginbuttonisdisenabled ==expectedloginbuttonisenabled)
     {
    	 System.out.println("data is matching");
     }
     else
     {
    	 System.out.println("data is not matching");
     }

     loginbutton.click();
     boolean actualloginbuttonisselectedforclick = loginbuttonforclick.isSelected();
     boolean expectedloginbuttonisselectedforclick= true;
     
     if(actualloginbuttonisselectedforclick ==expectedloginbuttonisselectedforclick)
     {
    	 System.out.println("login button for click");
     }
     else
     {
    	 System.out.println("data is not matching");
     }
     
     
     
     
     
     
     
	}		

}
