#language:en

@test
Feature: Checkout Cart

  Scenario: Add a product to cart
    Given that the user accesses the website home
    And click the search button
    And search for the item "Tênis"
    And find the item of your choice
    When he clicks buy on the item of his choice
    And choose the size
    And click "Comprar" again
    And click "Finalizar Compra"
    Then he visualizes the "Tênis" he has chosen in the "Meu Carrinho" section
