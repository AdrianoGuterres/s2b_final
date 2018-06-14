package rodoviariapoa.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchAppObject {

	private WebDriver driver;
		
	public SearchAppObject (WebDriver driver) {
		this.driver = driver;
	}
		
	public WebElement getOrigemTexfiel() {
		return this.driver.findElement(By.xpath("//*[@id=\"campo-origem\"]"));
	}
	
	public WebElement getDestinoTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"campo-destino\"]"));
	}
	
	public WebElement getIdaTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"campo-ida\"]"));
	}
	
	public WebElement getVoltaTextField() {
		return this.driver.findElement(By.xpath("//*[@id=\"campo-volta\"]"));
	}
	
	public WebElement getProcurarButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"procurar\"]"));
	}
	
}
