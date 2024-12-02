package StreamsConcepts;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class greenCart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//		driver.findElement(By.xpath("//th[@role='columnheader']")).click();

		// Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// Capture all webelement into lists.
		List<WebElement> ElementList = driver.findElements(By.xpath("//tr/td[1]"));

		// Capture all the webElement into newList

		List<String> orginalList = ElementList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// Sort the orginal List

		List<String> sortedList = orginalList.stream().sorted().collect(Collectors.toList());

		// Compare two list

		Assert.assertTrue(orginalList.equals(sortedList));

	}

}
