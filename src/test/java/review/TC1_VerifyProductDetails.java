package review;

import org.springframework.core.annotation.Order;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.BaseClass;
import com.CommonFunctions;

public class TC1_VerifyProductDetails extends BaseClass {
	@Test
	public void VerifyProductDetails()
	{
		//Click on particular product image
		CommonFunctions.waitVisibility(driver, AddReviewIDs.ID_OF_PRODUCTIMAGE);
		CommonFunctions.clickById(AddReviewIDs.ID_OF_PRODUCTIMAGE);

		//Wait till product image get loaded
		CommonFunctions.waitVisibility(driver, AddReviewIDs.ID_OF_PRODUCTIMAGE);


		//Verify the Name displayed is correct
		CommonFunctions.waitVisibility(driver, AddReviewIDs.ID_OF_PRODUCTNAME);
		AssertJUnit.assertEquals(AddReviewIDs.PRODUCT, CommonFunctions.getText(AddReviewIDs.ID_OF_PRODUCTNAME));


		//Verify the Price displayed is correct
		CommonFunctions.waitVisibility(driver, AddReviewIDs.ID_OF_PRODUCTPRICE);
		AssertJUnit.assertEquals(AddReviewIDs.PRICE, CommonFunctions.getText(AddReviewIDs.ID_OF_PRODUCTPRICE));


	}
}
