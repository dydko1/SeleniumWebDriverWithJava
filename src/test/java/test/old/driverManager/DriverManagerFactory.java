package test.java.test.old.driverManager;

public class DriverManagerFactory {
    public static DriverManager getManager(DriverType type) {
        DriverManager driverManager;

        switch (type) {
            case SAFARI:
                driverManager = new SafariDriverManager();
                break;
            case IE:
                driverManager = new IEDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;
    }
}
