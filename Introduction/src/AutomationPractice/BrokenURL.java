package AutomationPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenURL {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> Links = driver.findElements(By.cssSelector(" li[class='gf-li'] a"));

		SoftAssert sf = new SoftAssert();

		for (WebElement link : Links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);

			sf.assertTrue(respCode < 400, "The link with text " + link.getText() + " is broken " + respCode);
//			if (respCode > 400) {
//
//				System.out.println("The link with text " + link.getText() + " is broken " + respCode);
//				Assert.assertTrue(false);
//			}
		}

		sf.assertAll();

		// a[href*='soapui']
//		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
//
//		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//		conn.setRequestMethod("HEAD");
//		conn.connect();
//		int respCode = conn.getResponseCode();
//		System.out.println(respCode);

	}

}
