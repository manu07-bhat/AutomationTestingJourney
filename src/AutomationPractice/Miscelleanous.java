package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// To delete the AllCookies
		driver.manage().deleteAllCookies();

		// To delete the particular Cookie
//		driver.manage().deleteCookieNamed("sss"); 

		driver.get("https://google.com");

	}

}
