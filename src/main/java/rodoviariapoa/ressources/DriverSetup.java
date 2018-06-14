package rodoviariapoa.ressources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	
	public static WebDriver getDriverConfigForChrome(String url) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get(url);
		Report.log(Status.INFO, "A pagina foi carregada.", ScreenShot.capture(driver));
		return driver;				
	}
		
	
	public static WebDriver getDriverConfigFirefox(String url) {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();				
		driver.get(url);
		Report.log(Status.INFO, "A pagina foi carregada.", ScreenShot.capture(driver));
		return driver;	
	}		
}
