Feature: LoginPage Testcases for Adactin Site

  @sanity
  Scenario: Login with Valid Username & Valid Password
    Given Open the Browser
    And Launch the Adactin URL
    When User Enter the Username "Muthulakshmi07"
    And User Enter the Password "Viji@1703"
    And Click on Login button
    Then User logged in successfully

  @sanity
  Scenario Outline: Login with different combination of credentials
    Given Open the Browser
    And Launch the Adactin URL
    When User Enter the Username as "<username>"
    And User Enter the Password as "<password>"
    And Click on Login button
    Then User logged in successfully

    Examples: 
      | username | password   |
      | Ram      | ram123     |
      | Keerthi  | keerthi123 |
      | Priya    | priya123   |
