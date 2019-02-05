package setup;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApp {

	public static void main(String[] args) throws MalformedURLException {
		//Appium code
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//Server
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.7.1");
		//Device
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.0.0");
	    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
	    capabilities.setCapability(MobileCapabilityType.UDID, "FA6970306436");
	    
	    //App
	    capabilities.setCapability("appPackage", "io.appium.android.apis");
	    capabilities.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	    
	    //driver
	    AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
		
	}

}
