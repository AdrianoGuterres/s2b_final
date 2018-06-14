package rodoviariapoa.tasks;


import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import rodoviariapoa.appobjects.LoginAppObject;
import rodoviariapoa.ressources.Report;
import rodoviariapoa.ressources.ScreenShot;

public class LoginTask {
	private LoginAppObject loginAppObject;
	private WebDriver driver;
	
	public LoginTask(WebDriver driver) {
		this.driver = driver;
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
