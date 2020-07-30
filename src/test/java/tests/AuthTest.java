package tests;

import static io.restassured.RestAssured.given;
import core.BaseTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;

public class AuthTest extends BaseTest{
	
	private Response response;
	
	
	@Dado("que faço um get na API sem passar o token")
	public void getSemToken() {
		FilterableRequestSpecification req = (FilterableRequestSpecification) RestAssured.requestSpecification;
		req.removeHeader("Authorization"); // As duas linhas removem o token do header antes de executar esse teste
		
		response = given()
		.when()
			.get("/contas")
		;
	}
	
	
	@Então("^valido que o código de retorno é (\\d+)$")
	public void validoQueOCódigoDeRetornoÉ(int arg1) throws Throwable {
		
		response
				.then()
				.statusCode(401)
				;
	    
	}
}
