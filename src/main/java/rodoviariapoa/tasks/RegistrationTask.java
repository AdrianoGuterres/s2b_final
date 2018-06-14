package rodoviariapoa.tasks;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import rodoviariapoa.appobjects.RegistrationAppObject;
import rodoviariapoa.ressources.Report;
import rodoviariapoa.ressources.ScreenShot;

public class RegistrationTask {

	private RegistrationAppObject cadastroAppObject;

	public RegistrationTask(WebDriver driver) {
		this.cadastroAppObject = new RegistrationAppObject(driver);
	}

	public void abrirFormularioDeCadastro() {
		this.cadastroAppObject.getLoginButton().click();
		try { Thread.sleep(300);} catch (InterruptedException e) {}		

		this.cadastroAppObject.getCriarContaButton().click();
		try { Thread.sleep(300); } catch (InterruptedException e) {}
	}

	public void preencherFormularioDeCadastro(String email, String confirmarEmail, String nome, String senha, String confirmarSenha) {
		this.cadastroAppObject.getEmailTextField().sendKeys(email);
		this.cadastroAppObject.getConfirmarEmailTextField().sendKeys(confirmarEmail);
		this.cadastroAppObject.getNomeTextField().sendKeys(nome);
		this.cadastroAppObject.getSenhaTextField().sendKeys(senha);
		this.cadastroAppObject.getConfirmarSenhaTextField().sendKeys(confirmarSenha); 
	}

	public void enviarCadastro() {
		this.cadastroAppObject.getEnviarButton().click();
	}

	public void clicarBotaoLogin() {
		this.cadastroAppObject.getLoginButton().click();
	}

	public void clicarBotaoCriarConta() {
		this.cadastroAppObject.getEnviarButton().click();
	}


}
