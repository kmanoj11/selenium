package SeleniumwithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitDemo4
{
	@Test
	  public void funA()
	  {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		  driver.findElement(By.xpath("//td[@id='ContentHolder_lbFeatures_LBI0T1']")).click();
		  
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		  driver.findElement(By.xpath("//td[@id='//span[@id='ContentHolder_lbModels_10_D']']")).click();
		  
}
}