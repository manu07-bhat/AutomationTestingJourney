import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:/program-docs/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String name = "Manu";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();

		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("manu@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("7894561230");
		driver.findElement(By.xpath("//button[contains(text(),'Reset Login')]")).click();
		Thread.sleep(1000);

		System.out.println(driver
				.findElement(By.xpath(
						"//p[contains(text(),\"Please use temporary password 'rahulshettyacademy' to Login.\")]"))
				.getText());

		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(1000);

		driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys(name);
		driver.findElement(By.xpath("//form/input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
		driver.findElement(By.className("signInBtn")).click();

		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[@class='login-container']")).getText());
		driver.findElement(By.className("logout-btn")).click();

		driver.close();

	}

}
