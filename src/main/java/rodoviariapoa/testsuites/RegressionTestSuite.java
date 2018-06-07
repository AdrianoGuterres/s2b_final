package rodoviariapoa.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import rodoviariapoa.testcases.BuscaTestCase;
import rodoviariapoa.testcases.CadastroTestCase;
import rodoviariapoa.testcases.LoginTestCase;



@RunWith(Suite.class)
@SuiteClasses({
	CadastroTestCase.class,
	LoginTestCase.class,
	BuscaTestCase.class
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
