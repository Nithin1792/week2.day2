package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Avoiding using Xpath for the below as it may change in future in stead go for text base Xpath
//driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
driver.findElement(By.name("firstname")).sendKeys("Nithin");
driver.findElement(By.name("lastname")).sendKeys("Thomas");
driver.findElement(By.name("reg_email__")).sendKeys("nithincap@yahoo.com");
driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nithincap@yahoo.com");
driver.findElement(By.id("password_step_input")).sendKeys("Nithin@17");
WebElement dropDown1 = driver.findElement(By.id("day"));
Select drop = new Select(dropDown1);
drop.selectByIndex(17);

WebElement drop1 = driver.findElement(By.id("month"));
Select drop2 = new Select(drop1);
drop2.selectByValue("9");

WebElement drop3 = driver.findElement(By.name("birthday_year"));
	Select drop4 = new Select(drop3);
	drop4.selectByValue("1992");
	
	driver.findElement(By.xpath("//input[@value='2']")).click();
	}

}
