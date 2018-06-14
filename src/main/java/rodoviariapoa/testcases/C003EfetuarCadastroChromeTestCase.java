package rodoviariapoa.testcases;

import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import rodoviariapoa.ressources.DriverSetup;
import rodoviariapoa.ressources.Report;
import rodoviariapoa.ressources.ScreenShot;
import rodoviariapoa.tasks.RegistrationTask;
import rodoviariapoa.verificationpoints.ResgistrationVerificationPoint;

public class C003EfetuarCadastroChromeTestCase {

	private WebDriver driver;
	private RegistrationTask cadastroTask;
	private ResgistrationVerificationPoint cadastroVerificationPoint;

	@Before
	public void setUp() { 
		Report.startTest("Caso de teste C003: Efetuar Cadastro com o Chrome");
		this.driver = DriverSetup.getDriverConfigForChrome("https://www.rodoviariaportoalegre.com.br");
		this.cadastroTask = new RegistrationTask(driver);
		this.cadastroVerificationPoint = new ResgistrationVerificationPoint(driver);		
	}
	
	@Test
	public void testMain() throws InterruptedException {		
		Report.log(Status.PASS, "a página carregou.", ScreenShot.capture(driver)); 
		this.cadastroTask.abrirFormularioDeCadastro();		
		Report.log(Status.PASS, "O formulário de login abriu", ScreenShot.capture(driver)); 
		
		Thread.sleep(300);				
		Report.log(Status.PASS, "O formulário para criar conta abriu.", ScreenShot.capture(driver)); 
		
		this.cadastroTask.preencherFormularioDeCadastro("teste@gmail.com", "teste@gmail.com", "João", "1234567", "1234567");
		Report.log(Status.PASS, "Os dados foram inseridos.", ScreenShot.capture(driver)); 
		
		this.cadastroTask.enviarCadastro();
		Report.log(Status.PASS, "Enviando cadastro.", ScreenShot.capture(driver));
		Thread.sleep(2000);
		
		boolean condition = this.cadastroVerificationPoint.resultVerification();	
		
		if(condition == false) {
			Report.log(Status.PASS, "O teste passou.", ScreenShot.capture(driver)); 
			assertFalse(condition);
		}else {
			Report.log(Status.FAIL, "O teste falhou.", ScreenShot.capture(driver)); 
		}
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}

}
