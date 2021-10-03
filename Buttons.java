package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement home = driver.findElement(By.id("home"));
		home.click();

		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();


		
		Thread.sleep(5000);
		WebElement attribute = driver.findElement(By.xpath("//button[text()='Go to Home Page']"));
		System.out.println("Attribute: "+ attribute.getAttribute("onclick"));
		
		
		WebElement position = driver.findElement(By.xpath("//button[@id='position']"));
		System.out.println("The X axis of button: " + position.getLocation().getX());
		System.out.println("The Y axis of button: " + position.getLocation().getY());
		System.out.println("The position of button: " + position.getLocation());
		//System.out.println("type of position: " + position.getClass().getName());

		WebElement color = driver.findElement(By.xpath("//button[text()='What color am I?']"));
		System.out.println("Color of the button: " + color.getCssValue("color"));
		

WebElement size = driver.findElement(By.xpath("//button[text()='What is my size?']"));

System.out.println("The height of the button: " + size.getSize().getHeight());
System.out.println("The width of the button: "+size.getSize().getWidth());
System.out.println("Size of the button: "+ size.getSize());


	}

}
