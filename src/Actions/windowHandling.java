package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.className("blinkingText")).click();

		
		//must read
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parenttId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		 
		driver.findElement(By.cssSelector(".im-para.red")).getText();

		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

		driver.switchTo().window(parenttId);

		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
