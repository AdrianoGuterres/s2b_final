package rodoviariapoa.testsuites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import rodoviariapoa.ressources.Report;
import rodoviariapoa.testcases.B001BuscaPassagemChromeTestCase;
import rodoviariapoa.testcases.B001BuscaPassagemFirefoxTestCase;
import rodoviariapoa.testcases.B002BuscaPassagemChromeTestCase;
import rodoviariapoa.testcases.B002BuscaPassagemFirefoxTestCase;
import rodoviariapoa.testcases.B003BuscaPassagemChromeTestCase;
import rodoviariapoa.testcases.B003BuscaPassagemFirefoxTestCase;
import rodoviariapoa.testcases.C001EfetuarCadastroChromeTestCase;
import rodoviariapoa.testcases.C001EfetuarCadastroFirefoxTestCase;
import rodoviariapoa.testcases.C002EfetuarCadastroChromeTestCase;
import rodoviariapoa.testcases.C002EfetuarCadastroFirefoxTestCase;
import rodoviariapoa.testcases.C003EfetuarCadastroChromeTestCase;
import rodoviariapoa.testcases.C003EfetuarCadastroFirefoxTestCase;
import rodoviariapoa.testcases.C004EfetuarCadastroChromeTestCase;
import rodoviariapoa.testcases.C004EfetuarCadastroFirefoxTestCase;



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
