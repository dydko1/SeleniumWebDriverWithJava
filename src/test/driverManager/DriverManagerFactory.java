package test.driverManager;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();

            default:
                System.out.println("Default driver");
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;

    }
}