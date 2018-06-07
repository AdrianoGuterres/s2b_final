package rodoviariapoa.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscaAppObject {

	private WebDriver driver;
		
	public BuscaAppObject (WebDriver driver) {
		this.driver = driver;
	}
		
	public WebElement getOrigemComboBox() {
		return this.driver.findElement(By.id("campo-origem"));
	}
	
	public WebElement getDestinoComboBox() {
		return this.driver.findElement(By.id("campo-destino"));
	}
	
	public WebElement getIdaTextField() {
		return this.driver.findElement(By.id("campo-ida"));
	}
	
	public WebElement getVoltaTextField() {
		return this.driver.findElement(By.id("campo-volta"));
	}
	
	public WebElement getProcurarButton() {
		return this.driver.findElement(By.id("procurar"));
	}
	
}
