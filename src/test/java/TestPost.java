import model.UserResponseModel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPost {
    StepUser stepUser = new StepUser();
    UserResponseModel model;

    @Test
    public void firstTest(){
        model = stepUser.createUser("morpheus", "leader");
        Assert.assertEquals(model.getName(),"morpheus");
        Assert.assertEquals(model.getJob(),"leader");

    }
}
