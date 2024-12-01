import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {

		// chrome drivers
		System.setProperty("webdriver.chrome.driver",
				"D:/program-docs/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Wait Globally mechanism
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Locators
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyaacademy");
		driver.findElement(By.className("submit")).click();

//		System.err.println(driver.findElement(By.className("error")).getText());

		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		driver.quit();
	}

}
