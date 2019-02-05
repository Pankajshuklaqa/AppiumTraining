package smapp;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Driver {

	public static AndroidDriver<MobileElement> getAndroidDriver() throws MalformedURLException {
		//Appium code
		/*File sourceFolderPath = new File("src");
		System.out.println("src path: "+sourceFolderPath.toString());
		File apkPath = new File(sourceFolderPath,"ApiDemos-debug.apk");
		System.out.println("apk path: "+apkPath.toString());*/
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//Server
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.1");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "600000");
		//Device
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
	    capabilities.setCapability(MobileCapabilityType.UDID, "FA6970306436");
	    //App
	    //capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/Faraz.Ahmad/Desktop/ApiDemos-debug.apk"); //install app
	    capabilities.setCapability("appPackage", "com.surveymonkey");
	    capabilities.setCapability("appActivity", "com.surveymonkey.login.activities.LandingActivity");
	    
	    //driver
	    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		return driver;
	}
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		driver.findElement(By.id("com.surveymonkey:id/sign_in_button")).click();
	}

}
