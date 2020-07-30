# language: pt
@Saldo
Funcionalidade: Relatorio de contas

  Cenário: Calcular saldo das contas
    Dado que vou calcular o saldo das contas
    Quando eu fizer um get na API de saldos
    Então valido que o cód de retorno foi 200
    E valido o saldo atual da conta