package rodoviariapoa.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import rodoviariapoa.ressources.Report;
import rodoviariapoa.testcases.with.firefox.C004EfetuarCadastroFirefoxTestCase;
import rodoviariapoa.testcases.with.firefox.B001BuscaPassagemChromeTestCase;
import rodoviariapoa.testcases.with.firefox.B001BuscaPassagemFirefoxTestCase;
import rodoviariapoa.testcases.with.firefox.B002BuscaPassagemChromeTestCase;
import rodoviariapoa.testcases.with.firefox.B002BuscaPassagemFirefoxTestCase;
import rodoviariapoa.testcases.with.firefox.B003BuscaPassagemChromeTestCase;
import rodoviariapoa.testcases.with.firefox.B003BuscaPassagemFirefoxTestCase;
import rodoviariapoa.testcases.with.firefox.C001EfetuarCadastroChromeTestCase;
import rodoviariapoa.testcases.with.firefox.C001EfetuarCadastroFirefoxTestCase;
import rodoviariapoa.testcases.with.firefox.C002EfetuarCadastroChromeTestCase;
import rodoviariapoa.testcases.with.firefox.C002EfetuarCadastroFirefoxTestCase;
import rodoviariapoa.testcases.with.firefox.C003EfetuarCadastroChromeTestCase;
import rodoviariapoa.testcases.with.firefox.C003EfetuarCadastroFirefoxTestCase;
import rodoviariapoa.testcases.with.firefox.C004EfetuarCadastroChromeTestCase;



@RunWith(Suite.class)
@SuiteClasses({
	C004EfetuarCadastroFirefoxTestCase.class,
	C003EfetuarCadastroFirefoxTestCase.class,
	C002EfetuarCadastroFirefoxTestCase.class,
	C001EfetuarCadastroFirefoxTestCase.class,
	B003BuscaPassagemFirefoxTestCase.class,
	B002BuscaPassagemFirefoxTestCase.class,
	B001BuscaPassagemFirefoxTestCase.class,
	
	C004EfetuarCadastroChromeTestCase.class,
	C003EfetuarCadastroChromeTestCase.class,
	C002EfetuarCadastroChromeTestCase.class,
	C001EfetuarCadastroChromeTestCase.class,
	B003BuscaPassagemChromeTestCase.class,
	B002BuscaPassagemChromeTestCase.class,
	B001BuscaPassagemChromeTestCase.class 	
})

public class AllTestsTestSuite {
	

	@BeforeClass
	public static void init() {
		System.out.println("Iniciando a execução.");
		Report.create("Rodoviária de Porto Alegre", "Suite de Testes");
	}
	
	@AfterClass
	public static void end() {
		System.out.println("Fechando.");
		Report.close();
	}
	
}
