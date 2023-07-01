package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart_Page_Objects {
	
	public static WebElement cartPriceOfStuffedFrog(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody/tr/td[text()=' Stuffed Frog']/following::td[1]"));	
	}
	
	public static WebElement quantityFieldOfStuffedFrog(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody/tr/td[text()=' Stuffed Frog']/following::td[2]/input"));	
	}
	
	public static WebElement subtotalOfStuffedFrog(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody/tr/td[text()=' Stuffed Frog']/following::td[3]"));	
	}
	
	public static WebElement cartPriceOfFluffyBunny(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody/tr/td[text()=' Fluffy Bunny']/following::td[1]"));	
	}
	
	public static WebElement quantityFieldOfFluffyBunny(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody/tr/td[text()=' Fluffy Bunny']/following::td[2]/input"));	
	}
	
	public static WebElement subtotalFluffyBunny(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody/tr/td[text()=' Fluffy Bunny']/following::td[3]"));	
	}
	
	public static WebElement cartPriceOfValentineBear(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody/tr/td[text()=' Valentine Bear']/following::td[1]"));	
	}
	
	public static WebElement quantityFieldOfValentineBear(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody/tr/td[text()=' Valentine Bear']/following::td[2]/input"));	
	}
	
	public static WebElement subtotalValentineBear(WebDriver driver) {
		return driver.findElement(By.xpath("//tbody/tr/td[text()=' Valentine Bear']/following::td[3]"));	
	}
	
	public static WebElement totalCartPrice(WebDriver driver) {
		return driver.findElement(By.xpath("//tfoot/tr/td/strong"));	
	}
	
	public static WebElement checkoutCart(WebDriver driver) {
		return driver.findElement(By.xpath("//tfoot/tr/td/a"));	
	}
	
	public static WebElement emptyCart(WebDriver driver) {
		return driver.findElement(By.xpath("//tfoot/tr/td/following::a[text()='Empty Cart']"));	
	}

}
