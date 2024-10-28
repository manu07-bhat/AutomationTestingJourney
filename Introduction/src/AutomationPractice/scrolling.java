package AutomationPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000"); // scrollTop - scrollLeft

		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead  td:nth-child(4)"));
		// .table-display td:nth-child(3)
		int total = 0;
		for (int i = 0; i < values.size(); i++) {

//			System.out.println(Integer.parseInt(values.get(i).getText()));

			total = total + Integer.parseInt(values.get(i).getText());
		}
		System.out.println(total);

		driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		String value = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(":")[1].trim();
		int textVlaue = Integer.parseInt(value);

//		System.out.println(main(total, textVlaue));

		Assert.assertEquals(total, textVlaue);

	}

	public static boolean main(int total, int textVlaue) {
		if (total == textVlaue) {
			return true;

		}
		return false;
	}
}
