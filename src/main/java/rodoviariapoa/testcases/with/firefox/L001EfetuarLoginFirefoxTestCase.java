package rodoviariapoa.testcases.with.firefox;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;
import rodoviariapoa.ressources.DriverSetup;
import rodoviariapoa.ressources.Report;
import rodoviariapoa.ressources.ScreenShot;
import rodoviariapoa.tasks.LoginTask;
import rodoviariapoa.verificationpoints.LoginVerificationPoint;

public class L001EfetuarLoginFirefoxTestCase {
	private WebDriver driver;
	private LoginTask loginTask;
	private LoginVerificationPoint loginVerificationPoint;

	@Before
	public void setUp() { 
		Report.startTest("Caso de teste C004: Efetuar Cadastro sem confirmação de senha");
		
		this.driver =  DriverSetup.getDriverConfigFirefox("https://www.rodoviariaportoalegre.com.br");
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
