package rodoviariapoa.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import rodoviariapoa.ressources.DriverSetup;
import rodoviariapoa.ressources.Report;
import rodoviariapoa.ressources.ScreenShot;
import rodoviariapoa.tasks.LoginTask;
import rodoviariapoa.verificationpoints.LoginVerificationPoint;

public class L001EfetuarLoginChromeTestCase {
	private WebDriver driver;
	private LoginTask loginTask;
	private LoginVerificationPoint loginVerificationPoint;

	@Before
	public void setUp() { 
		Report.startTest("Caso de teste L001: Efetuar Login com o Chrome");
		this.driver = DriverSetup.getDriverConfigForChrome("https://www.rodoviariaportoalegre.com.br");
		this.loginTask = new LoginTask(driver);
		this.loginVerificationPoint = new LoginVerificationPoint(driver);		
	}
	
	@Test
	public void testMain() throws InterruptedException {
		this.loginTask.abrirFormularioDeLogin();
		Report.log(Status.PASS, "Formulário aberto.", ScreenShot.capture(driver));
		
		this.loginTask.preencherFormularioDeLogin("j332357@nwytg.com", "1234567a");
		
		Report.log(Status.PASS, "Formulário preenchido.", ScreenShot.capture(driver));
		
		this.loginTask.enviarLogin();
		
		boolean condition = this.loginVerificationPoint.verificarMensagemDeSucesso();	
		
		if(condition) {
			Report.log(Status.PASS, "O teste passou.", ScreenShot.capture(driver)); 
		}else {
			Report.log(Status.FAIL, "O teste falhou.", ScreenShot.capture(driver)); 
		}				
	}
	
	@After
	public void tearDown(){
		this.driver.quit();
	}
}
