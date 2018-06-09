package rodoviariapoa.verificationpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchVerificationPoint {
	private WebDriver driver;
	
	public SearchVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean resultVerification() {		
		WebElement element = this.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/h2"));				
		return element.isDisplayed();
	}
}
