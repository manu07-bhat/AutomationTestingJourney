import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calander {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//li/a[@value='BLR']")).click();
		Thread.sleep(1000); //64 1hr
		driver.findElement(By.xpath("(//li/a[@value='MAA'])[2]")).click();

		driver.findElement(By.cssSelector (".ui-state-default.ui-state-highlight")).click();

	}

}
