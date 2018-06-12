package rodoviariapoa.testcases;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import rodoviariapoa.ressources.DriverSetup;
import rodoviariapoa.tasks.SearchTask;
import rodoviariapoa.verificationpoints.SearchVerificationPoint;

public class SearchForPassageWhitFirefoxSuccessTestCase {
	private WebDriver driver;
	private SearchTask buscaTask;
	private SearchVerificationPoint buscaVerificationPoint;

	@Before
	public void setUp() { 
	    this.driver = DriverSetup.getDriverConfigFirefox("https://www.rodoviariaportoalegre.com.br");
		this.buscaTask = new SearchTask(driver);
		this.buscaVerificationPoint = new SearchVerificationPoint(driver);		
	}
	
	@Test
	public void testMain() throws InterruptedException {
		this.buscaTask.preencharFormularioDeBusca("Porto Alegre - rs", "Rio de Janeiro - rj", "12/08/2018", "15/09/218");
		this.buscaTask.enviarBusca();		
		Thread.sleep(2000);	
		
		boolean condition = this.buscaVerificationPoint.resultVerification();		
		assertTrue(condition);		
	}
	
	@After
	public void tearDown(){
		this.driver.quit();
	}
}
