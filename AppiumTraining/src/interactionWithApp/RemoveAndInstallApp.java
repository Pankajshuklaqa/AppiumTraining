package interactionWithApp;
import java.io.File;
import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import setup.Driver;

public class RemoveAndInstallApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test Case: uninstall app and re-install.
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		
		//Learning - Uninstall App
		driver.removeApp("io.appium.android.apis");
		System.out.println("2. Uninstalled App");
		
		
		//Learning - Install App
		File sourceFolderPath = new File("src");
		File apkPath = new File(sourceFolderPath,"ApiDemos-debug.apk");
		driver.installApp(apkPath.getAbsolutePath().toString());
		System.out.println("3. Installed App");
		
	}

}
