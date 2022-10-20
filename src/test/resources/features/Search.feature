#language:en
@test
Feature: Product search

  Scenario Outline: search
    Given that the user accesses the website home
    And click the search button
    When he fill:
      | name_item | <name_item> |
    And submit your survey
    Then it sees:
      | related_results | <related_results> |

    Examples:
      | name_item | related_results |
      | calça     | calça           |
      | Jaqueta   | jaqueta         |
      | Camisa    | camisa          |
