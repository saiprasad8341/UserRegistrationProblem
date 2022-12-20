package test.java;
import main.java.com.bridgelabz.UserRegistrationProblem;
import org.junit.Assert;
import org.junit.Test;

public class TestCase {
    UserRegistrationProblem userRegistration = new UserRegistrationProblem();
    @Test
    public void FirstNameTest(){
        Assert.assertEquals(true, userRegistration.verifyFirstName("Sai"));
    }
    @Test
    public void LastNameTest(){
        Assert.assertEquals(true, userRegistration.verifyLastName("Prasad"));
    }
    @Test
    public void PhoneNumTest(){
        Assert.assertEquals(true, userRegistration.verifyPhoneNumber("+919494003301"));
    }
    @Test
    public void PasswordTest(){
        Assert.assertEquals(true, userRegistration.verifyPassword("A1+abcdefgh"));
    }
}
