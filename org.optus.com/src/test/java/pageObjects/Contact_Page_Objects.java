package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.qameta.allure.Allure;

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
	
	public static void forenameError(WebDriver driver) {
		errorValidation(driver,"forename-err", "Forename is required");
	}
	
	public static void emailError(WebDriver driver) {
		errorValidation(driver,"email-err", "Email is required");
	}
	
	public static void messageError(WebDriver driver) {
		errorValidation(driver,"message-err", "Message is required");
	}
	
	private static void errorValidation(WebDriver driver, String Value, String ErrorMessage) {
		boolean errorExists = false;
		try {
			driver.findElement(By.id(Value));
		  } catch (Exception e) {
			 errorExists = true;
		  }

		  if (errorExists) {
			  Allure.step("Error Message "+ErrorMessage+" Disappered after inputing Mandatory field");
		  } else {
			 if(ErrorMessage.equals(driver.findElement(By.id(Value)).getText())) {
				 Allure.step("Error Message..Please input value for "+ErrorMessage+" Field");
			 }
		  }
	}

}
