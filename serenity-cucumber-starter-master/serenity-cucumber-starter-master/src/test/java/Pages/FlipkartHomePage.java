package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FlipkartHomePage extends PageObject {
	
	public void enterMobileNumber()
	{
		WebElementFacade MobileNumber = $(By.cssSelector("input[class='_2IX_2- VJZDxU']"));
		MobileNumber.type("7842782040");
	}
	public void enterPassword() 
	{
		WebElementFacade Password = $(By.cssSelector("input[type='password']"));
		Password.type("Kiran143@");
	}
	public void clickOnLoginButton()
	{
		WebElementFacade LoginButton = $(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']"));
		LoginButton.click();
	}

	public void waiting()
	{
		waitABit(2000);
	}
}


//driver.findElement(By.xpath("//label[@class='_1fqY3P']//span[contains(text(),'Enter Email/Mobile number')]"));
//driver.findElement(By.xpath("//label[@class='_1fqY3P']//span[contains(text(),'Enter Password')]"));
//driver.findElement(By.xpath("//div[@class='_1D1L_j']")).click();
////*[@id="container"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]