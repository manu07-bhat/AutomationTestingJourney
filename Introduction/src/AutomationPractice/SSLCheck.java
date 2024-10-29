package AutomationPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {

		// ChromeOptions is used to bypass the SSL Certification | chromeOptions
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
//		FirefoxOptions fireOption = new FirefoxOptions();

		// Proxy in ChromeOptions
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		options.setCapability("proxy", proxy);

		// Block Pop-Ups
		ChromeOptions popup = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));

		// Default Directory
		ChromeOptions directory = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);

		// ---------------------------------
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());

		// chrome driver capabilities
		// https://developer.chrome.com/docs/chromedriver/capabilities
		/*
		 * can learnt from above link this are all 1 time use chrome driver capabilities
		 * most common 4 things SLL certification, proxy server, blocking pop-ups,
		 * default directory
		 */
	}

}
