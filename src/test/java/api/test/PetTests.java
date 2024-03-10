package api.test;


import api.endpoints.PetEndPoints;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import api.payload.Pet;
import org.testng.annotations.Test;

//All the testcases
public class PetTests {

    //Create random data
    Faker faker;
    Pet petPayload;

    @BeforeClass
    public void setupData()
    {
        faker = new Faker();
        petPayload = new Pet();

        //generate ID
        petPayload.setPetID(faker.idNumber().hashCode());
        petPayload.setPetname(faker.name().username());
        //petpayload.setPetStatus(faker..());
    }

    @Test(priority = 1)
    public void addANewPet()
    {
        Response response = PetEndPoints.addPet(petPayload);
        //validation
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test(priority = 2)
    public void updatePetByName()
    {
        //update data using payload - name generate again
        petPayload.setPetname(faker.name().username());

        Response response = PetEndPoints.updatePet(this.petPayload.getPetname(),petPayload);
        response.then().log().body();
        //response.then().log().body().statusCode(200); ---rest assured assert

        //Verify the status code
        Assert.assertEquals(response.getStatusCode(),200);

        //Verify the data is updated
        /*Response responseAfterUpdate = PetEndPoints.
        Assert.assertEquals(response.getStatusCode(),200);*/

    }


    @Test(priority = 3)
    public void petFindByStatus()
    {
        Response response = PetEndPoints.findPet(this.petPayload.getPetStatus());
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(),200);
    }



}
