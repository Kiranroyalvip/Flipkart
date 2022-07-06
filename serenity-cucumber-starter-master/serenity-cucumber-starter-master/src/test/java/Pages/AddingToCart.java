package Pages;

import net.thucydides.core.annotations.Step;

public class AddingToCart {
	
	FlipkartDashboardPage dashboard;

	//Scenario:Product adding to cart and verify
	
	@Step 
	public void verifyDashPage()
	{   
		dashboard.waiting();
		dashboard.verifyDashPage();
	}
	
	@Step
	public void searchObject() 
	{
		dashboard.waiting();
		dashboard.SearchObject();
	}
	
	@Step
	public void clickOnSearchButton()
	{
		dashboard.clickOnSearchButton();		
	}
	
	@Step
	public void openProduct()
	{   
		dashboard.waiting();
		dashboard.openProduct();
		dashboard.waiting();
		dashboard.switchwindow();
	}
	
	@Step
	public void addToCart()
	{
		dashboard.addToCart();
		dashboard.waiting();
	}
	
	@Step
	public void verifyCart()
	{ 
		dashboard.verifyCart();
	}
}
