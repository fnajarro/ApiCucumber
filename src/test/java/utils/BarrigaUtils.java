package utils;

import io.restassured.RestAssured;

public class BarrigaUtils {
	
	public static Integer getIdContaPeloNome(String nome) { //M�todo para extrair o ID da conta buscando pelo nome
		return RestAssured.get("/contas?nome="+nome).then().extract().path("id[0]");
	}
	
	public static Integer getIdMovPelaDescricao(String desc) { //M�todo para extrair o ID da movimenta��o buscando pela descri��o
		return RestAssured.get("/transacoes?descricao="+desc).then().extract().path("id[0]");
	}
}
