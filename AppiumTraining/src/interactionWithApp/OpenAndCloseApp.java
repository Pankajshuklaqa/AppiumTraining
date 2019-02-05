package interactionWithApp;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import setup.Driver;

public class OpenAndCloseApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test Case: Close App and Launch App.
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Close App
		driver.closeApp();
		System.out.println("2. Closed App");
		
		//Learning - Open App
		driver.launchApp();
		System.out.println("3. Open App");
		
	}

}
