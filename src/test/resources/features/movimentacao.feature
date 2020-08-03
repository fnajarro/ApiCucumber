# language: pt
@Movimentacao
Funcionalidade: Movimentação de contas

  Cenário: Inserir movimentação com sucesso
    Dado que vou inserir uma nova movimentação
    Quando eu fizer um post na API de movimentações
    Então valido que o retorno foi 201 e a movimentação foi inserida com sucesso
    
  Cenário: Validar campos obrigatórios
    Dado que vou inserir uma nova movimentação com todos os campos em branco
    Quando eu fizer um post na API de movimentações
    Então valido que o retorno foi 400
    E retornou mensagens de obrigatoriedade
    
  Cenário: Inserir movimentação com data futura
    Dado que vou inserir uma nova movimentação com data futura
    Quando eu fizer um post na API de movimentações
    Então valido que o retorno foi 500
    E valido a mensagem de erro referente a data futura
    
  Cenário: Remover conta com movimentação
    Dado que vou remover uma conta que tenha movimentação
    Quando eu fizer um delete na API de contas
    Então valido que o retorno foi 500
    E valido que a conta não pode ser removida
    
  Cenário: Remover movimentação com sucesso
    Dado que vou remover uma movimentação
    Quando eu fizer um delete na API de transações
    Então valido que o retorno foi 204