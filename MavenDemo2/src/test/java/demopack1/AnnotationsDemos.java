package demopack1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemos {
  @BeforeMethod
  public void Login() {
	  System.out.println("code for Login");
  }
  
  @AfterMethod
  public void Logout() {
	  System.out.println("code for Logout");
  }
  
  @Test
  public void IMPS() {
	  System.out.println("code for IMPS");
  }
  @Test
  public void RTGS() {
	  System.out.println("code for RTGS");
  }
  @Test
  public void NEFT() {
	  System.out.println("code for NEFT");
  }
  @BeforeClass
  public void Launch() {
	  System.out.println("code for Launch");
  }
  @AfterClass
  public void Close() {
	  System.out.println("code for Close");
  }
  
  @AfterTest
  public void DisconnectDB() {
	  System.out.println("code for DisconnectDB");
  }
  @BeforeTest
  public void ConnectDB() {
	  System.out.println("code for ConnectDB");
  }
  @AfterSuite
  public void DeleteCookies() {
	  System.out.println("code for DeleteCookies");
  }
  @BeforeSuite
  public void DeleteBrowserCache() {
	  System.out.println("code for DeleteBrowserCache");
  }
}
