package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import utils.BarrigaUtils;
import core.BaseTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ContasTest extends BaseTest{
	
	private Response response;
	private RequestSpecification request;
	
	@Dado("^que vou incluir uma conta nova$")
	public void deveIncluirContaComSucesso() {
		request = given()
				.body("{ \"nome\": \"Conta Inserida\" }")
				;
	}
	
	@Quando("^eu fizer um post na API de contas$")
	public void euFizerUmPostNaAPIDeContas() throws Throwable {
		response = request.when()
				.post("/contas")
				;
	    
	}

	@Então("^valido que o retorno foi (\\d+) e a conta foi inserida com sucesso$")
	public void validoQueORetornoFoiEAContaFoiInseridaComSucesso(int arg1) throws Throwable {
		response.then()
				.statusCode(arg1)
	;
	}
	
		
	@Dado("^que vou alterar uma conta existente$")
	public void deveAlterarContaComSucesso() {
		Integer CONTA_ID = BarrigaUtils.getIdContaPeloNome("Conta para alterar");//Obtem o ID de uma conta
		
		request = given()
			.body("{ \"nome\": \"Conta alterada\" }")
			.pathParam("id", CONTA_ID) //Cria parametro com o ID da conta
		;
	}
	
	@Quando("^eu fizer um put na API de contas$")
	public void euFizerUmPutNaAPIDeContas() throws Throwable {
		response = request.when()
				.put("/contas/{id}")//Inclui o ID da conta no endere�o de requisi��o
				;
	}

	@Então("^valido que o retorno foi (\\d+) e a conta foi alterada com sucesso$")
	public void validoQueORetornoFoiEAContaFoiAlteradaComSucesso(int arg1) throws Throwable {
		response.then()
		.statusCode(arg1)
		.body("nome", is("Conta alterada"))
	;
	}
	
	@Dado("^que vou incluir uma conta já existente$")
	public void naoDeveIncluirContaComNomeRepetido() {
		
		request = given()
			.body("{ \"nome\": \"Conta mesmo nome\" }")
			;
	}
	
	@Então("^valido que o retorno foi (\\d+) e a conta não foi inserida por duplicidade$")
	public void validoQueORetornoFoiEAContaNãoFoiInseridaPorDuplicidade(int arg1) throws Throwable {
		response.then()
		.statusCode(arg1)
		.body("error", is("Já existe uma conta com esse nome!"))
	;
	}
}
