package starter.stepdefinitions;

import Pages.AddingToCart;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FlipkartLogin {
	
	@Steps
	HomePage home;
	
	@Steps
	AddingToCart dash;
    

	@Given("User is on login page")
	public void user_is_on_login_page() {
	   home.openApplication();
	}	   
	
	@When("User enter the Mobile Number")
	public void user_enter_the_Mobile_Number () {
		home.enterMobileNumber();
	
	}
	
	@When("User enter the Password")
	public void user_enter_the_password() {
		 home.enterPassword();
	    
    }
	
	@Then("User Should be able to login")
	public void user_should_be_able_to_login() {
		 home.clickOnLoginButton();
	}
	
	
	@Given("User is on Dash Page")
	public void User_is_on_Dash_page() {
	    dash.verifyDashPage();
	    
	}
	@When("User search a product")
	public void user_search_a_product() {
	   dash.searchObject();
	   dash.clickOnSearchButton();
	}
	@When("User open the product")
	public void user_open_the_product() {
	   dash.openProduct();
	}
	@Then("User add that product to cart")
	public void user_add_that_product_to_cart() {
	    dash.addToCart();
	}
	
	@Then("User Verify the Product")
	public void user_verify_the_product() {
	   dash.verifyCart();
	}

	
}
