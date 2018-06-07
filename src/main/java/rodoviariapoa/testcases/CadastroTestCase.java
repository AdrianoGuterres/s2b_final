package rodoviariapoa.testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import rodoviariapoa.tasks.CadastroTask;
import rodoviariapoa.validationpoints.CadastroVerificationPoint;

public class CadastroTestCase {

	private WebDriver driver;
	private CadastroTask cadastroTask;
	private CadastroVerificationPoint cadastroVerificationPoint;

	@Before
	public void setUp() { 
		WebDriverManager.chromedriver().setup();
		this.driver = new ChromeDriver();
		this.driver.get("https://www.rodoviariaportoalegre.com.br");
		this.driver.manage().window().maximize();
		this.cadastroTask = new CadastroTask(driver);
		this.cadastroVerificationPoint = new CadastroVerificationPoint(driver);		
	}
	
	@Test
	public void testMain() {
		this.cadastroTask.abrirFormularioDeCadastro();
		this.cadastroTask.preencherFormularioDeCadastro("teste@gmail.com", "teste@gmail.com", "Fulano da Silva", "1234567a", "1234567a");
		this.cadastroTask.enviarCadastro();
		this.cadastroVerificationPoint.verificarMensagemDeSucesso();		
	}
	
	@After
	public void tearDown() {
		this.driver.quit();
	}

}
