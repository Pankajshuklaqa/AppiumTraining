package iOS;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class LaunchiOSApp {
	public static IOSDriver<MobileElement> getiOSDriver() throws MalformedURLException {
		//Appium code
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//Server
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.1");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "600000");
		//Device
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest"); //new
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS"); //change
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0.2");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone6Plus");
	    capabilities.setCapability(MobileCapabilityType.UDID, "c0e4d32a353371f80f5c0a47f2236dbc0678638c");
	    //App
	    //capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/Faraz.Ahmad/Desktop/ApiDemos-debug.apk"); //install app
	    //capabilities.setCapability("appPackage", "com.surveymonkey");
	    //capabilities.setCapability("appActivity", "com.surveymonkey.login.activities.LandingActivity");
	    capabilities.setCapability("bundleId", "com.surveymonkey.SurveyMonkeyBeta");
	    
	    //driver - Change
	    IOSDriver<MobileElement> driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		return driver;
	}
	
	public static void main(String[] args) throws MalformedURLException {
		IOSDriver<MobileElement> driver = LaunchiOSApp.getiOSDriver();
		System.out.println("1. Launched App");
		driver.findElement(By.id("com.surveymonkey:id/sign_in_button")).click();
	}
}
