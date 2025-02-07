Feature: All http methods implimentation using Serialization and Deserialization

  Scenario: First create the data using POST method
    Given Configure base URI
    And User create the object of RequestSpecification Interface
    And User create the hearder with content Type
    And User create the request body for the POST Request using Serialization and Deserialization
    And User add http request body to http POST Request
    When User selects the http POST request
    Then User get the status code
    Then User get the status line
    Then user get the reponse Time
    Then user get the response body
    Then user get the response header
    Then User capture ID from the response

  
