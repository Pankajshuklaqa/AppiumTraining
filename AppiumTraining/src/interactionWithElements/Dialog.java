package interactionWithElements;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import setup.Driver;

public class Dialog {

	public static void main(String[] args) throws MalformedURLException {
		//Test Case: Open dialog (App -> Activity -> Dialog) and then 
		//1. Print dialog title text and message
		//2. Click on its Add & Remove buttons
		//3. Close Dialog
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Click
		driver.findElement(By.id("App")).click();
		driver.findElement(By.id("Activity")).click();
		driver.findElement(By.id("Dialog")).click();
		System.out.println("2. Open Dialog");
		
		//Learning - Handling Dialog
		String dialogTitle = driver.findElement(By.id("android:id/title")).getText();
		System.out.println("3. Print Dialog title - "+dialogTitle);
		
		String dialogMessage = driver.findElement(By.id("io.appium.android.apis:id/text")).getText();
		System.out.println("4. Print Dialog Message - "+dialogMessage);
		
		driver.findElement(By.id("Add content")).click();
		System.out.println("5. Click on Add button");
		
		driver.findElement(By.id("Remove content")).click();
		System.out.println("5. Click on Remove button");
		
		//Learning - Click at coordinate
		driver.tap(1, 100, 100, 1000);
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("6. Close dialog");
		
	}
}
