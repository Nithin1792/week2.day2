package week2.day2;

import java.time.Duration;


import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();

driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");
driver.findElement(By.xpath("//input[contains(@id,'word')]")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@value='Login']")).click();
driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	}

}
