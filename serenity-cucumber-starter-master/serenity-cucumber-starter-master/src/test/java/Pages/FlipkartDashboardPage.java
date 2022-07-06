package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.core.options.Constants;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.SwitchToNewWindow;

public class FlipkartDashboardPage extends PageObject{
	
	WebElement driver;
	public void verifyDashPage()
	{
		System.out.println(getDriver().getTitle());
	}

	public void SearchObject()
	{
	    WebElementFacade SearchObject = $(By.cssSelector("input[type='text']"));
	    SearchObject.type("iphone 13 pro max");
	}
	public void clickOnSearchButton()
	{
		WebElementFacade SearchButton = $(By.cssSelector("button[type='submit']"));
		SearchButton.click();
	}
	public void openProduct()
	{
	   WebElementFacade OpenProduct = $(By.cssSelector("div[class=\"_2kHMtA\"]"));
	   OpenProduct.click();
	   String str=OpenProduct.getText();
	   System.out.println(str);
	   
	}
	public void addToCart()
	{
		WebElementFacade AddCart = $(By.cssSelector("button[class='_2KpZ6l _2U9uOA _3v1-ww']"));
		AddCart.click();
	}
	public void waiting()
	{
		waitABit(10000);
	}
	public String switchwindow(){
        try {
        WebDriver driver=getDriver();
        String winHandleBefore = driver.getWindowHandle();

        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        }catch(Exception e){
        return Constants.ANSI_COLORS_DISABLED_PROPERTY_NAME+ "Unable to Switch Window" + e.getMessage();
        }
        return Constants.ANSI_COLORS_DISABLED_PROPERTY_NAME;
        }

	
	public void verifyCart() 
	{
	    WebElementFacade VerifyCart = $(By.cssSelector("div[class='zab8Yh _10k93p']"));
	    String str1=VerifyCart.getText();
		System.out.println(str1);
	}
}

/* public void openCart() 
{
	$(By.xpath("//div[@class='YUhWwv']")).click();
}
  */

