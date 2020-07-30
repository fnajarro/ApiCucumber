
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ConsultaCep {
	
	private Response response;
	private ValidatableResponse json;
	private RequestSpecification request;
	
	@Dado("que faço um get na API de consulta de cep")
	public void que_faço_um_get_na_API_de_consulta_de_cep() {
		
		response = given()
				.when()
				.get("https://viacep.com.br/ws/05782351/json")
				;
	}

	@Quando("Retornar o código 200")
	public void retornar_o_código() {
		json = response
				.then()
				.statusCode(200)
				;
	}

	@Então("valido o nome da rua corretamente")
	public void valido_o_nome_da_rua_corretamente() {
		json = response
				.then()
				.body("logradouro", is("Rua Francisco da Cruz Mellão"))
		;
	}
}
