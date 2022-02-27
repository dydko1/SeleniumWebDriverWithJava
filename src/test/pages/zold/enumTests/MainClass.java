package test.pages.zold.enumTests;

public class MainClass {
    public static void main(String[] args) {
        /*
        for (Fields field : Fields.values()) {
            System.out.println(field.name() + " is under " + field.getGroup().name());
        }
         */
        Fields field = Fields.USER_PHONE;
        // System.out.println(field);
        // System.out.println(field.getGroup());

        Group selectGroup = Fields.USER_STREET.getGroup();
        TestGroup t = new TestGroup();
        t.checkGroup(selectGroup);
    }
}