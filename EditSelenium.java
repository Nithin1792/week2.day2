package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("nithincap@yahoo.com");

		WebElement append = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		// append.clear();
		append.sendKeys("appended field");
		append.sendKeys(Keys.TAB);

		String fieldTxt = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println("The default text is: " + fieldTxt);

		WebElement clear = driver.findElement(By.xpath(("(//input[@name='username'])[2]")));
		System.out.println("The default value is : "+clear.getAttribute("value"));
		clear.clear();

		boolean fieldenable = driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		
		System.out.println("The field is editable or not: "+ fieldenable);
		
		
		System.out.println("The current URL is : " + driver.getCurrentUrl());
		
		driver.close();
	}

}
