package miro;

import org.testng.annotations.Test;

public class TestCase03 {
    @Test(groups = {"smokeTest", "functionalTest"})
    public void loginTest() {
        System.out.println("Logged in successfully");
    }
}