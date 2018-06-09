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
		this.buscaAppObject.getOrigemComboBox().sendKeys(origem);
		Thread.sleep(1000);
		this.buscaAppObject.getOrigemComboBox().sendKeys(Keys.ENTER);
		this.buscaAppObject.getDestinoComboBox().sendKeys(destino);
		Thread.sleep(1000);
		this.buscaAppObject.getDestinoComboBox().sendKeys(Keys.ENTER);
		this.buscaAppObject.getIdaTextField().sendKeys(ida);
		this.buscaAppObject.getVoltaTextField().sendKeys(volta);
	}
	
	public void enviarBusca() {
		this.buscaAppObject.getProcurarButton().click();
	}
	
}
