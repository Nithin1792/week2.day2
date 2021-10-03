package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leafground.com/pages/Dropdown.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


//Advanced Xpath using Paretn to child:
WebElement dropDown = driver.findElement(By.xpath("//div[@class='example']/select"));

Select drop1 = new Select(dropDown);
drop1.selectByIndex(1);
//System.out.println(dropDown.getAttribute("drop1.selectByIndex(1)"));

WebElement dropDown2 = driver.findElement(By.xpath("(//section[@class='innerblock']//select)[2]"));
Select drop2 = new Select(dropDown2);
drop2.selectByVisibleText("UFT/QTP");

WebElement dropDown3 = driver.findElement(By.xpath("//div[@class='example'][3]/select"));
	Select drop3 = new Select(dropDown3);
	drop3.selectByValue("4");
	
	WebElement dropDown4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
Select drop4= new Select(dropDown4);

List<WebElement> options = drop4.getOptions();
System.out.println(options.size());


//
//List<WebElement> findElements = driver.findElements(By.xpath("//select[@class='dropdown']"));
//Select dro = new Select(findElements);
//System.out.println("Size of list:"+findElements.size());


WebElement droDown5 = driver.findElement(By.xpath("(//div[@class='example'])[5]/select"));
//droDown5.click();
droDown5.sendKeys("Appium");
	
	
	WebElement dropDown5 = driver.findElement(By.xpath("//div[@class='example'][last()]/select"));
	Select drop5 = new Select(dropDown5);
	drop5.selectByVisibleText("UFT/QTP");
	}
	
	

}
