package wait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import setup.Driver;

public class ImplicitWait {
	public static void main(String[] args) throws MalformedURLException {
		//Test Case: Navigate to Views-> Layout Animation -> Grid Fade, wait for Apk Info App to load.
		//Navigate to Animation -> View Flip 
		//Navigate to App -> Alarm 
		//Navigate to Text -> Linkify
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");	
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		System.out.println("2. Set implicit wait");
		
	
		//suppose text 15 sec
		WebElement text = driver.findElement(By.id("Text"));
		text.click();
		WebElement linkify = driver.findElement(By.id("Linkify"));
		linkify.click();
		System.out.println("2. Navigated to Linkify");
		
		WebElement exampleText = driver.findElement(By.id("io.appium.android.apis:id/text1"));
		exampleText.click();
		System.out.println("3. Open www.example.com");
		
		driver.findElement(By.xpath("//android.view.View[@text='Example Domain']"));
		System.out.println("4. Waited for www.example.com");
	}
	
	//

}
