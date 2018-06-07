package rodoviariapoa.tasks;

import org.openqa.selenium.WebDriver;

import rodoviariapoa.appobjects.LoginAppObject;

public class LoginTask {
	private LoginAppObject loginAppObject;
	
	public LoginTask(WebDriver driver) {
		this.loginAppObject = new LoginAppObject(driver);
	}
	
	public void abrirFormularioDeLogin() {
		this.loginAppObject.getLoginButton().click();
	}
	
	public void preencherFormularioDeLogin(String email, String senha) {
		this.loginAppObject.getEmailTextField().sendKeys(email);
		this.loginAppObject.getSenhaTextField().sendKeys(senha);
	}
	
	public void enviarLogin() {
		this.loginAppObject.getEntrarButton().click();
	}
}
