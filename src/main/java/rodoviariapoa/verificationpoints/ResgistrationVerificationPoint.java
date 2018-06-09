package rodoviariapoa.verificationpoints;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class ResgistrationVerificationPoint {

	private WebDriver driver;
	
	public ResgistrationVerificationPoint(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean resultVerification() {		
		final String expectedMessage = "conta de usuário criada com sucesso";
		return this.driver.getPageSource().contains(expectedMessage);
	}
	
}
