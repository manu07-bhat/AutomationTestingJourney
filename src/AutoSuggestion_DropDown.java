import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestion_DropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:/program-docs/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.name("ctl00$mainContent$chk_friendsandfamily")).click();
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(true);

//		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
//		Assert.assertFalse(true);

		System.out.println();

		// count the numbers of checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		// driver.findElements(By.xpath("//a[@id= 'ui-id-166']"));

		for (WebElement opt : options) {

			if (opt.getText().equalsIgnoreCase("india"))

			{
				System.out.println(opt.getText());
				opt.click();
				Thread.sleep(3000);
				break;
			}
		}

	}

}
