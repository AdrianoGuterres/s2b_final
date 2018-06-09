package rodoviariapoa.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import rodoviariapoa.testcases.SearchForPassageWhitFirefoxSuccessTestCase;
import rodoviariapoa.testcases.RegistrationWithFirefoxSuccessTestCase;
import rodoviariapoa.testcases.LoginWithFirefoxSuccessTestCase;



@RunWith(Suite.class)
@SuiteClasses({
	RegistrationWithFirefoxSuccessTestCase.class,
	LoginWithFirefoxSuccessTestCase.class,
	SearchForPassageWhitFirefoxSuccessTestCase.class
})

public class RegressionTestSuite {

	@BeforeClass
	public static void init() {
		System.out.println("Iniciando a execução.");
	}
	
	@AfterClass
	public static void end() {
		System.out.println("Fechando.");
	}
	
}
