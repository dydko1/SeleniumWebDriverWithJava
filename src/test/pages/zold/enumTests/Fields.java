package test.pages.zold.enumTests;

public enum Fields {
    // basic
    USER_NAME(Group.USER_BASIC),
    USER_SURNAME(Group.USER_BASIC),
    USER_EMAIL(Group.USER_BASIC),
    USER_PHONE(Group.USER_BASIC),

    // address
    USER_STREET(Group.USER_ADDRESS),
    USER_ZIP(Group.USER_ADDRESS),
    USER_COUNTRY(Group.USER_ADDRESS),

    // settings
    USER_NEWS(Group.USER_SETTINGS),
    USER_PRODUCT(Group.USER_SETTINGS);

    private final Group group;

    private Fields(Group group) {
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }
}
