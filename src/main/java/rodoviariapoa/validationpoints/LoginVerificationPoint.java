package rodoviariapoa.validationpoints;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class LoginVerificationPoint {
	
	private WebDriver driver;
	
	public LoginVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verificarMensagemDeSucesso() {
		final String expectedMessage = "Fulano";
		assertTrue(this.driver.getPageSource().contains(expectedMessage));
	}
	
}
