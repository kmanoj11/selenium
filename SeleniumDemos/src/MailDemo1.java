import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailDemo1
{

	public static void main(String[] args)
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		WebElement button = driver.findElement(By.xpath("//span[text()='Next']"));
		
		WebElement buttonforclick = driver.findElement(By.xpath("//span[text()='Next']"));

		
		boolean actualbuttonisdisplayed = button.isDisplayed();
		boolean expectedexpectedisdidplayed = true;
		
		
		if(actualbuttonisdisplayed ==expectedexpectedisdidplayed)
		{
			System.out.println("button is displayed"); 
		}
		else
		{
			System.out.println("button is not displayed");
		}
		
		boolean actualbuttonisenabled = button.isEnabled();
		boolean expectedexpectedisenabled = true;
		
		
		if(actualbuttonisenabled ==expectedexpectedisenabled)
		{
			System.out.println("button is enabled"); 
		}
		else
		{
			System.out.println("button is not enabled");
		}

		boolean actualbuttonisselected = button.isSelected();
		boolean expectedexpectedisselected= true;
		
		
		if(actualbuttonisselected ==expectedexpectedisselected)
		{
			System.out.println("button is selected"); 
		}
		else
		{
			System.out.println("button is not selected");
		}	
		
		button.click();
		boolean actualbuttonisselectedforclick = button.isSelected();
		boolean expectedexpectedisselectedforclick = true;
		
		
		if(actualbuttonisselectedforclick  ==expectedexpectedisselectedforclick )
		{
			System.out.println("button is selectedforclick "); 
		}
		else
		{
			System.out.println("button is not selectedforclick ");
		}	
		
	}

}
