package Pages;

import net.thucydides.core.annotations.Step;

public class HomePage {
    
	FlipkartHomePage homePage;
	
	//Scenario:Login with valid credentials
	
	@Step
	public void openApplication()
	{
		homePage.open();
	}
	
	@Step
    public void enterMobileNumber()
	{
	 	homePage.enterMobileNumber();
	}
	
	@Step
	public void enterPassword()
	{
		homePage.enterPassword();
	}
	
	@Step
	public void clickOnLoginButton()
	{
		homePage.clickOnLoginButton();
	}
	
	
	

	

}
