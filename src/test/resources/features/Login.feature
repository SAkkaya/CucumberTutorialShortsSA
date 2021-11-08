@wip   @smoke_test
Feature: Login
  As a user, I want to be able to lgin with username and password

  Background:
    Given user is on the login page
@scenario_1
  Scenario: Login as store manager
    When user logs in with "storemanager85" and "UserUser123" credentials
    Then user should be able to see Dashboard page title
  @scenario_2 @wip
  Scenario: Login as sales manager
    When user logs in with "salesmanager110" and "UserUser123" credentials
    Then user should be able to see Dashboard page title
  @scenario_3
  Scenario: Login as driver
    When user logs in with "user15" and "UserUser123" credentials
    Then user should be able to see Dashboard page title

  @scenario_outline
    Scenario Outline: Login under different credentials as <username>
      When user enters "<username>" and "<password>"
      Then user should be able to see Dashboard page title

      Examples:
        | username        | password    |
        | user10          | UserUser123 |
        | user15          | UserUser123 |
        | user22          | UserUser123 |
        | user3           | UserUser123 |
        | user110         | UserUser123 |
        | storemanager85  | UserUser123 |
        | storemanager120 | UserUser123 |
        | storemanager110 | UserUser123 |


