package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page_Objects {

	public static WebElement homeButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='nav-home']/a[text()='Home']"));	
	}

	public static WebElement shopButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='nav-shop']/a[text()='Shop']"));
	}
	public static WebElement contactButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='nav-contact']/a[text()='Contact']"));	
	}

	public static WebElement cartButton(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id='nav-cart']/a[starts-with(text(),'Cart')]"));
	}

}
