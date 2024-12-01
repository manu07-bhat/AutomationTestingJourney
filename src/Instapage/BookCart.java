package Instapage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookCart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		
		//Testing on new website
		driver.get("https://bookcart.azurewebsites.net/");

		driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[5]")).click();

		driver.findElement(By.xpath("(//span[@class='mat-mdc-button-touch-target'])[2]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[@class='mdc-button__label'])[5]")).click();
	}

}
