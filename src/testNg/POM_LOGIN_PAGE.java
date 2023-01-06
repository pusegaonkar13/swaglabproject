package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LOGIN_PAGE
{
	//1. Web driver declared
	WebDriver driver;
	private Actions act;
	
//2. find WebElements
// do not use find element- user name
//WebElement user name =  driver.findelement(By.xpath("ABC"));
	
// use annotation -->  @ --> @FindBy --> its like method only
	
	@FindBy(xpath="//input[@id='user-name']")
	WebElement username;
	public void username()			// non static method 	
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	public void password()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(xpath="//input[@id='login-button']")
	WebElement loginbtn;
	public void clcikloginbutton()
	{
		act.click(loginbtn).perform();
	}
	
//4. Constructor Declare

public void LoginPOMClass (WebDriver driver )
{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	act = new Actions(driver); 
}


}
