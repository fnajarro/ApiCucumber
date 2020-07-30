# language: pt

Funcionalidade: Teste

  Cenário: Validar busca por cep
    Dado que faço um get na API de consulta de cep
    Quando Retornar o código 200
    Então valido o nome da rua corretamente