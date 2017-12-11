Feature: Try out a data table conversion

  Scenario: A data table scenario may only contain one step
    And the following day values
      | day | num | denom | kpi           |
      | mon | 1   | 1     | cancellations |
      | tue | 2   | 2     | cancellations |
      | wed | 3   | 151   | cancellations |

