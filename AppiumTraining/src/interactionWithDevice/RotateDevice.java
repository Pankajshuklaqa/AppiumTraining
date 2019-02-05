package interactionWithDevice;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import setup.Driver;

public class RotateDevice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test Case: Get device orientation, change orientation portrait to landscape and landscape to portrait
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Know orientation of device
		ScreenOrientation orientation = driver.getOrientation();
		System.out.println("2. Get Orientation : "+orientation.name());
		
		//Learning - Change orientation of device to Landscape
		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		System.out.println("3. Set orientation to landscape");
		orientation = driver.getOrientation();
		System.out.println("4. Get Orientation : "+ orientation.name());
		
		//Learning - Change orientation of device to Landscape
		driver.rotate(ScreenOrientation.PORTRAIT);
		System.out.println("5. Set orientation to portrait");
		orientation = driver.getOrientation();
		System.out.println("6. Get Orientation : "+ orientation.name());
	}

}
