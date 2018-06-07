package rodoviariapoa.tasks;

import org.openqa.selenium.WebDriver;

import rodoviariapoa.appobjects.CadastroAppObject;

public class CadastroTask {

	private CadastroAppObject cadastroAppObject;
	
	public CadastroTask(WebDriver driver) {
		this.cadastroAppObject = new CadastroAppObject(driver);
	}
	
	public void abrirFormularioDeCadastro() {
		this.cadastroAppObject.getLoginButton().click();
		this.cadastroAppObject.getCriarContaButton().click();
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
	
	
	
}
