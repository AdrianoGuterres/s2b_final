package rodoviariapoa.testcases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import rodoviariapoa.ressources.DriverSetup;
import rodoviariapoa.tasks.RegistrationTask;
import rodoviariapoa.verificationpoints.ResgistrationVerificationPoint;

public class RegistrationWithFirefoxFailTestCase {

	private WebDriver driver;
	private RegistrationTask cadastroTask;
	private ResgistrationVerificationPoint cadastroVerificationPoint;

	@Before
	public void setUp() { 
		this.driver =  DriverSetup.getDriverConfigFirefox("https://www.rodoviariaportoalegre.com.br");
		this.cadastroTask = new RegistrationTask(driver);
		this.cadastroVerificationPoint = new ResgistrationVerificationPoint(driver);		
	}

	
	@Test
	public void testMain() throws InterruptedException {
		this.cadastroTask.abrirFormularioDeCadastro();
		this.cadastroTask.preencherFormularioDeCadastro("teste@gmail.com", "", "Fulano da Silva", "1234567a", "1234567a");
		this.cadastroTask.enviarCadastro();
		
		Thread.sleep(2000);
		
		boolean condition = this.cadastroVerificationPoint.resultVerification();			
		assertFalse(condition);		
	}

	@After
	public void tearDown() {
		this.driver.quit();
	}

}
