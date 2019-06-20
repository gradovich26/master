package TESTER_KHANTUCH.first_MAVEN_PROJECT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class factory_class {
	public static WebDriver driver =null;
	
	@FindBy (id="email") private WebElement emailid;
	@FindBy (id="pass") private WebElement password;
	@FindBy(xpath="//*[@data-testid='royal_login_button']") private WebElement loginbutton;

	public factory_class(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enteremail(String email) {
		emailid.sendKeys(email);
		
	}
	
	public void enterpassword() {
		password.sendKeys("holala");
	}
	
	public void clicklogin() {
		loginbutton.click();
	}
	
	public void openthebrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\java_eclipse-workspace\\webdriver\\DRIVER\\chromedriver.exe");
		driver=new ChromeDriver();
		String facebook="http://www.facebook.com/";
		driver.get(facebook);
	
	}
	
	
	
	
	
	
	
	

}
