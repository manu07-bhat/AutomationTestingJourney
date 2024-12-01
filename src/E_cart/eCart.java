package E_cart;

import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class eCart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebDriverWait w =new WebDriverWait(driver,5); //old version supprot and now it's depricated
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5)); // newer version support

		String[] vegies = { "Cucumber", "Brocolli", "Beetroot", "Walnuts" };

		addItem(driver, vegies);
		driver.findElement(By.xpath("//a[@class ='cart-icon']/img")).click();
		//// button[contains(text(),'PROCEED TO CHECKOUT')]
		driver.findElement(By.cssSelector("div[class='action-block'] button[type='button']")).click();
		// Explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.className("promoBtn")).click();
		// Explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());

	}

	public static void addItem(WebDriver driver, String[] vegies) throws InterruptedException {

		int count = 0;

		System.out.println(vegies.length); // vegies count
		Thread.sleep(3000);
		List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < product.size(); i++) {

			String[] name = product.get(i).getText().split("-");
			String formatlist = name[0].trim();

			// convert array to ararylist
			List item = Arrays.asList(vegies);

			if (item.contains(formatlist)) {
				count++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (count == vegies.length)
					break;

			}
		}

	}
}
