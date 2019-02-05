package gestures;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import setup.Driver;

public class Swipe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test Case: Navigate to Views , perform vertical swipe - 1. Bottom to Top and 2. Bottom to top.
		//Test Case: Navigate to Views -> Gallery -> Photos > , perform Horizontal swipe - 1. Right to Left and 2. Left to Right
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		WebElement views = driver.findElement(By.id("Views"));
		views.click();
		Thread.sleep(3000);
		
		//Learning - Swipe
		int startx = 500;
		int starty = 1500;
		int endx = 500;
		int endy = 300;
		int duration = 1000;
		driver.swipe(startx, starty, endx, endy, duration);
		driver.swipe(startx, starty, endx, endy, duration);
		driver.swipe(startx, starty, endx, endy, duration);
		System.out.println("2. Peformed swipe");
	}
}
