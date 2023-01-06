package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Logout_Functionality extends Test_Base_Class
{
	@Test
	public void VerifyLogOutFunctionality()
	{
		POM_HOME_PAGE hp = new POM_HOME_PAGE(driver);
		hp.clicksettingbtn();
		System.out.println("Clicked on setting button");
		hp.clicklogoutbtn();
		System.out.println("Clicked on logout button");
		
		System.out.println("Went on Login Page");
		
	// apply validation
		System.out.println("Apply the validation");
		
		String giventitle ="Swag labs";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, giventitle);
		
		
		
	}
	

}
