Feature: Test the Cases Page in Cogmento CRM

  Scenario: test Login Functionality
    Given user is on login page on "incognito" browser
    When user enter valid username as "prafulp1010@gmail.com" and password as "Pr@ful0812"
    Then click on login button

  Scenario: Test Home Page Functionality
    When user is home page and validate home page title
    And user validate home page url
    And user validate home page logo

  Scenario Outline: Validate Cases Page Functionality
    When user is on case page and validate case page title
    And user click on create button case page
    And user enter "<title>" and "<Description>" in casepage
    And user click on save button on case page
    And user delete the create cases in case page

    Examples: 
      | title                 | Description                                      |
      | Ui Automation         | UI Automation using Selenium                     |
      | API Automation        | API Automation using Rest Assured                |
      | DB Automation         | DB Automation using JDBC                         |
      | Backend Development   | Backend Development using Spring Boot Framework  |
      | Front end Development | Front end Development using Boot Strap Framework |
