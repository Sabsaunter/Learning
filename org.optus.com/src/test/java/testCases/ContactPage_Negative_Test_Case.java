package testCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import commonFunctions.CommonFunctions;
import io.qameta.allure.Allure;
import pageObjects.Contact_Page_Objects;
import pageObjects.Home_Page_Objects;


public class ContactPage_Negative_Test_Case extends CommonFunctions{



	public void NavigateToContactPage() {

		Home_Page_Objects.contactButton(driver).click();	
		Allure.step("Navigating to Contact Page");

	}

	@Test
	public void ContactPageNegativeScenario() {

		NavigateToContactPage();

		Allure.step("Clicking on submit button without entering Mandatory Field values");
		Contact_Page_Objects.submitButton(driver).click();
	
		Contact_Page_Objects.forenameError(driver);
		Contact_Page_Objects.emailError(driver);
		Contact_Page_Objects.messageError(driver);
		
		Allure.step("Inputing values for all the Mandatory fields");
		
		Contact_Page_Objects.forenameField(driver).sendKeys("Test User");
		Contact_Page_Objects.emailField(driver).sendKeys("test@gmail.com");
		Contact_Page_Objects.messageField(driver).sendKeys("Hello Welcome!..");
		
				
		Contact_Page_Objects.forenameError(driver);
		Contact_Page_Objects.emailError(driver);
		Contact_Page_Objects.messageError(driver);
	
		Allure.step("Clicking on Submit Button");
		
//		Contact_Page_Objects.submitButton(driver).click();
//
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/a")));

		Allure.step("Navigating back to Home Page");
		Home_Page_Objects.homeButton(driver).click();

	}
	
	

}