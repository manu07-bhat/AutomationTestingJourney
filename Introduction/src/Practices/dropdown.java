package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D:/program-docs/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select drop = new Select(staticdropdown);
		drop.selectByIndex(3);
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByValue("INR");
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByVisibleText("AED");
		System.out.println(drop.getFirstSelectedOption().getText());
	}

}
