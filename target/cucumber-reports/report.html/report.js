$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/IntigralValidation.feature");
formatter.feature({
  "name": "Validating the Intigral API response by using GET http request",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify if given given Intigral API response has all parameters by using GET method",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the Intigral endpoint url with the apikey webB2BGDMSTGExy0sVDlZMzNDdUyZ",
  "keyword": "Given "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_Intigral_endpoint_url_with_the_apikey(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user calls the \"getIntigralAPI\" with GET http request",
  "keyword": "When "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_user_calls_the_with_GET_http_request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got the status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_API_call_got_success_with_status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API response schema should be in expected format",
  "keyword": "And "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_API_response_schema_should_be_in_expected_format()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the Intigral api request with invalid api key",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the Intigral endpoint url with the apikey webB2BGDMSTGExy0sVDlZMzNhdUAA",
  "keyword": "Given "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_Intigral_endpoint_url_with_the_apikey(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user calls the \"getIntigralAPI\" with GET http request",
  "keyword": "When "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_user_calls_the_with_GET_http_request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got the status code 403",
  "keyword": "Then "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_API_call_got_success_with_status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"message\" in response body is \"invalid api key\"",
  "keyword": "And "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"code\" in response body is \"8001\"",
  "keyword": "And "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the requestId parameter should not be null",
  "keyword": "And "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.check_the_parameter_should_not_be_null(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the assertion for the Intigral response parameters",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the Intigral endpoint url with the apikey webB2BGDMSTGExy0sVDlZMzNDdUyZ",
  "keyword": "Given "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_Intigral_endpoint_url_with_the_apikey(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user calls the \"getIntigralAPI\" with GET http request",
  "keyword": "When "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_user_calls_the_with_GET_http_request(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got the status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_API_call_got_success_with_status_code(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the \"promotionId\" parameter values under promotions array in the response",
  "keyword": "And "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_user_should_see_the_parameter_values_under_promotions_array_in_the_response(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should see the \"promoType\" parameter values under promotions array in the response",
  "keyword": "And "
});
formatter.match({
  "location": "IntigralValidationStepDefinition.the_user_should_see_the_parameter_values_under_promotions_array_in_the_response(String)"
});
formatter.result({
  "status": "passed"
});
});