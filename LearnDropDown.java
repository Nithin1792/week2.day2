package week2.day2;



import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// implicitly wait: will be called for all the find element/(s):
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// Step1
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		// Step2:	
		Select drop= new Select(dropDown1);
		drop.selectByIndex(1);
		
		// Step3:
		// Byvisible text:
		// drop.selectByVisibleText("Appium");

		// By index:
		//drop.selectByIndex(1);
		// By Value:
		//drop.selectByValue("4");
	
	WebElement drop1 = driver.findElement(By.name("dropdown2"));
	Select drop2 =new Select(drop1);
	drop2.selectByVisibleText("UFT/QTP");
	
	WebElement drop4 = driver.findElement(By.id("dropdown3"));
	Select drop3 = new Select(drop4);
	drop3.selectByValue("4");
	
	
	}

	
}
