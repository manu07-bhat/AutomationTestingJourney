package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framesTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		// Frames
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("draggable")).click();

		// Actions
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(source, target).build().perform();

		driver.switchTo().defaultContent();
	}

}
