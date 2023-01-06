package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_AllProduct_addToCart_Functionality extends Test_Base_Class
{
	@Test
	public void addtocartallproductfunctionality() throws InterruptedException
	{
		POM_HOME_PAGE hp = new POM_HOME_PAGE(driver);
		hp.clickallproduct();
		System.out.println("All Product Selected");
		Thread.sleep(3000);	
		
		System.out.println("Apply The Validation");
		
		String expectedselectedproduct="6";
		String actualproductselected =hp.clickallproduct();
		
		Assert.assertEquals(actualproductselected, expectedselectedproduct);
		
		
		
		
		
	}
	

}
