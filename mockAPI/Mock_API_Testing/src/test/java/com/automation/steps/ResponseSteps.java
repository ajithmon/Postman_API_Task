package com.automation.steps;

import com.automation.pojo.CreateRequestPojo;
import com.automation.pojo.CreateResponsePojo;
import com.automation.utils.ConfigReader;
import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;

import java.util.Optional;

public class ResponseSteps {
    @Then("verify status code is {int}")
    public void verify_status_code_is(int statusCode) {

        Assert.assertEquals(statusCode, RestAssuredUtils.getStatusCode());
    }


    @And("verify response body has a field {string} is {string}")
    public void verify_response_body_has_a_field_is(String jsonPath, String value) {
        Assert.assertEquals(value, RestAssuredUtils.getResponseFieldValue(jsonPath));

    }

}
