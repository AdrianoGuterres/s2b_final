package rodoviariapoa.validationpoints;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class BuscaVerificationPoint {
	private WebDriver driver;
	
	public BuscaVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verificarMensagemDeSucesso() {
		final String expectedMessage = "Horários de ônibus e preços de passagens";
		assertTrue(this.driver.getPageSource().contains(expectedMessage));
	}
}
