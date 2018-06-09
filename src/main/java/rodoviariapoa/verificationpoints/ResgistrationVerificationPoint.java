package rodoviariapoa.verificationpoints;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResgistrationVerificationPoint {

	private WebDriver driver;
	
	public ResgistrationVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean resultVerification() {		
		WebElement element = this.driver.findElement(By.xpath("/html/body/header/nav/ul/li[9]/div/div[6]/label"));

		
		return element.isDisplayed();
		
		
		
	}
	
	public boolean resultFailVerification() {
		
		WebElement element = this.driver.findElement(By.xpath("/html/body/header/nav/ul/li[9]/div/div[3]/div[2]/div"));

		
		return element.isDisplayed();				
	}
	
}
