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

	public static WebElement emailError(WebDriver driver) {
		return driver.findElement(By.id("email-err"));
	}
	public static WebElement messageError(WebDriver driver) {
		return driver.findElement(By.id("message-err"));	
	}
	
	private static void errorValidation(WebDriver driver, String Value, String ErrorMessage) {
		boolean errorExists = false;
		try {
			driver.findElement(By.id(Value));
		  } catch (Exception e) { // error thrown is: "NoSuchElementError: no such element"
			 errorExists = true;
		  }

		  if (errorExists) {
			  System.out.println("ghjtgyubn");
			Allure.step("Hiiiiiii");
		  } else {
			 if(ErrorMessage.equals(driver.findElement(By.id(Value)).getText())) {
				 System.out.println("fghjkty");
				 	Allure.step("dfghjk");
			 }
		  }
	}

}
