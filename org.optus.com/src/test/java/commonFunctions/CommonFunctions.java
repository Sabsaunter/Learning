package commonFunctions;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {

	public Properties properties;
	public WebDriver driver;

	private synchronized void LoadPropertyFile(){

		properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	@BeforeTest
	public synchronized void LaunchBrowser() throws IOException {

		LoadPropertyFile();		

		switch (properties.getProperty("browser")) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			//LOGGER.info("Launching "+properties.getProperty(browser));
			driver = new ChromeDriver();
			break;

		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			//LOGGER.info("Launching "+properties.getProperty(browser));
			driver = new FirefoxDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			//LOGGER.info("Launching "+properties.getProperty(browser));
			driver = new ChromeDriver();
			break;
		}

		driver.manage().window().maximize();
		driver.get(properties.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	

}
