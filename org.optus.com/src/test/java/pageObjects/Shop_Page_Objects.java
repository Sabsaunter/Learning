package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shop_Page_Objects {
	
	public static WebElement buyStuffedFrog(WebDriver driver) {
		return driver.findElement(By.xpath("//h4[text()='Stuffed Frog']/following::a[contains(text(),'Buy')][1]"));	
	}
	
	public static WebElement buyFluffyBunny(WebDriver driver) {
		return driver.findElement(By.xpath("//h4[text()='Fluffy Bunny']/following::a[contains(text(),'Buy')][1]"));	
	}
	
	public static WebElement buyValentineBear(WebDriver driver) {
		return driver.findElement(By.xpath("//h4[text()='Valentine Bear']/following::a[contains(text(),'Buy')][1]"));	
	}
	
	public static WebElement priceOfStuffedFrog(WebDriver driver) {
		return driver.findElement(By.xpath("//h4[text()='Stuffed Frog']/following::span[1]"));	
	}
	
	public static WebElement priceOfFluffyBunny(WebDriver driver) {
		return driver.findElement(By.xpath("//h4[text()='Fluffy Bunny']/following::span[1]"));	
	}
	
	public static WebElement priceOfValentineBear(WebDriver driver) {
		return driver.findElement(By.xpath("//h4[text()='Valentine Bear']/following::span[1]"));	
	}

}
