package first.utilities;

import first.pojo.Room1Post;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static first.utilities.Authentication2.generateToken;
import static io.restassured.RestAssured.given;

public class API3Utils {

    public static Response postRequest(String endpoint, Room1Post data){
        Response response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(data).contentType(ContentType.JSON).when().post(endpoint);
return response;
    }

}
