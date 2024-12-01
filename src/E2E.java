import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
		if (driver.findElement(By.className("picker-second")).getAttribute("style").contains("0.5")) {
			System.out.println("Disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for (int i = 0; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.id("hrefIncChd")).click();

		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();

		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//option[@value='USD']")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.println("TEST PASSED");
	}

}
