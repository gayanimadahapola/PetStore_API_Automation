package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.Pet;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//Contains all the methods implementations - add, update
public class PetEndPoints {

    //Add a pet
    public static Response addPet(Pet payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)

                .when()
                .post(Routes.post_url);

        return response;
    }

    //Update pet
    public static Response updatePet(String petname, Pet payload){
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("petname", petname)
                .body(payload)

                .when()
                .put(Routes.update_url);

        return response;
    }

    //Find pet by status
    public static Response findPet(String petStatus){
        Response response = given()
                .pathParam("petStatus",petStatus)

                .when()
                .get(Routes.get_url);

        return response;
    }
}
