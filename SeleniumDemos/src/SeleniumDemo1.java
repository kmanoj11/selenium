import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 
{

	public static void main(String[] args) 
	{
     WebDriver driver = new ChromeDriver();
     driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-618378881%3A1723117382686479&ddm=0");
    WebElement text= driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
    String actualtext=text.getText();
    String expecteddata="to continue to Gmail";
    
    if(actualtext==expecteddata)
    {
    	System.out.println("data is matching");
    }
    else 
    {
    	System.out.println("data is not matching");
    }
     

   
	}

}	

