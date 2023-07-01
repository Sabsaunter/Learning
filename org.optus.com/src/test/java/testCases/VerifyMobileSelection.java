package testCases;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.Login_Page_Object;
import pageObjects.Mobile_Page_Objects;

public class VerifyMobileSelection extends CommonFunctions {

	public void Login() {

		Login_Page_Object.shopAttribute(driver).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(Login_Page_Object.latestMobileAttribute(driver)).click().build().perform();
		
		
	}

	public void SelectSamsungS23Mobile() {

		Actions action = new Actions(driver);
		action.moveToElement(Mobile_Page_Objects.samsungS23Mobile(driver)).click().build().perform();

	}

	@Test
	public void VerifySamsungS23Selection() {

		Login();
		SelectSamsungS23Mobile();

		String ActualName = Mobile_Page_Objects.verifySamsungS23Mobile(driver).getText();
		

		Assert.assertEquals(ActualName, "Samsung Galaxy S23");
		
	}
	
}

