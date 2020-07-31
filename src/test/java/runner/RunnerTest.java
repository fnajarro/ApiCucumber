package runner;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import core.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/",
		glue = "tests",
		tags = {"~@ignore"},
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
//		plugin = {"pretty", "io.qameta.allure.cucumberjvm.AllureCucumberJvm:target/allure-results", "html:target/report-html", "json:target/report.json", "junit:Folder_Name/cucumber.xml"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		)

public class RunnerTest extends BaseTest{
	
	@BeforeClass
	public static void login() {
		Map<String, String> login = new HashMap<String, String>(); //Criacao do MAP para enviar as credenciais para efetuar login
		login.put("email", "fabiano@najarro"); // Setando o e-mail...		
		login.put("senha", "123456"); //Setando a senha
		
		//Bloco para efetuar login
		String TOKEN = given() //Guarda na variavel "token", o token que foi extraido
			.body(login) // Passa os dados de login no body
		.when()
			.post("/signin") //Faz um post na interface de login 
		.then()
			.statusCode(200)
			.extract().path("token") // Extrai o token obtido no corpo do resultado da requisicao
		;
		RestAssured.requestSpecification.header("Authorization", "JWT " + TOKEN);//Passando o token no header de todas as requisicoes (Em APIs mais modernas e mais comun usar "bearer" no lugar de "JWT" para autenticar
		
		RestAssured.get("/reset").then().statusCode(200);
	}

}
