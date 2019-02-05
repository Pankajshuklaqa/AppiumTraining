package interactionWithElements;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import setup.Driver;

public class CheckBoxAndRadioButtons {

	public static void main(String[] args) throws MalformedURLException {
		//Test Case: Navigate to Custom Title (Views -> Controls) , select theme, check check boxes and select radio buttons
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Click
		driver.findElement(By.id("Views")).click();
		driver.findElement(By.id("Controls")).click();
		driver.findElement(By.id("1. Light Theme")).click();
		System.out.println("2. Navigated to Controls");
		
		//Learning - Check check box
		driver.findElement(By.id("Checkbox 1")).click();
		driver.findElement(By.id("Checkbox 2")).click();
		System.out.println("3. Checked check boxes");
		
		//Learning - select radio button
		driver.findElement(By.id("RadioButton 1")).click();
		driver.findElement(By.id("RadioButton 2")).click();
		System.out.println("4. Selected Radio Buttons");
	}
}
