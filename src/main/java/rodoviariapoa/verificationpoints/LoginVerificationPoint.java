package rodoviariapoa.verificationpoints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginVerificationPoint {
	
	private WebDriver driver;
	
	public LoginVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean verificarMensagemDeSucesso() {
		
		WebElement element = this.driver.findElement(By.xpath("//*[@id=\"MenuLogado\"]"));
		
		return element.isDisplayed();
	}
	
}
