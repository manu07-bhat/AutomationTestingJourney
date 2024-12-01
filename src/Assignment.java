import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		//Alerts
		String name = "jack";
		driver.findElement(By.name("enter-name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();
	}

}
