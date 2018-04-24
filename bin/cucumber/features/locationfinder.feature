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
Feature: Location Finder
  I want to use this template for my feature file

  @locationfinder @qa_env @production_env @smoketest
  Scenario Outline: Verify Location Finder Displays Properly
    Given We are on cintas homepage in "<Environment>"
    When you navigate to location finder
    Then verified "<Location>" Location Finder Shows Properly.

  #	@locationfinder @smoketest
  #Scenario Outline: Verify Location Finder Displays Properly
  #  Given We are on cintas homepage in "stagingca"
  #  When you navigate to location finder
  #  Then verified "CA" Location Finder Shows Properly.
  @locationfinder @qa_env @production_env @smoketest
  Scenario Outline: Verify Location Finder Displays Properly
    Given We are on cintas homepage in "<Environment>"
    When you navigate to location finder
    And search using "<Search>"
    Then Locations Found "<Result>"

    #	@locationfinder @smoketest
    #  Scenario Outline: Verify Location Finder Displays Properly
    #   Given We are on cintas homepage in "stagingus"
    #  When you navigate to location finder
    # And search using "45324"
    # And Show Proper Locations Found
    # Then close browser
    @qa_env
    Examples: 
      | Environment | Location | Result | Search         |
      | productionus   | US       | true   |          45324 |
      | productionca   | CA       | true   |          45324 |
      | productionus   | US       | false  | Invalid Search |
      | productionca   | CA       | false  | Invalid Search |

    @production
    Examples: 
      | Environment | Location | Result | Search         |
      | productionus   | US       | true   |          45324 |
      | productionca   | CA       | true   |          45324 |
      | productionus   | US       | false  | Invalid Search |
      | productionca   | CA       | false  | Invalid Search |
      