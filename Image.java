package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.navigate().back();

		// How to find a broken image?/

		WebElement brokenImage = driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[2]/img "));

		String attrBrokenImage = brokenImage.getAttribute("src");
		System.out.println("URL of Broken Image: " + attrBrokenImage);

		driver.get("http://leafground.com/images/abcd.jpg");

		driver.navigate().back();
		String url = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"))
				.getAttribute("src");

		driver.get(url);
		System.out.println("Current title" + driver.getTitle());
		if (driver.getTitle().contains("Not Found")) {
			System.out.println("Image is broken");

			driver.navigate().back();
			driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();

		}

	}
}