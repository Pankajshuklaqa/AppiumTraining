package interactionWithElements;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import setup.Driver;

public class TextBox {

	public static void main(String[] args) throws MalformedURLException {
		//Test Case: Navigate to Custom Title (App -> Activity -> Custom Title) and Enter Text
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Click
		driver.findElement(By.id("App")).click();
		driver.findElement(By.id("Activity")).click();
		driver.findElement(By.id("Custom Title")).click();
		System.out.println("2. Navigated to Custom Title");
		
		//Learning - Clear Text & Enter Text
		driver.findElement(By.id("io.appium.android.apis:id/left_text_edit")).clear();
		driver.findElement(By.id("io.appium.android.apis:id/left_text_edit")).sendKeys("Left Title");
		driver.findElement(By.id("Change Left")).click();
		System.out.println("3. Set Left Title");
		
		driver.findElement(By.id("io.appium.android.apis:id/right_text_edit")).clear();
		driver.findElement(By.id("io.appium.android.apis:id/right_text_edit")).sendKeys("Right Title");
		driver.findElement(By.id("Change Right")).click();
		System.out.println("4. Set Right Title");
		
		//Learning - HideKeyboard
		driver.hideKeyboard();
		System.out.println("5. Hide Keyboard");
	}
}
