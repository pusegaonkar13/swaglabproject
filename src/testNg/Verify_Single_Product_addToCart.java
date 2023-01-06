package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_Single_Product_addToCart extends Test_Base_Class

{
	@Test
	
	public void singleprocutaddtocart() throws InterruptedException
	{
		POM_HOME_PAGE hp = new POM_HOME_PAGE(driver);
		hp.ClickedonSingleProduct();
		System.out.println("Single bag product selected");
		Thread.sleep(3000);
		
	// Apply Validation
		System.out.println("Apply The validation");
		
		String expectedselectedproduct="1";
		String actualproductselected =hp.ClickedonSingleProduct();
		
		Assert.assertEquals(actualproductselected, expectedselectedproduct);
		
		
		
	}
	

}
