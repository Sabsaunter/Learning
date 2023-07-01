package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page_Object {
	
	public static WebElement shopAttribute(WebDriver driver) {
		return driver.findElement(By.className("cta-label"));
		
	}

		public static WebElement latestMobileAttribute(WebDriver driver) {
			return driver.findElement(By.linkText("Latest Phones"));
		
}
	
	
}
