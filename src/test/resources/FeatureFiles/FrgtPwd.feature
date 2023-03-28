@ForgotPwd
Feature: 
  To validate forgotten password functionality in fb app

  @reg
  Scenario: 
    To validate forgotten password using invalid mobile number

    Given User have to enter Fb Login Page
    * User have to click forgotten password button
    * User have to enter invalid mobile number
      | 9876543210 | 222001 | greens@gmail.com | abc123 | java | python |
    * User have to click search button
    * User have to be in error page
