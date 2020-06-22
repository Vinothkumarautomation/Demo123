package demopack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsDemo_Keyboard {
  @Test
  public void Search() throws InterruptedException {
	  WebDriver driver;
	  driver = DriverUtility.getDriver("chrome");
	  driver.get("https://www.google.co.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  WebElement El1 =driver.findElement(By.name("q"));
	  Actions obj = new Actions(driver);
	  obj.keyDown(El1, Keys.ALT).sendKeys("acceNTure").keyUp(Keys.ALT).build().perform();
	  Thread.sleep(2000);
	  obj.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
	  
//	  driver.manage().n
  }
}
