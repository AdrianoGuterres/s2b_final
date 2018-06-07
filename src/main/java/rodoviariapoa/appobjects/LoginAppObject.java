package rodoviariapoa.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {
	
	private WebDriver driver;
	
	public LoginAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getLoginButton() {
		return this.driver.findElement(By.id("MenuLogin"));
	}
	
	public WebElement getEmailTextField() {
		return this.driver.findElement(By.id("emailLogin"));
	}
	
	public WebElement getSenhaTextField() {
		return this.driver.findElement(By.id("senhaLogin"));
	}
	
	public WebElement getEntrarButton() {
		return this.driver.findElement(By.id("BtnLogar"));
	}

}
