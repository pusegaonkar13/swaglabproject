package testNg;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Login_Page_Functionality extends Test_Base_Class
{
	WebDriver driver;
	@Test
	public void VerifyLoginFunctionality()
	{
	
		//---- Validation--//
		System.out.println("Apply the validation");
		
		String givenTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, givenTitle, actualTitle);
		
		if(actualTitle.equalsIgnoreCase(givenTitle))
		{
			System.out.println("Login Test Case Is Passed");
		}
		else
		{
			System.out.println("Login Test Case Is Failed");
		}
		
	}
	

}
