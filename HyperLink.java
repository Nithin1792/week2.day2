package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Go to home page

		driver.findElement(By.linkText("Go to Home Page")).click();

		driver.findElement(By.xpath("//img[@alt='Link']")).click();

		// find where I am to go without clicking me

		WebElement attriValue = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String attri = attriValue.getAttribute("href");
		System.out.println("It will get navigated to this link: " + attri);
		attriValue.click();
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		if (attri.equalsIgnoreCase(currentUrl)) {
			System.out.println("Output URL is same as input");
		}
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();

		String broken = driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href");
		if (broken.contains("error.html")) {
			System.out.println("Error 404");
		}
		driver.findElement(By.linkText("Go to Home Page")).click();
		System.out.println("Current Page: " + currentUrl);

		driver.navigate().back();
		System.out.println("********final**********: " + currentUrl);

//How to find all the links in this page 
		List<WebElement> tagName = driver.findElements(By.tagName("a"));
		System.out.println("No. of Links: " + tagName.size());

	}

}
