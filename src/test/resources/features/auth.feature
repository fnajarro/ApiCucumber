# language: pt
@ignore
Funcionalidade: Autenticação
	
  Cenário: Não deve acessar a API sem token
    Dado que faço um get na API sem passar o token
    Então valido que o código de retorno é 401