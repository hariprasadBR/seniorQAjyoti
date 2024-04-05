Feature: Test Deals Page Functionality

  Scenario: test Login Functionality
     Given user is on login page on "edge" browser
    When user enter valid username as "prafulp1010@gmail.com" and password as "Pr@ful0812"
    Then click on login button

  Scenario: Test Home Page Functionality
    When user is home page and validate home page title
    And user validate home page url
    And user validate home page logo

  Scenario: Test the Deals Page Functionality
    Given user is on home page and user click on deals page
    When user click on create button
    And user enter title and enter description
    And click on save button
    Then user delete the created deals
