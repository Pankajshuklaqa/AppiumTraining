package browser;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchChrome {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test case: open toi mobile website, click on search icon, enter search string - 'test cricket' and hit enter
		//System.setProperty("webdriver.chrome.driver","/Users/pankajshukla/Documents/Appium/jars/chromedriver");
		
		//Appium code
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//Server
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.1");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "600000");
		//Device
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
	    capabilities.setCapability(MobileCapabilityType.UDID, "FA6970306436");
	    
	    //Browser
	    capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	    
	    //driver
	    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
	    //driver.get("https://m.timesofindia.com/");
	    //System.out.println("1. Opened TOI");
	    
	    driver.get("http://mobile.surveymonkey.com");
	    driver.findElement(By.id("username")).sendKeys("regularuser");
	    driver.findElement(By.id("password")).sendKeys("Mail_123");
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//button[@type='submit' and text()='LOG IN']/..")).click();
	    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit' and text()='LOG IN']"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", loginButton);
	    
	    System.out.println("clicked");
	    //TouchAction ta = new TouchAction(driver);
	    //ta.tap(driver.findElement(By.xpath("//button[@type='submit' and text()='LOG IN']"))).perform();
	    //driver.findElement(By.xpath("//button[@type='submit' and text()='LOG IN']")).click();;
	    //driver.pressKeyCode(AndroidKeyCode.BACKSPACE);
	   
	    
	    
	    
	    
	    
	    
	    
	    /* Locating Elements:
	     * 1. Launch Browser on mobile
	     * 2. Chrome Browser -> Menu -> More Tools -> Developer Tools
	     * 3. Bottom Menu -> Remote Devices -> Connected Devices
	     * 4. Enter URL
	     * 5. Click on Inspect.
	     * 6. Locate Elements same as Selenium
	     * */
	    
	   
	    
	    /*driver.findElement(By.id("searchBtnInput")).click();
	    System.out.println("2. Click on Search Box");
	    
	    driver.findElement(By.id("searchBox")).sendKeys("test cricket");
	    System.out.println("3. Enter query string - test cricket");
	    
	    driver.pressKeyCode(AndroidKeyCode.ENTER);
	    System.out.println("4. Press Enter");*/
	    
	    
	    
	    
	    
	 
	    
	    
	    
	    
	    /*driver.get("http://www.facebook.com");
	    System.out.println("1. Opened Facebook");
	    Thread.sleep(5000);
		driver.findElement(By.id("m_login_email")).sendKeys("abc@gmail.com");
		System.out.println("2. Entered Username");
		driver.findElement(By.id("m_login_password")).sendKeys("pass123");
		System.out.println("2. Entered Password");
		driver.findElement(By.name("login")).click();*/
	}

}
