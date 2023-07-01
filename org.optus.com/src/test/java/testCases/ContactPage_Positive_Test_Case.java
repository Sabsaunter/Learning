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

public class ContactPage_Positive_Test_Case extends CommonFunctions{
	
	
	
	public void NavigateToContactPage() {

		Home_Page_Objects.contactButton(driver).click();	
		Allure.step("Navigating to Contact Page");
	}
	
	@Test(invocationCount = 5)
	public void ContactPagePositiveScenario() {
		
		NavigateToContactPage();
		
		Allure.step("Inputting values for Mandatory Fields and Clicking on Submit Button");
		
		Contact_Page_Objects.forenameField(driver).sendKeys("Test User");
		Contact_Page_Objects.emailField(driver).sendKeys("test@gmail.com");
		Contact_Page_Objects.messageField(driver).sendKeys("Hello Welcome!..");
		
		Contact_Page_Objects.submitButton(driver).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/a")));
		
		Allure.step("Navigating back to Home Page");
		Home_Page_Objects.homeButton(driver).click();
		
	}
}
