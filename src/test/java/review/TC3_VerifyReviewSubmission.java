package review;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.springframework.core.annotation.Order;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.BaseClass;
import com.CommonFunctions;

import io.appium.java_client.android.AndroidElement;

public class TC3_VerifyReviewSubmission extends BaseClass{
	@Test 
	public void VerifyReviewSubmission() 
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
		CommonFunctions.scrollToElement(driver, AddReviewIDs.ReviewText);
		
		//Verify Review is Listed in the ReviewList
		List<AndroidElement> Reviews=driver.findElements(By.xpath(AddReviewIDs.XP_OF_REVIEWLIST));

		for (AndroidElement androidElement : Reviews) 
		{

			if(androidElement.getText().toString().equalsIgnoreCase(AddReviewIDs.ReviewText+AddReviewIDs.RATING))

			{
				AssertJUnit.assertEquals(androidElement.getText().toString(),AddReviewIDs.ReviewText+AddReviewIDs.RATING);
				break;
			}

		}



	}
}
