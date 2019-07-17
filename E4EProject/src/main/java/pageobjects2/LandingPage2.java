package pageobjects2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage2 {
	
	
	public WebDriver driver;
	By signin=By.cssSelector("a[href*='sign_in']");
	
	
	
	//public LandingPage2(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		//this.driver=driver2;
	//}

	

	public LandingPage2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}






	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	}


