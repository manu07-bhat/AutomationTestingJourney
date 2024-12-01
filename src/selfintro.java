import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selfintro {

	public static void main(String args[]) {
		// Driver downloaded from locally to run
		// Invoking browser | selenium manager automatically doe's above line
		// chrome

		System.setProperty("webdriver.chrome.driver",
				"D:/program-docs/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// firefox | geckodriver driver

//		System.setProperty("webdriver.geckodriver.driver", "D:/program-docs/geckodriver-v0.35.0-win-aarch64/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();

		// Edge | msedgedriver
//		System.setProperty("webdriver.edge.driver", "D:/program-docs/edgedriver_win64/msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close(); // only current url
		driver.quit(); // closes all the chrome tabls assciated with url

	}
}
