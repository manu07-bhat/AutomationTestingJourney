package E_cart;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calanderTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String monthNumber = "6";
		String date = "5";
		String year = "2027";
		String[] expList = { monthNumber, date, year };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		
		//Calander Testing
		driver.findElement(By.xpath("//button[@class ='react-date-picker__calendar-button react-date-picker__button']"))
				.click();
		driver.findElement(By.xpath("//button[@class ='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[@class ='react-calendar__navigation__label']")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__tile")).get(Integer.parseInt(monthNumber) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();

		System.out.println(driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).getText());

		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for (int i = 0; i < actualList.size(); i++) {
			System.out.println(actualList.get(i).getAttribute("value"));
			Assert.assertEquals(actualList.get(i).getAttribute("value"), expList[i]);
		}
		driver.close();
	}

}
