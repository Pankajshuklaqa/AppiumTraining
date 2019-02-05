package gestures;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import setup.Driver;

public class DragAndDrop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Test Case: Navigate to Custom Title (Views -> Date Widgets -> Dialog -> Change Time), drag & drop hour hand
		
		AndroidDriver<MobileElement> driver = Driver.getAndroidDriver();
		System.out.println("1. Launched App");
		driver.findElement(By.id("Views")).click();
		driver.findElement(By.id("Date Widgets")).click();
		driver.findElement(By.id("1. Dialog")).click();
		driver.findElement(By.id("io.appium.android.apis:id/pickTime")).click();
		System.out.println("2. Navigated to Change Time");
		
		//Learning - Drag & Drop
		TouchAction touchAction = new TouchAction(driver);
		WebElement selectHour = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@selected='true']"));
		WebElement unselectHour = driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@selected='false']"));
		touchAction.press(selectHour).moveTo(unselectHour).release().perform();
		
		System.out.println("3. Drag & Drop");
	}
}
