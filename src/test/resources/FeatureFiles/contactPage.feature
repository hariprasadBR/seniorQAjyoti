Feature: Test Contact Page Functionality

  Scenario: test Login Functionality
     Given user is on login page on "chrome" browser
    When user enter valid username as "prafulp1010@gmail.com" and password as "Pr@ful0812"
    Then click on login button

  Scenario: Test Home Page Functionality
    When user is home page and validate home page title
    And user validate home page url
    And user validate home page logo

  Scenario: The contact Page Functionality
    Given user is on home page then user click on contact page link
    When click on create button
    And enter the first name and middle name and lastname
      | Akshay | abc | More |
    And user click on save button
    Then user delete the user
