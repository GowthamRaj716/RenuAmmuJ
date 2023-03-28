@login
Feature: 
  To validate login functionality in Fb

  Background: 
    Given User have to enter Fb Login Page
    And User have to maximize the screen

  @smoke @sanity
  Scenario: 
    To validate login using valid email and invalid password

    When User have to enter valid email and invalid password
      | java1234       | selenium | 9876543210 |
      | java@gmail.com | testing  | 8765432111 |
      | python         | oracle   | manual     |
      | Collection     | Gr1234   | 8908908900 |
    And User have to click login button
    Then User have to be in password incorrect page

  @smoke
  Scenario: 
    To validate login using invalid email and invalid password

    When User have to enter invalid email and invalid password
      | email    | greens@gmail.com |
      | password | Greens@123       |
      | Username | Greenstech       |
      | Phno     |       9876543210 |
    And User have to click login button
    Then User have to be in password incorrect page

  @sanity @reg
  Scenario: 
    To validate login using invalid email and valid password

    When User have to enter invalid email and valid password
      | username | password  | phoneno    |
      | Anu      | anu123    | 9876543210 |
      | Banu     | banu98765 | 7877878988 |
      | sam      | sam092    | 6789056788 |
    And User have to click login button
    Then User have to be in password incorrect page
