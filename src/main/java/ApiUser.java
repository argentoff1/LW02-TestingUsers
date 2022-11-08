import io.restassured.http.ContentType;
import model.UserResponseModel;
import model.UserRequestModel;

import static io.restassured.RestAssured.given;

public class ApiUser {
    public UserResponseModel createUser(UserRequestModel model){
        return
            given()
                    .baseUri("https://reqres.in/")
                    .contentType(ContentType.JSON)
                    .body(model)
                    .post("/api/users")
                    .then()
                    .statusCode(201)
                    .log().all()
                    .extract().response().as(UserResponseModel.class);
    }

}
