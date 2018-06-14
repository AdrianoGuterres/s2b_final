package rodoviariapoa.tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import rodoviariapoa.appobjects.SearchAppObject;

public class SearchTask {
	private SearchAppObject buscaAppObject;
	
	public SearchTask(WebDriver driver) {
		this.buscaAppObject = new SearchAppObject(driver);
	}
	
	public void preencharFormularioDeBusca(String origem, String destino, String ida, String volta) throws InterruptedException {
		this.buscaAppObject.getOrigemTexfiel().sendKeys(origem);
		Thread.sleep(1000);
		this.buscaAppObject.getOrigemTexfiel().sendKeys(Keys.ENTER);
		
		this.buscaAppObject.getDestinoTextField().sendKeys(destino);
		Thread.sleep(1000);
		this.buscaAppObject.getDestinoTextField().sendKeys(Keys.ENTER);
		
		this.buscaAppObject.getIdaTextField().sendKeys(ida);
		this.buscaAppObject.getVoltaTextField().sendKeys(volta);
	}
	
	public void enviarBusca() {		
		this.buscaAppObject.getProcurarButton().click();
		try { Thread.sleep(5000);} catch (InterruptedException e) {}
	}
	
}
