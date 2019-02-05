package interactionWithApp;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import setup.Driver;

public class RunAppInBackground {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test Case: Run App in background for 5 second.
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Run app in background
		System.out.println("2. Running app in background for 5 second");
		driver.runAppInBackground(5);
		System.out.println("3. App is come back in forground ");
		
	}

}
