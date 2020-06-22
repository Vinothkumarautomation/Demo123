package demopack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AlertsDemo {
  @Test
  public void f() {
	  
	  WebDriver driver;
	  driver = DriverUtility.getDriver("chrome");
	  driver.get("https://www.tsrtconline.in/oprs-web/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@name='searchBtn']")).click();
	  if(ExpectedConditions.alertIsPresent()!=null)
	  {
	  Alert obj =driver.switchTo().alert();
	  String Alrt_msg = obj.getText();
	  System.out.println(Alrt_msg); 
	  obj.accept();
	  }
	  else
	  {
		  System.out.println("No alerts in the page");
	  }
  }
}
