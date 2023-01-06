package testNg;

import java.time.Duration;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Test_Base_Class
{
WebDriver driver;
	
	@BeforeMethod
	public void setup1()
	{
		System.out.println("verify Login Functionality test case");
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Public\\Eclipse\\Driver\\Crome Driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		
		
		System.out.println("Browser is opned");
		driver.manage().window().maximize();
		System.out.println("Browser maximized");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("url opened");
		
	}
	
	
	// login and ID AND password activity
	public void setup2()
	{
		POM_LOGIN_PAGE lp = new POM_LOGIN_PAGE();
		
		lp.username();
		System.out.println("User name entered");
		
		lp.password();
		System.out.println("Passwored Entered");
		
		lp.clcikloginbutton();
		System.out.println("Clicked on login Button");
		
		// --- Home page--- //
		System.out.println("Went on home page");
		
	}
	
	@AfterMethod
	//close browser
	public void tearDown()
	{
		driver.quit();
		System.out.println("browser is closed");
		System.out.println("End of Program");
		
	}

}
