Feature: Adactin login with different DataTables

  Scenario: Login with Valid Credentials
    Given Launch the browser with Adactin URL
    When User Enter the Username as List
      | Bharathy |
      | Rajesh   |
    When User Enter the Password as List
      | bharathy123 |
      | rajesh123   |
    And Click the Login button

  Scenario: Login with Valid Credentials as Lists
    Given Launch the browser with Adactin URL
    When User Enter the Username and password as Lists
      | Meena     | meena123     |
      | Kowsalya  | kowsi123     |
      | Srutheesh | srutheesh123 |
    And Click the Login button

  Scenario: Login with Valid Credentials as Map
    Given Launch the browser with Adactin URL
    When User Enter the Username as Map
      | username | Rajesh |
    When User Enter the Password as Map
      | password | rajesh123 |
    And Click the Login button

  Scenario: Login with Valid Credentials as Maps
    Given Launch the browser with Adactin URL
    When User Enter the Username password and mail as Maps
      | username | password   | mail                 |
      | Govind   | govind123  | govind123@gmail.com  |
      | Hema     | hema123    | hema123@gmail.com    |
      | Karthik  | karthik123 | karthik123@gmail.com |
    And Click the Login button
