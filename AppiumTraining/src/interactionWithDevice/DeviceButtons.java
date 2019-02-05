package interactionWithDevice;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import setup.Driver;

public class DeviceButtons {

	public static void main(String[] args) throws MalformedURLException {
		//Test Case: Press device buttons - Home, Back, Volume Up, Volume Down, Power
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Click
		driver.findElement(By.id("App")).click();
		driver.findElement(By.id("Activity")).click();
		driver.findElement(By.id("Forwarding")).click();
		System.out.println("2. Navigated to Forwarding");
		
		//Learning - Click on Button
		driver.findElement(By.id("Go")).click();
		
		//Learning - Click on Back Button
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("3. Clicked Back Button");
		
		//Learning - Click on Home Button
		driver.pressKeyCode(AndroidKeyCode.HOME);
		System.out.println("4. Clicked Home Button");
		
		//Learning - Click on Volume Up Button
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		System.out.println("5. Clicked Volume Up Button");
		
		//Learning - Click on Volume Down Button
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		System.out.println("6. Clicked Volume Down Button");
		
		//Learning - Click on Power Button
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_POWER);
		System.out.println("7. Clicked Power Button");
	}

}
