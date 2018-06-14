package rodoviariapoa.testcases.with.firefox;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

import com.aventstack.extentreports.Status;

import rodoviariapoa.ressources.DriverSetup;
import rodoviariapoa.ressources.Report;
import rodoviariapoa.ressources.ScreenShot;
import rodoviariapoa.tasks.SearchTask;
import rodoviariapoa.verificationpoints.SearchVerificationPoint;

public class B002BuscaPassagemFirefoxTestCase {
	private WebDriver driver;
	private SearchTask buscaTask;
	private SearchVerificationPoint buscaVerificationPoint;

	@Before
	public void setUp() { 
		Report.startTest("Teste de busca.");
	    this.driver = DriverSetup.getDriverConfigFirefox("https://www.rodoviariaportoalegre.com.br");
		this.buscaTask = new SearchTask(driver);
		this.buscaVerificationPoint = new SearchVerificationPoint(driver);		
	}
	
	@Test
	public void testMain() throws InterruptedException {
		Report.log(Status.PASS, "A página carregou.", ScreenShot.capture(driver));
		this.buscaTask.preencharFormularioDeBusca("", "", "", "");
		Report.log(Status.PASS, "Dados inseridos no formulario.", ScreenShot.capture(driver));
		Thread.sleep(500);		
		
		this.buscaTask.enviarBusca();	
		Report.log(Status.PASS, "Resultado da busca.", ScreenShot.capture(driver));
		boolean condition = this.buscaVerificationPoint.resultVerification();
		Thread.sleep(500);	
		
		if(condition) {
			assertTrue(condition);	
			Report.log(Status.PASS, "Resultado do teste.", ScreenShot.capture(driver));
		}else {
			Report.log(Status.FAIL, "Erro.", ScreenShot.capture(driver));
		}
	}
	
	@After
	public void tearDown(){
		this.driver.quit();
	}
}
