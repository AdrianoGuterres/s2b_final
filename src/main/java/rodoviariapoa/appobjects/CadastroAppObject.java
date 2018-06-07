package rodoviariapoa.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CadastroAppObject {
	private WebDriver driver;
	
	public CadastroAppObject (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getLoginButton() {
		return this.driver.findElement(By.id("MenuLogin"));
	}
	
	public WebElement getCriarContaButton() {
		return this.driver.findElement(By.id("CriarConta"));
	}
	
	public WebElement getEmailTextField() {
		return this.driver.findElement(By.id("emailLoginCad"));
	}
	
	public WebElement getConfirmarEmailTextField() {
		return this.driver.findElement(By.id("emailLoginConfCad"));
	}
	
	public WebElement getNomeTextField() {
		return this.driver.findElement(By.id("nomeLoginCad"));
	}
	
	public WebElement getSenhaTextField() {
		return this.driver.findElement(By.id("senhaLoginCad"));
	}
	
	public WebElement getConfirmarSenhaTextField() {
		return this.driver.findElement(By.id("senhaLoginConfCad"));
	}
	
	public WebElement getEnviarButton() {
		return this.driver.findElement(By.id("BtnCriarConta"));
	}
	
	
}
