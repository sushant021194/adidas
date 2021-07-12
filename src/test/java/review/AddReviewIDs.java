package review;

public class AddReviewIDs 
{

	//Variables
	public static final String PRODUCT= "product";
	public static final String PRICE= "59.0 $";
	public static final int RATING=5;
	public static final String ReviewText="Test add Review ";


	//Locators
	public static final String ID_OF_PRODUCTIMAGE= "com.example.challenge:id/productImage";
	public static final String ID_OF_PRODUCTNAME= "com.example.challenge:id/productName";
	public static final String ID_OF_PRODUCTPRICE= "com.example.challenge:id/productPrice";
	public static final String ID_OF_ADDREVIEW= "com.example.challenge:id/addReview";
	public static final String ID_OF_REVIEWDETAILS= "com.example.challenge:id/reviewDetails";
	public static final String ID_OF_SAVEREVIEW="com.example.challenge:id/saveReview";
	public static final String XP_OF_RATING="//*[@resource-id='android:id/text1' and @index='"+RATING+"']";
	public static final String ID_OF_RATINGDROPDOWN="com.example.challenge:id/reviewNumber";
	public static final String XP_OF_REVIEWLIST="//*[@resource-id='com.example.challenge:id/reviewsRecycler']//android.widget.TextView";
	
	//public static final String XP_OF_= "com.example.challenge:id/productImage";




}
