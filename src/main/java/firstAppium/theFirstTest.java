package firstAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class theFirstTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
//		desiredCapabilities.setCapability("platformVersion", "9.0");
		desiredCapabilities.setCapability("udid", "FA7A31A08884");
		desiredCapabilities.setCapability("deviceName", "Pixel2");
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
		
		//	If application is already installed and just needs launching without reinstalling:		
//		desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
//		desiredCapabilities.setCapability("appActivity", ".ApiDemos");

		desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
		desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		// 	### setting avd to launch automatically
//		desiredCapabilities.setCapability("avd", "Pixel_2_And9");
		
		// un/commented app key if the app need to be reinstalled or not
//		desiredCapabilities.setCapability("app", "/Users/ionel/automation/dummy/ApiDemos-debug.apk");

		//	### added throw exception in case of errors
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		//	### Changed IOSDriver to AppiumDriver and resp. AndroidDriver
		//	### AndroidDriver could be used for both but then it would be specific to Android platforkm
		//	### Using AppiumDriver so that the framework supports both Android and iOS
		AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
		String sessionId = driver.getSessionId().toString();
		
		MobileElement seven = (MobileElement) driver.findElementById("digit_7");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		MobileElement four = (MobileElement) driver.findElementById("digit_4");
		MobileElement add = (MobileElement) driver.findElementById("op_add");
		
		MobileElement equal = (MobileElement) driver.findElementById("eq");
		// Ex of using WebElemet class to find the equals sign
//		WebElement equal = driver.findElementById("eq");
		
//		MobileElement result = (MobileElement) driver.findElementById("result_final");
//		Ex of using By class to find the result text field
		By result = By.id("result_final");
		
		Thread.sleep(2000);
		seven.click();
		add.click();
		four.click();
		equal.click();
		String actualResult = driver.findElement(result).getText();
		System.out.println("actual value is " + actualResult);
	}

}




























