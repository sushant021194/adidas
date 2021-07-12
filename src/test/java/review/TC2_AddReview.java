package review;



import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.core.annotation.Order;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseClass;
import com.CommonFunctions;

import io.appium.java_client.android.AndroidElement;

public class TC2_AddReview extends BaseClass
{


	@Test 
	public void AddReview()
	{
		//Click on particular product image
		CommonFunctions.waitVisibility(driver, AddReviewIDs.ID_OF_PRODUCTIMAGE);
		CommonFunctions.clickById(AddReviewIDs.ID_OF_PRODUCTIMAGE);

		//Wait till product image get loaded
		CommonFunctions.waitVisibility(driver, AddReviewIDs.ID_OF_PRODUCTIMAGE);

		//Click on AddReview Button
		CommonFunctions.clickById(AddReviewIDs.ID_OF_ADDREVIEW);


		//AddReviews
		CommonFunctions.waitVisibility(driver, AddReviewIDs.ID_OF_SAVEREVIEW);

		//Enter Review Text into textbox
		CommonFunctions.enterText(AddReviewIDs.ID_OF_REVIEWDETAILS, AddReviewIDs.ReviewText);

		//Click on Rating drop down
		CommonFunctions.clickById(AddReviewIDs.ID_OF_RATINGDROPDOWN);
		
		//wait 
		CommonFunctions.waitVisibilityByXpath(driver, AddReviewIDs.XP_OF_RATING);
		
		//Select 5 Ratings
		CommonFunctions.clickByXpath(AddReviewIDs.XP_OF_RATING);

		//Click on SaveReview
		CommonFunctions.clickById(AddReviewIDs.ID_OF_SAVEREVIEW);

	}


}
