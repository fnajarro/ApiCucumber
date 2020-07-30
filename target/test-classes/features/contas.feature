# language: pt
@Contas
Funcionalidade: Manutenção de contas

  Cenário: Incluir conta com sucesso
    Dado que vou incluir uma conta nova
    Quando eu fizer um post na API de contas
    Então valido que o retorno foi 201 e a conta foi inserida com sucesso
    
  Cenário: Alterar conta com sucesso
    Dado que vou alterar uma conta existente
    Quando eu fizer um put na API de contas
    Então valido que o retorno foi 200 e a conta foi alterada com sucesso
    
  Cenário: Incluir conta duplicada
    Dado que vou incluir uma conta já existente
    Quando eu fizer um post na API de contas
    Então valido que o retorno foi 400 e a conta não foi inserida por duplicidade