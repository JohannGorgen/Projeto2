Feature: Teste para comprar um item em um site

  Scenario: Compra de produto em um site
    Given que eu pesquise um <item> no campo e busca
    And verifique a quantidade de registros da pesqusa
    And seleciono o item desejado
    When adiciono o item no carrinho
    Then o mesmo deve estar no carrinho
    And sigo para o cadastro
    And preencho o formulario
    And valido o endereco
    And aceitos os termos e valido o valor da compra
    Then termino a compra

    Examples:
    |  item  |
    | Blouse |