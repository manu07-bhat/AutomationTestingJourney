import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		// Practice
		// chrome Driver
		System.setProperty("webdriver.chrome.driver",
				"D:/program-docs/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Timeout Globaly || ImplicitlyWait is for to show result or data in the
		// Webpage.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Locators
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("manoj");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyaacademy");
		driver.findElement(By.className("signInBtn")).click();

		// error message display
		System.out.println(driver.findElement(By.className("error")).getText());
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		// linktext
		driver.findElement(By.linkText("Forgot your password?")).click();
		// Thread.sleep is to wait for few second before the next step to get executed.
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("manu");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("manu@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7894561230");

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());

		// Login page
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("manoj");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(
				driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText());

		// logout
		Thread.sleep(1000);
		driver.findElement(By.className("logout-btn")).click();

		driver.findElement(By.id("visitUsTwo")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
