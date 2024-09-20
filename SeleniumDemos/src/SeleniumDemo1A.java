import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1A 
{

	public static void main(String[] args) 
	{
     WebDriver driver = new ChromeDriver();
     driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-1725676366%3A1722858201207236&ddm=0");
     WebElement label = driver.findElement(By.xpath("// span[text()= 'to continue to Gmail']"));
     driver.findElement(By.xpath("// span [text()= 'to continue to Gmail']"));
     String actualText = label.getText();
     String expectedText = "to continue to Gmail";
     if(actualText==expectedText)
     {
    	 System.out.println("text is matching");
     }
     else
     {
    	 System.out.println("text is not matching");
     }
	}

}
