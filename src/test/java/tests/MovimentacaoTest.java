package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import utils.Movimentacao;
import utils.BarrigaUtils;
import utils.DateUtils;
import core.BaseTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class MovimentacaoTest extends BaseTest{
	private Response response;
	private RequestSpecification request;
	
	@Dado("^que vou inserir uma nova movimentação$")
	public void deveInserirMovimentacaoComSucesso() {
		Movimentacao mov = getMovimentacaoValida(); //Chama o m�todo que seta os valores dos campos a serem passados na chamada
		
		request = given()
				.body(mov)
		;
	}
	
	@Quando("^eu fizer um post na API de movimentações$")
	public void euFizerUmPostNaAPIDeMovimentações() throws Throwable {
		response = request.when()
				.post("/transacoes")
				;
	}

	@Então("^valido que o retorno foi (\\d+) e a movimentação foi inserida com sucesso$")
	public void validoQueORetornoFoiEAMovimentaçãoFoiInseridaComSucesso(int arg1) throws Throwable {
		response.then()
		.statusCode(arg1)
	;
	}
	
	@Dado("^que vou inserir uma nova movimentação com todos os campos em branco$")
	public void deveValidarCamposObrigatoriosNaMovimentacao() {
				
		request = given()
			.body("{}")
			;
	}
	
	@Então("^valido que o retorno foi (\\d+)$")
	public void validoQueORetornoFoi(int arg1) throws Throwable {
		response.then()
		.statusCode(arg1)
		;
	}

	@Então("^retornou mensagens de obrigatoriedade$")
	public void retornouMensagensDeObrogatoriedade() throws Throwable {
		response.then()
		.body("$", hasSize(8))
		.body("msg", hasItems(
				"Data da Movimentação é obrigatório",
				"Data do pagamento é obrigatório",
				"Descrição é obrigatório",
				"Interessado é obrigatório",
				"Valor é obrigatório",
				"Valor deve ser um número",
				"Conta é obrigatório",
				"Situação é obrigatório"
				))
	;
	}
	
	@Dado("^que vou inserir uma nova movimentação com data futura$")
	public void naoDeveInserirMovimentacaoDataMovimentacaoFutura() {
		Movimentacao mov = getMovimentacaoValida();//Chama o m�todo que seta os valores dos campos a serem passados na chamada
		mov.setData_transacao(utils.DateUtils.getDataDiferencaDias(2));//Chama o m�todo para setar e formatar data (Data atual) adicionando 2 dias
		
		request = given()
				.body(mov)
				;
	}
	
	@Então("^valido a mensagem de erro referente a data futura$")
	public void validoAMensagemDeErroReferenteADataFutura() throws Throwable {
		response.then()		
		.body("$", hasSize(1))
		.body("msg", hasItem("Data da Movimentação deve ser menor ou igual à data atual"))
	;
	}
	
	
	@Dado("^que vou remover uma conta que tenha movimentação$")
	public void naoDeveRemoverContaComMovimentacao() {
				
		request = given()
				.pathParam("id", BarrigaUtils.getIdContaPeloNome("Conta com movimentacao"))
				;
	}
	
	
	@Quando("^eu fizer um delete na API de contas$")
	public void euFizerUmDeleteNaAPIDeContas() throws Throwable {
		response = request.when()
				.delete("/contas/{id}")
				;
	}

	@Então("^valido que a conta não pode ser removida$")
	public void validoQueAContaNãoPodeSerRemovida() throws Throwable {
		response.then()
		.body("constraint", is("transacoes_conta_id_foreign"))
	;
	}
	
	@Dado("^que vou remover uma movimentação$")
	public void deveRemoverMovimentacao() {
				
		request = given()
				.pathParam("id", BarrigaUtils.getIdMovPelaDescricao("Movimentacao para exclusao"))
				;
	}
	
	@Quando("^eu fizer um delete na API de transações$")
	public void euFizerUmDeleteNaAPIDeTransações() throws Throwable {
		response = request.when()
		.delete("/transacoes/{id}")
		;
	}
	
	private Movimentacao getMovimentacaoValida() { //Metodo para setar os valores dos campos a serem passados na chamada
		Movimentacao mov = new Movimentacao(); //Instanciando a classe Movimenta��o
		mov.setConta_id(BarrigaUtils.getIdContaPeloNome("Conta para movimentacoes"));
		mov.setDescricao("Descrição da movimentação");
		mov.setEnvolvido("Envolvido da movimentação");
		mov.setTipo("REC");
		mov.setData_transacao(DateUtils.getDataDiferencaDias(-1));
		mov.setData_pagamento(DateUtils.getDataDiferencaDias(5));
		mov.setValor(100f);
		mov.setStatus(true);
		return mov;
	}
}
