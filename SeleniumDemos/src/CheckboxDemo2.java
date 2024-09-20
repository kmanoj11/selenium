import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo2 
{

	public static void main(String[] args) 
	{
      WebDriver driver = new ChromeDriver();
      driver.get("https://faculty.washington.edu/chudler/java/boxes.html");
     WebElement checkbox= driver.findElement(By.xpath("//input[@type='checkbox'][5]"));
     WebElement checkboxforselect= driver.findElement(By.xpath("//input[@type='checkbox'][5]"));
     
      
      boolean actualcheckboxisdisplayed=checkbox.isDisplayed();
      boolean expectedcheckboxisdisplayed=true;
      if(actualcheckboxisdisplayed==checkbox.isDisplayed())
      {
    	  System.out.println("checkboxisdisplayed");
      }
      else
      {
    	  System.out.println("checkbox is not displayed");
      }
      
      
      boolean actualcheckboxisenabled=checkbox.isEnabled();
      boolean expectedcheckboxisenabled=true;
      if(actualcheckboxisenabled==checkbox.isEnabled())
      {
    	  System.out.println("checkboxisenabled");
      }
      else
      {
    	  System.out.println("checkbox is not enabled");
      }
      
      boolean actualcheckboxisselected=checkbox.isSelected();
      boolean expectedcheckboxisselected=true;
      if(actualcheckboxisselected==checkbox.isSelected())
      {
    	  System.out.println("checkboxisselected");
      }
      else
      {
    	  System.out.println("checkbox is not selected");
      }
      checkbox.click();
      boolean actualcheckboxisselectedafterclick=checkboxforselect.isSelected();
      boolean expectedcheckboxisselectedafterclick=true;
      if(actualcheckboxisselected==checkboxforselect.isSelected())
      {
    	  System.out.println("checkboxisselectedafterclick");
      }
      else
      {
    	  System.out.println("checkbox is not selectedafterclick");
      }
	}

}
