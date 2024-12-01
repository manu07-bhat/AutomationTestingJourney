import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();

		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
//		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.className("picker-second")).getAttribute("style"));

		if (driver.findElement(By.className("picker-second")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
