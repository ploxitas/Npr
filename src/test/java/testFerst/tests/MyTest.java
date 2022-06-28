package testFerst.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testFerst.dev.DevClass;
import testFerst.dev.WrongLoginException;
import testFerst.dev.WrongPasswordException;

public class MyTest {
    private String validLogin = "qwert_123";
    private String invalidLogin ="qwert_123&^^%^";
    private String validPassword ="eeerrr";
    private String invalidPassword1="24646++";
    private String invalidPassword="4654654";
    @Test
    public void LoginTest() throws WrongPasswordException, WrongLoginException {
        boolean actual = DevClass.logIn(validLogin,validPassword,validPassword);
        Assert.assertTrue(actual,"actual is not true");
    }
    @Test
    public void firstTest() {
        String actual = DevClass.reverseWord("1234");
        Assert.assertEquals(actual, "4321", "revers word is not correct");
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void SecondTest() {
        String actual = DevClass.reverseWord(null);
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void OneSignTest() {
            String actual = DevClass.reverseWord("1");
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void PassTest() {
        String actual = DevClass.reverseWord(" ");
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void EmptyTest() {
        String actual = DevClass.reverseWord("");
    }
}