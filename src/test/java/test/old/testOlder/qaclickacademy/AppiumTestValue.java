package test.java.test.old.testOlder.qaclickacademy;

import org.testng.annotations.Test;

public class AppiumTestValue {
	@Test
	public void NativeAPpAndroid() {

		System.out.println("/nMiro 11 !!/n");
		String pomValue = System.getProperty("userName");
		String pomValue1 = System.getProperty("userSurname");
		String path = System.getProperty("user.dir");

		System.out.println("---------------\n" + pomValue + "\n" + pomValue1 + "\n---------------"
				+ "\n" + path +"\n");
		//  mvn test -Pmiro -DuserName="Imieeeee" -DuserSurname="Nazwiskooooooo"
	}

	@Test
	public void IOSApps() {
		System.out.println("/nMiro 22 !!/n");
	}
}
