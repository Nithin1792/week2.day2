package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		1	Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
//		2	Enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
//		3	Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		4	Click Login
		driver.findElement(By.className("decorativeSubmit")).click();
//		5	Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
//		6	Click Leads link
		driver.findElement(By.linkText("Leads")).click();
//		7	Click Find leads
		WebElement findLead = driver.findElement(By.linkText("Find Leads"));
		findLead.click();
//		8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
//		9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("6380105335");
//		10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
//		11	Capture lead ID of First Resulting lead
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//WebElement firstID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		//String leadNum = firstID.getText();
		//System.out.println("The first lead id is: " + leadNum);
//		12	Click First Resulting lead
		//firstID.click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
//		13	Click Delete
		driver.findElement(By.linkText("Delete")).click();
//		14	Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//findLead.click();
//		15	Enter captured lead ID
		driver.findElement(By.name("id")).sendKeys(leadID);
//		16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		WebElement noRecords = driver.findElement(By.xpath("//div[contains(text(),'records')]"));
		System.out.println("message on search of lead: " + noRecords.getText());
//		18	Close the browser (Do not log out)
		System.out.println("Current title" + driver.getTitle());
		driver.close();
	}

}
