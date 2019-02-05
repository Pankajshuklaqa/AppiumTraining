package interactionWithDevice;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import setup.Driver;

public class LockAndUnlockDevice {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test Case: Lock device and then unlock device, check device is locked/unlocked
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Lock Device
		driver.lockDevice();
		System.out.println("2. Locked Device");
		
		//Learning - Is Device Lock
		Boolean isLocked = driver.isLocked();
		System.out.println("3. Is device locked ? : "+isLocked);
		
		
		//Learning - Unlock Device
		driver.unlockDevice();
		System.out.println("4. Unlocked Device");
				
		//Learning - Is Device Lock
		isLocked = driver.isLocked();
		System.out.println("5. Is device locked ? : "+isLocked);
		
	}

}
