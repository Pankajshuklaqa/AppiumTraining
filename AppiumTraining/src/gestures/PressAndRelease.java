package gestures;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import setup.Driver;

public class PressAndRelease {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test Case: Navigate to Custom Title (Views -> Expandable Lists > Custom Adapter ) , long press to People Names and verify Sample Menu and Sample Action menu items
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		driver.findElement(By.id("Views")).click();
		driver.findElement(By.id("Expandable Lists")).click();
		driver.findElement(By.id("1. Custom Adapter")).click();
		System.out.println("2. Navigated to Custom Adapter");
		
		//Learning - Press & Release Press
		TouchAction touchAction = new TouchAction(driver);
		WebElement peopleNames = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		//touchAction.press(peopleNames).waitAction(3000).release().perform();
		touchAction.longPress(peopleNames).release().perform();
		System.out.println("4. Press & Relase");
		
	}
}
