package TESTER_KHANTUCH.first_MAVEN_PROJECT;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
public class NewTest {
	public static WebDriver driver=null;
	
  @Test
//test to see if the change will showup 
  //@Parameters({"email"})
  public void f() throws InterruptedException {
	  
	  factory_class obj=new factory_class(driver);
	  obj.enteremail("email");
	  obj.enterpassword();
	  obj.clicklogin();
	  Reporter.log("this is just a test");
	  Thread.sleep(1000);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\java_eclipse-workspace\\webdriver\\DRIVER\\chromedriver.exe");
		driver=new ChromeDriver();
		String facebook="http://www.facebook.com/";
		driver.get(facebook);
	
  }

}
