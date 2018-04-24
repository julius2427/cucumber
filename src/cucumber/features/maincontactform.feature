#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#Feature: Cintas Contact Form
#  Background:
#    Given We are on cintas homepage in "stagingus"
#    When open the contact form
#    And enter required fields with exception to address
#      | InputFirstName  | RealartFirst          |
#      | InputLastName   | RealartLast           |
#      | InputPhone      | "123456789"           |
#      | InputPostalCode | "45324"               |
#      | InputEmail      | realarttest@gmail.com |
#      | InputComments   | This is a realarttest |
#      | InputCompany    | RealartTest           |
#  @contactform
#  Scenario: Submit Contact Form Invalid Address
#    And Enter Invalid Address "Invalid Address RATest" and Zip "44444"
#    And Submit Contact Form
#    Then Smarty Street Validation should not find address
#    And Submit Original Address
#    Then Successful submission
Feature: Cintas Contact Form
	@production_contact_form @production_smoke
  Scenario: Error Message shows properly
    Given We are in "productionus" on homepage
    When open the contact form
    And Submit Contact Form
    Then receive error message

  @production_contact_form @production_smoke
  Scenario Outline: Contact Form Submission for US CA and FR <environment>
    Given We are in "<environment>" on homepage
    When open the contact form
    And enter required fields with exception to address
      | InputFirstName  | RealartFirst          |
      | InputLastName   | RealartLast           |
      | InputPhone      |            1234567890 |
      | InputPostalCode |                 45324 |
      | InputEmail      | realarttest@gmail.com |
      | InputComments   | This is a realarttest |
      | InputCompany    | RealartTest           |
    And Enter Address "<address>" and Zip "<zip>"
    And Submit Contact Form
    Then SmartyStreet Validation "<addressfound>"
    Then Submit Original Address
    Then Successful submission

		
    Examples: 
      | environment | address                     | zip   | addressfound      |
      | productionus   | 6800 Cintas Blvd, Mason, OH | 45040 | valid_address     |
      | productionca   | Invalid Address RATest      | 44444 | invalid_address   |
      | productioncafr | Invalid Address RATest      | 44444 | invalid_addressfr |
 
 
   @stage_contact_form @staging_smoke
  Scenario Outline: Contact Form Submission for US CA and FR <environment>
    Given We are in "<environment>" on homepage
    When open the contact form
    And enter required fields with exception to address
      | InputFirstName  | RealartFirst          |
      | InputLastName   | RealartLast           |
      | InputPhone      |            1234567890 |
      | InputPostalCode |                 45324 |
      | InputEmail      | realarttest@gmail.com |
      | InputComments   | This is a realarttest |
      | InputCompany    | RealartTest           |
    And Enter Address "<address>" and Zip "<zip>"
    And Submit Contact Form
    Then SmartyStreet Validation "<addressfound>"
    Then Submit Original Address
    Then Successful submission

		
    Examples: 
      | environment | address                     | zip   | addressfound      |
      | stagingus   | 6800 Cintas Blvd, Mason, OH | 45040 | valid_address     |
      | stagingca   | Invalid Address RATest      | 44444 | invalid_address   |
      | stagingcafr | Invalid Address RATest      | 44444 | invalid_addressfr |
 
  ## @contactform
 # Scenario: Submit Contact Form Valid Address
 #   And Enter Valid Address "6800 Cintas Blvd, Mason, OH" and Zip "45040"
 #   And Submit Contact Form
 #   Then Successful submission
