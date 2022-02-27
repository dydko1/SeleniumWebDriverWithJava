package test.pages.zold.enumTests;

public class TestGroup {
    public TestGroup() {
    }

    public void checkGroup(Group selectGroup) {
        switch (selectGroup) {
            case USER_BASIC:
                System.out.println("basic");
                break;
            case USER_ADDRESS:
                System.out.println("address");
                break;
            case USER_SETTINGS:
                System.out.println("settings");
                break;
            default:
                System.out.println("default!!!!");
        }
    }
}
