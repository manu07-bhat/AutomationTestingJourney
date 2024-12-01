import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings_parent_traversal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:/program-docs/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// siblings - Child to Parent traverse

		//// header/div/button[1]/following-sibling::button[1] //parent -child and child
		//// to child traversal
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();

		// Child to parent and child to grand parent
		String s = driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a[2]")).getText();
		System.out.println(s);
	}

}
