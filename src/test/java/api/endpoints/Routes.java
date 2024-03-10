package api.endpoints;
// -----------maintain all the url's----------------------

/*Swagger URI : https://petstore.swagger.io/

Add a new pet (Post) : https://petstore.swagger.io/v2/pet
Create a pet (Post) : https://petstore.swagger.io/v2/pet
Store the ID : https://petstore.swagger.io/v2/pet/:petId
Update an existing pet (Put) : https://petstore.swagger.io/v2/pet
Find pet by status (Get) : https://petstore.swagger.io/v2/pet/findByStatus
Find pet by tag (Get) : https://petstore.swagger.io/v2/pet/findByTags?tags=ex&tags=adipisicing
*/

public class Routes {
    public static String base_url="https://petstore.swagger.io/v2";

    //Pet
    //public static String post_url="https://petstore.swagger.io/v2/pet";
    public static String post_url=base_url+"/pet";
    public static String get_url=base_url+"/pet/{petStatus}";
    public static String update_url=base_url+"/pet/{petname}";
}
