import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementAndFindElementsDemo1 
{

	public static void main(String[] args)
	{
      WebDriver driver =  new ChromeDriver();
      driver.findElement(By.xpath("//input[@id='RBG']"));
      System.out.println("done");
	}

}
