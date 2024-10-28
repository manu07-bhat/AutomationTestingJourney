package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// give me count link of the page.

		System.out.println(driver.findElements(By.tagName("a")).size());

		System.out.println(driver.findElement(By.id("gf-BIG")).findElements(By.tagName("a")).size()); // limiting web
																										// driver scope

		WebElement fotter = driver.findElement(By.id("gf-BIG"));
		System.out.println(fotter.findElements(By.tagName("a")).size());

		System.out.println(fotter.findElement(By.tagName("ul")).findElements(By.tagName("a")).size());

		// click on each links and test if opening are not.

		for (int i = 0; i < fotter.findElement(By.tagName("ul")).findElements(By.tagName("a")).size(); i++) {

			String clickTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			fotter.findElement(By.tagName("ul")).findElements(By.tagName("a")).get(i).sendKeys(clickTab);

//			driver.navigate().back();

		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}

}
