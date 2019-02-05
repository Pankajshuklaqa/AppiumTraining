package interactionWithElements;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import setup.Driver;

public class Text {

	public static void main(String[] args) throws MalformedURLException {
		//Test Case: Navigate to Hello World (App -> Activity -> Hello World) and verify Hello World Text
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Click
		driver.findElement(By.id("App")).click();
		driver.findElement(By.id("Activity")).click();
		driver.findElement(By.id("Hello World")).click();
		System.out.println("2. Navigated to Hello World");
		
		//Learning - getText
		String actualHelloWorld = driver.findElement(By.id("io.appium.android.apis:id/text")).getText();
		String expectedHelloWorldText = "Hello, World!";
		
		if (expectedHelloWorldText.equalsIgnoreCase(actualHelloWorld)) {
			System.out.println("3. Test Case Passed - "+expectedHelloWorldText+" text is found !");
		} else {
			System.out.println("3. Test Case Failed - "+expectedHelloWorldText+" text is not found !");
		}
		
	}

}
