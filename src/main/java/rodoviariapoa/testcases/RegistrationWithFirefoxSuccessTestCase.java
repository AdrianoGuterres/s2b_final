package rodoviariapoa.testcases;

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

public class RegistrationWithFirefoxSuccessTestCase {

	private WebDriver driver;
	private RegistrationTask cadastroTask;
	private ResgistrationVerificationPoint cadastroVerificationPoint;

	@Before
	public void setUp() { 
		this.driver = DriverSetup.getDriverConfigFirefox("https://www.rodoviariaportoalegre.com.br");
		this.driver.manage().window().maximize();
		this.cadastroTask = new RegistrationTask(driver);
		this.cadastroVerificationPoint = new ResgistrationVerificationPoint(driver);		
	}

	@Test
	public void testMain() {
		this.cadastroTask.abrirFormularioDeCadastro();
		this.cadastroTask.preencherFormularioDeCadastro("teste@gmail.com", "teste@gmail.com", "Fulano da Silva", "1234567a", "1234567a");
		this.cadastroTask.enviarCadastro();
		
		boolean condition = this.cadastroVerificationPoint.resultVerification();		
		assertTrue(condition);		
	}

	@After
	public void tearDown() {
		this.driver.quit();
	}

}
