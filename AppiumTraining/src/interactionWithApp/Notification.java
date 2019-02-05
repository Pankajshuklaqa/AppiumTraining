package interactionWithApp;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import setup.Driver;

public class Notification {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test Case: Navigate to Incoming Message Notification (App -> Notification -> IncomingMessage), send and verify notifcation
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Click
		driver.findElement(By.id("App")).click();
		driver.findElement(By.id("Notification")).click();
		driver.findElement(By.id("IncomingMessage")).click();
		System.out.println("2. Navigated to Incoming Message");
		
		driver.findElement(By.id("Show App Notification")).click();
		System.out.println("3. Sent Notification");
		
		//Learning - Open Notification Window
		driver.openNotifications();
		System.out.println("4. Opened Notification window");
		
		//Learning - Verify Notification
		Thread.sleep(5000);
		boolean isNotificationDisplayed = driver.findElement(By.xpath("//android.widget.TextView[@text='Joe']")).isDisplayed();
		System.out.println("5. Is notification displayed: "+isNotificationDisplayed);

		//Learning - Close Notification Window
		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("6. Closed Notification window");
		
	}

}
