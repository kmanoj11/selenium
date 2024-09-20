import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo2A
{

	public static void main(String[] args) 
	{
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://www.calculator.net/mortgage-calculator.html");
	     WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox'][5]"));
	     
	      
	      
	}

}
