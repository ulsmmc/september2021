package homeWork;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class homework4video {
WebDriver driver;

	@Before
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/ ");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void testFios() {
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("demo@techfios.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@class='btn btn-success block full-width']")).click();
		driver.findElement(By.xpath("//span[text()='Bank & Cash']")).click();
		driver.findElement(By.xpath("//a[text()='New Account']")).click();
		driver.findElement(By.xpath("//input[@class='form-control' and @id='account']")).sendKeys("asdas2d123123");
		driver.findElement(By.xpath("//input[@type='text' and @class='form-control' and @name='description']")).sendKeys("tra2yubane");
		driver.findElement(By.xpath("//input[@class='form-control amount']")).sendKeys("2500");
		driver.findElement(By.xpath("//input[@name='account_number']")).sendKeys("abvsad123");
		driver.findElement(By.xpath("//input[@name='contact_person' and @id='contact_person']")).sendKeys("abd3ullahcanmn");
		driver.findElement(By.xpath("//input[@name='contact_phone']")).sendKeys("54542226546546");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		
	}

}
