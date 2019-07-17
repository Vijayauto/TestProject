package Academy1;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjects2.LandingPage2;
import resources2.base2;

public class HomePage2 extends base2 {
	
	@Test
	public void basePageNavigation() throws IOException
	
	{
		driver=intializeDriver();
		driver.get("http://www.qaclickacademy.com");
		driver.manage().window().maximize();
		LandingPage2 l= new LandingPage2(driver);
		l.getLogin().click();
	}
	

}
