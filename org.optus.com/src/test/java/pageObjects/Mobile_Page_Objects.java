package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mobile_Page_Objects {
	
	public static WebElement samsungS23Mobile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\'phones_jcrcontent_par_sd_component_device__1478385516_1422381029\']/div/div/div[1]/div[1]/div[2]/div/div[4]/button"));
		
	}

		public static WebElement verifySamsungS23Mobile(WebDriver driver) {
			return driver.findElement(By.xpath("//*[@id=\'par_responsive_container_responsive_container_746448112_sd_component_mec_tex_772094077\']/div/h1"));
		
}

}