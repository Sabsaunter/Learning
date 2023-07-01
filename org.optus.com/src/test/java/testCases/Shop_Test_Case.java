package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import commonFunctions.CommonFunctions;
import io.qameta.allure.Allure;
import pageObjects.Cart_Page_Objects;
import pageObjects.Home_Page_Objects;
import pageObjects.Shop_Page_Objects;


public class Shop_Test_Case extends CommonFunctions{

	String priceofStuufedFrog;
	String priceOfFluffyBunny;
	String priceOfValentineBear;
	double subTotalOfStuufedFrog;
	double subTotalOfFluffyBunny;
	double subTotalOfValentineBear;
	double subTotal;
	double cartTotal;


	public void NavigateToShopPage() {

		Home_Page_Objects.shopButton(driver).click();	
		Allure.step("Navigating to Shop Page");

	}

	public void BuyProducts() {
		
		Allure.step("Picking the Products to Buy");

		Shop_Page_Objects.buyStuffedFrog(driver).click();
		priceofStuufedFrog = Shop_Page_Objects.priceOfStuffedFrog(driver).getText();

		Shop_Page_Objects.buyFluffyBunny(driver).click();
		priceOfFluffyBunny = Shop_Page_Objects.priceOfFluffyBunny(driver).getText();

		Shop_Page_Objects.buyValentineBear(driver).click();
		priceOfValentineBear = Shop_Page_Objects.priceOfValentineBear(driver).getText();	

	}

	public void CartUpdate() {

		Allure.step("Navigating to Cart Page");
		Home_Page_Objects.cartButton(driver).click();

		Allure.step("Updating the qunatity of each products");
		Cart_Page_Objects.quantityFieldOfStuffedFrog(driver).clear();
		Cart_Page_Objects.quantityFieldOfStuffedFrog(driver).sendKeys("2");

		Cart_Page_Objects.quantityFieldOfFluffyBunny(driver).clear();
		Cart_Page_Objects.quantityFieldOfFluffyBunny(driver).sendKeys("5");

		Cart_Page_Objects.quantityFieldOfValentineBear(driver).clear();
		Cart_Page_Objects.quantityFieldOfValentineBear(driver).sendKeys("3");

	}
	
	public void CalculateSubTotal() {
		
		Allure.step("Calculating the Sub Total of all products");
		
		 subTotalOfStuufedFrog = Double.valueOf(Cart_Page_Objects.subtotalOfStuffedFrog(driver).getText().replace("$", "")) ; 
		 subTotalOfFluffyBunny =  Double.valueOf(Cart_Page_Objects.subtotalFluffyBunny(driver).getText().replace("$", "")); 
		 subTotalOfValentineBear = Double.valueOf(Cart_Page_Objects.subtotalValentineBear(driver).getText().replace("$", ""));
		 
		 subTotal = subTotalOfStuufedFrog+subTotalOfFluffyBunny+subTotalOfValentineBear;
		 System.out.println("Product Sub Total is: "+subTotal);
				
	}


	@Test
	public void CartValidations() {

		NavigateToShopPage();
		BuyProducts();
		CartUpdate();
		CalculateSubTotal();

		Allure.step("Verifying the price displayed on cart Page of each product is same as that of shop page");
		Assert.assertEquals(priceofStuufedFrog, Cart_Page_Objects.cartPriceOfStuffedFrog(driver).getText());
		Assert.assertEquals(priceOfFluffyBunny, Cart_Page_Objects.cartPriceOfFluffyBunny(driver).getText());
		Assert.assertEquals(priceOfValentineBear, Cart_Page_Objects.cartPriceOfValentineBear(driver).getText());
		
		Allure.step("Verifying the cart price Toatl is quals to the sub Total of all products selected");
		cartTotal = Double.valueOf(Cart_Page_Objects.totalCartPrice(driver).getText().replace("Total:", "").replace("Total: $", ""));
		Assert.assertEquals(subTotal,cartTotal);
		System.out.println("Cart Total is: "+cartTotal);
	}


}
