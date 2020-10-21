package firstAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class theFirstTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "9.0");
		desiredCapabilities.setCapability("deviceName", "Pixel2Simulator");
		desiredCapabilities.setCapability("automationName", "UiAutomator2");
		
		//	If application is already installed and just needs launching without reinstalling:		
		desiredCapabilities.setCapability("appPackage", "io.appium.android.apis");
		desiredCapabilities.setCapability("appActivity", ".ApiDemos");
		
		// 	### setting avd to launch automatically
		desiredCapabilities.setCapability("avd", "Pixel_2_And9");
		
		// commented app key since the app does not need to be reinstalled
//		desiredCapabilities.setCapability("app", "/Users/ionel/automation/dummy/ApiDemos-debug.apk");

		//	### added throw exception in case of errors
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		//	### Changed IOSDriver to AppiumDriver and resp. AndroidDriver
		//	### AndroidDriver could be used for both but then it would be specific to Android platforkm
		//	### Using AppiumDriver so that the framework supports both Android and iOS
		AppiumDriver driver = new AndroidDriver(url, desiredCapabilities);
		String sessionId = driver.getSessionId().toString();


	}

}
