import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxdemo1 
{

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
      WebDriver driver = new ChromeDriver();
      driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
      WebElement checkbox =driver.findElement(By.xpath("//span[@id ='ContentHolder_lbFeatures_TG_D']"));
      WebElement checkboxforselect =driver.findElement(By.xpath("//span[@id ='ContentHolder_lbFeatures_TG_D']"));

      
      boolean actualcheckboxisdiplayed=checkbox.isDisplayed();
      boolean expectedcheckboxisdisplayed=true;
      
      if(actualcheckboxisdiplayed==expectedcheckboxisdisplayed)
      {
    	  System.out.println("checkbox is displayed");
      }
      else
      {
    	  System.out.println("checkbox is not displayed");
      }
      
      boolean actualcheckboxisenabled=checkbox.isEnabled();
      boolean expectedcheckboxisenabled=true;
      
      if(actualcheckboxisenabled==expectedcheckboxisenabled)
      {
    	  System.out.println("checkbox is enabled");
      }
      else
      {
    	  System.out.println("checkbox is not enabled");
      }
      
      boolean actualcheckboxisselected=checkboxforselect.isSelected();
      boolean expectedcheckboxisselected=true;
      
      if(actualcheckboxisselected==expectedcheckboxisselected)
      {
    	  System.out.println("checkbox is selected");
      }
      else
      {
    	  System.out.println("checkbox is not selected");
      }
      checkbox.click(); 
      boolean actualcheckboxisselectedafterclick=checkboxforselect.isSelected();
      boolean expectedcheckboxisselectedafterclick=false;
      
      if(actualcheckboxisselectedafterclick==expectedcheckboxisselectedafterclick)
      {
    	  System.out.println("checkbox is selected after click");
      }
      else
      {
    	  System.out.println("checkbox is not selected after click");
      } 
	}
	
	
	

}
