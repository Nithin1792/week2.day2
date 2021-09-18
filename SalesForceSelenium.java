package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Nithin");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Thomas");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("nithin.thomas@testleaf.com");
		WebElement jobTitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select job = new Select(jobTitle);
		job.selectByVisibleText("IT Manager");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		WebElement employees = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select emp = new Select(employees);
		emp.selectByIndex(4);

		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("6380105332");
		WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		// country.clear();
		Select countryName = new Select(country);
		countryName.selectByVisibleText("Australia");

		WebElement countrystate = driver.findElement(By.name("CompanyState"));
		Select state = new Select(countrystate);
		state.selectByVisibleText("South Australia");
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();
	}

}
