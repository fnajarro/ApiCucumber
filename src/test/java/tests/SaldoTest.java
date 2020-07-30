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


public class SaldoTest extends BaseTest{
	
	private Response response;
	private RequestSpecification request;
	
	@Dado("^que vou calcular o saldo das contas$")
	public void deveCalcularSaldoContas() {
						
		request = given()
				;
	}
	
	@Quando("^eu fizer um get na API de saldos$")
	public void euFizerUmGetNaAPIDeSaldos() throws Throwable {
		
		response = request.when()
				.get("/saldo")
				;
	}
	
	@Então("^valido que o cód de retorno foi (\\d+)$")
	public void validoQueOCódDeRetornoFoi(int arg1) throws Throwable {
	    response.then()
	    .statusCode(arg1)
	    ;
	}

	@Então("^valido o saldo atual da conta$")
	public void validoOSaldoAtualDaConta() throws Throwable {
		Integer CONTA_ID = BarrigaUtils.getIdContaPeloNome("Conta para saldo");
		response.then()
		.body("find{it.conta_id == "+CONTA_ID+"}.saldo", is("534.00"))
		;
	}
}
