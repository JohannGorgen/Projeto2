Feature: Compra de um produto (fluxo completo)

  Scenario: Pesquisa de produto
    When eu pesquiso o <produto>
    Then eu devo ver o produto no resultado da pesquisa
    
    Examples:
    |  produto   |
    |  Blouse    |
    
  Scenario: Adi��o de produto no carrinho  
    When seleciono o produto desejado
    And adiciono o produto no carrinho
    Then o mesmo deve estar no carrinho
  
  Scenario: Cadastro de usu�rio  
    When eu sigo para o cadastro de usuario
    And eu preencho o formulario
    Then eu devo ver o endereco cadastrado anteriormente
    
  Scenario: Finaliza��o da compra    
    When aceito os termos
    And valido o valor da compra
    Then termino a compra

  