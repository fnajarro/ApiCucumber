$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("contas.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Manutenção de contas",
  "description": "",
  "id": "manutenção-de-contas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Contas"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Incluir conta com sucesso",
  "description": "",
  "id": "manutenção-de-contas;incluir-conta-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 6,
  "name": "que vou incluir uma conta nova",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "eu fizer um post na API de contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "valido que o retorno foi 201 e a conta foi inserida com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "ContasTest.deveIncluirContaComSucesso()"
});
formatter.result({
  "duration": 60708900,
  "status": "passed"
});
formatter.match({
  "location": "ContasTest.euFizerUmPostNaAPIDeContas()"
});
formatter.result({
  "duration": 275916400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 25
    }
  ],
  "location": "ContasTest.validoQueORetornoFoiEAContaFoiInseridaComSucesso(int)"
});
formatter.result({
  "duration": 1533500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Alterar conta com sucesso",
  "description": "",
  "id": "manutenção-de-contas;alterar-conta-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 11,
  "name": "que vou alterar uma conta existente",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "eu fizer um put na API de contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "valido que o retorno foi 200 e a conta foi alterada com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "ContasTest.deveAlterarContaComSucesso()"
});
formatter.result({
  "duration": 1328289900,
  "status": "passed"
});
formatter.match({
  "location": "ContasTest.euFizerUmPutNaAPIDeContas()"
});
formatter.result({
  "duration": 565500800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 25
    }
  ],
  "location": "ContasTest.validoQueORetornoFoiEAContaFoiAlteradaComSucesso(int)"
});
formatter.result({
  "duration": 32718600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Incluir conta duplicada",
  "description": "",
  "id": "manutenção-de-contas;incluir-conta-duplicada",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 16,
  "name": "que vou incluir uma conta já existente",
  "keyword": "Dado "
});
formatter.step({
  "line": 17,
  "name": "eu fizer um post na API de contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 18,
  "name": "valido que o retorno foi 400 e a conta não foi inserida por duplicidade",
  "keyword": "Então "
});
formatter.match({
  "location": "ContasTest.naoDeveIncluirContaComNomeRepetido()"
});
formatter.result({
  "duration": 960700,
  "status": "passed"
});
formatter.match({
  "location": "ContasTest.euFizerUmPostNaAPIDeContas()"
});
formatter.result({
  "duration": 370240300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 25
    }
  ],
  "location": "ContasTest.validoQueORetornoFoiEAContaNãoFoiInseridaPorDuplicidade(int)"
});
formatter.result({
  "duration": 7574600,
  "status": "passed"
});
formatter.uri("movimentacao.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Movimentação de contas",
  "description": "",
  "id": "movimentação-de-contas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Movimentacao"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Inserir movimentação com sucesso",
  "description": "",
  "id": "movimentação-de-contas;inserir-movimentação-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 6,
  "name": "que vou inserir uma nova movimentação",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "eu fizer um post na API de movimentações",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "valido que o retorno foi 201 e a movimentação foi inserida com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "MovimentacaoTest.deveInserirMovimentacaoComSucesso()"
});
formatter.result({
  "duration": 288277900,
  "status": "passed"
});
formatter.match({
  "location": "MovimentacaoTest.euFizerUmPostNaAPIDeMovimentações()"
});
formatter.result({
  "duration": 282647300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "201",
      "offset": 25
    }
  ],
  "location": "MovimentacaoTest.validoQueORetornoFoiEAMovimentaçãoFoiInseridaComSucesso(int)"
});
formatter.result({
  "duration": 1315400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Validar campos obrigatórios",
  "description": "",
  "id": "movimentação-de-contas;validar-campos-obrigatórios",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 11,
  "name": "que vou inserir uma nova movimentação com todos os campos em branco",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "eu fizer um post na API de movimentações",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "valido que o retorno foi 400",
  "keyword": "Então "
});
formatter.step({
  "line": 14,
  "name": "retornou mensagens de obrigatoriedade",
  "keyword": "E "
});
formatter.match({
  "location": "MovimentacaoTest.deveValidarCamposObrigatoriosNaMovimentacao()"
});
formatter.result({
  "duration": 722400,
  "status": "passed"
});
formatter.match({
  "location": "MovimentacaoTest.euFizerUmPostNaAPIDeMovimentações()"
});
formatter.result({
  "duration": 272152400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 25
    }
  ],
  "location": "MovimentacaoTest.validoQueORetornoFoi(int)"
});
formatter.result({
  "duration": 408300,
  "status": "passed"
});
formatter.match({
  "location": "MovimentacaoTest.retornouMensagensDeObrogatoriedade()"
});
formatter.result({
  "duration": 13496100,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Inserir movimentação com data futura",
  "description": "",
  "id": "movimentação-de-contas;inserir-movimentação-com-data-futura",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 17,
  "name": "que vou inserir uma nova movimentação com data futura",
  "keyword": "Dado "
});
formatter.step({
  "line": 18,
  "name": "eu fizer um post na API de movimentações",
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "valido que o retorno foi 400",
  "keyword": "Então "
});
formatter.step({
  "line": 20,
  "name": "valido a mensagem de erro referente a data futura",
  "keyword": "E "
});
formatter.match({
  "location": "MovimentacaoTest.naoDeveInserirMovimentacaoDataMovimentacaoFutura()"
});
formatter.result({
  "duration": 301971600,
  "status": "passed"
});
formatter.match({
  "location": "MovimentacaoTest.euFizerUmPostNaAPIDeMovimentações()"
});
formatter.result({
  "duration": 343101600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "400",
      "offset": 25
    }
  ],
  "location": "MovimentacaoTest.validoQueORetornoFoi(int)"
});
formatter.result({
  "duration": 292200,
  "status": "passed"
});
formatter.match({
  "location": "MovimentacaoTest.validoAMensagemDeErroReferenteADataFutura()"
});
formatter.result({
  "duration": 8940500,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Remover conta com movimentação",
  "description": "",
  "id": "movimentação-de-contas;remover-conta-com-movimentação",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 23,
  "name": "que vou remover uma conta que tenha movimentação",
  "keyword": "Dado "
});
formatter.step({
  "line": 24,
  "name": "eu fizer um delete na API de contas",
  "keyword": "Quando "
});
formatter.step({
  "line": 25,
  "name": "valido que o retorno foi 500",
  "keyword": "Então "
});
formatter.step({
  "line": 26,
  "name": "valido que a conta não pode ser removida",
  "keyword": "E "
});
formatter.match({
  "location": "MovimentacaoTest.naoDeveRemoverContaComMovimentacao()"
});
formatter.result({
  "duration": 425385600,
  "status": "passed"
});
formatter.match({
  "location": "MovimentacaoTest.euFizerUmDeleteNaAPIDeContas()"
});
formatter.result({
  "duration": 299892100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 25
    }
  ],
  "location": "MovimentacaoTest.validoQueORetornoFoi(int)"
});
formatter.result({
  "duration": 416800,
  "status": "passed"
});
formatter.match({
  "location": "MovimentacaoTest.validoQueAContaNãoPodeSerRemovida()"
});
formatter.result({
  "duration": 7526200,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Remover movimentação com sucesso",
  "description": "",
  "id": "movimentação-de-contas;remover-movimentação-com-sucesso",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 29,
  "name": "que vou remover uma movimentação",
  "keyword": "Dado "
});
formatter.step({
  "line": 30,
  "name": "eu fizer um delete na API de transações",
  "keyword": "Quando "
});
formatter.step({
  "line": 31,
  "name": "valido que o retorno foi 204",
  "keyword": "Então "
});
formatter.match({
  "location": "MovimentacaoTest.deveRemoverMovimentacao()"
});
formatter.result({
  "duration": 282655100,
  "status": "passed"
});
formatter.match({
  "location": "MovimentacaoTest.euFizerUmDeleteNaAPIDeTransações()"
});
formatter.result({
  "duration": 296680300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "204",
      "offset": 25
    }
  ],
  "location": "MovimentacaoTest.validoQueORetornoFoi(int)"
});
formatter.result({
  "duration": 254400,
  "status": "passed"
});
formatter.uri("saldo.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Relatorio de contas",
  "description": "",
  "id": "relatorio-de-contas",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@Saldo"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Calcular saldo das contas",
  "description": "",
  "id": "relatorio-de-contas;calcular-saldo-das-contas",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 6,
  "name": "que vou calcular o saldo das contas",
  "keyword": "Dado "
});
formatter.step({
  "line": 7,
  "name": "eu fizer um get na API de saldos",
  "keyword": "Quando "
});
formatter.step({
  "line": 8,
  "name": "valido que o cód de retorno foi 200",
  "keyword": "Então "
});
formatter.step({
  "line": 9,
  "name": "valido o saldo atual da conta",
  "keyword": "E "
});
formatter.match({
  "location": "SaldoTest.deveCalcularSaldoContas()"
});
formatter.result({
  "duration": 1782200,
  "status": "passed"
});
formatter.match({
  "location": "SaldoTest.euFizerUmGetNaAPIDeSaldos()"
});
formatter.result({
  "duration": 304262700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 32
    }
  ],
  "location": "SaldoTest.validoQueOCódDeRetornoFoi(int)"
});
formatter.result({
  "duration": 244200,
  "status": "passed"
});
formatter.match({
  "location": "SaldoTest.validoOSaldoAtualDaConta()"
});
formatter.result({
  "duration": 313797200,
  "status": "passed"
});
});