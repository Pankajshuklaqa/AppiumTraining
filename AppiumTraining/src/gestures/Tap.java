package gestures;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import setup.Driver;

public class Tap {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test Case: Open App and Tap on Views
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		WebElement views = driver.findElement(By.id("Views"));
		
		//Learning - Tap
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(views).perform();
		System.out.println("2. Peformed tap");
	}
}
