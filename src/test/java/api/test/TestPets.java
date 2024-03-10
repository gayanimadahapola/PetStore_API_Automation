package api.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestPets {

    @Test
    public void TC_AddNewPet()
    {
        // Define the base URL of the API
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        // Define the request body for adding a new pet
        String requestBody = "{ \"id\": 1, \"name\": \"Rex\", \"status\": \"available\" }";

        // Send a POST request to add a new pet
        Response response = RestAssured.given()
                .contentType("application/json")
                .body(requestBody)
                .post("/pet");

        // Verify the response status code is 200 (OK)
        Assert.assertEquals(200, response.getStatusCode());

        // Retrieve the response body
        String responseBody = response.getBody().asString();

        //Verify that the response body contains the details of the added pet
        Assert.assertEquals("{\"id\":1,\"name\":\"Rex\",\"status\":\"available\"}", responseBody);
    }


}
