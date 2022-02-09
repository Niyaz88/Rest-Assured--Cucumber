Feature: Validating the Intigral API response by using GET http request

  Scenario: Verify if given given Intigral API response has all parameters by using GET method
    Given the Intigral endpoint url with the apikey webB2BGDMSTGExy0sVDlZMzNDdUyZ
    When the user calls the "getIntigralAPI" with GET http request
    Then the API call got the status code 200
    And the API response schema should be in expected format

  Scenario: Verify the Intigral api request with invalid api key
    Given the Intigral endpoint url with the apikey webB2BGDMSTGExy0sVDlZMzNhdUAA
    When the user calls the "getIntigralAPI" with GET http request
    Then the API call got the status code 403
    And "message" in response body is "invalid api key"
    And "code" in response body is "8001"
    And check the requestId parameter should not be null

  Scenario: Verify the assertion for the Intigral response parameters
    Given the Intigral endpoint url with the apikey webB2BGDMSTGExy0sVDlZMzNDdUyZ
    When the user calls the "getIntigralAPI" with GET http request
    Then the API call got the status code 200
    And the user should see the "promotionId" parameter values under promotions array in the response
    And the user should see the "promoType" parameter values under promotions array in the response
