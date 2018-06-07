package rodoviariapoa.validationpoints;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class CadastroVerificationPoint {

	private WebDriver driver;
	
	public CadastroVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verificarMensagemDeSucesso() {
		final String expectedMessage = "conta de usuário criada com sucesso";
		assertTrue(this.driver.getPageSource().contains(expectedMessage));
	}
	
}
