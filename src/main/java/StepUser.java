import model.UserResponseModel;
import model.UserRequestModel;

public class StepUser {
    ApiUser apiUser = new ApiUser();

    public UserResponseModel createUser(String name, String job){
        UserRequestModel model = new UserRequestModel(name, job);
        return apiUser.createUser(model);
    }
}
