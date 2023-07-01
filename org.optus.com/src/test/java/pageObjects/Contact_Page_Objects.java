package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Contact_Page_Objects {

	public static WebElement forenameField(WebDriver driver) {
		return driver.findElement(By.id("forename"));	
	}

	public static WebElement emailField(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}
	public static WebElement messageField(WebDriver driver) {
		return driver.findElement(By.id("message"));	
	}

	public static WebElement submitButton(WebDriver driver) {
		return driver.findElement(By.linkText("Submit"));
	}
	
	public static WebElement forenameError(WebDriver driver) {
		return driver.findElement(By.id("forename-err"));	
	}

	public static WebElement emailError(WebDriver driver) {
		return driver.findElement(By.id("email-err"));
	}
	public static WebElement messageError(WebDriver driver) {
		return driver.findElement(By.id("message-err"));	
	}

}
