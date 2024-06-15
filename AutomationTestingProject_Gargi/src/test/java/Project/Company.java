package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Company 
{
	WebDriver driver;
	
	public Company(WebDriver driver)
	{
		this.driver = driver;
	}
	
//============TC83 - Blog Option==============
	public void blog() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,2000)");
		
		driver.findElement(By.linkText("Blog")).click();
		Thread.sleep(1500);
		
		driver.navigate().back();
	}
	
//============TC84 - Investor Option==============
	public void investor() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,2000)");
			
		driver.findElement(By.linkText("Investor")).click();
		Thread.sleep(1500);
			
		driver.navigate().back();
	}
	
//============TC85 - Feedback Option==============
	public void feedback() throws Exception
	{
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js3.executeScript("window.scrollBy(0,2000)");
		
		driver.findElement(By.linkText("FeedBack")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/section[1]/div[1]/div[1]/section[2]/form[1]/section[1]/div[1]/div[1]/label[2]/input[1]")).click();
		Thread.sleep(1500);
																												
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Santoshi");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Lohar");
		Thread.sleep(1500);
		
		Select s = new Select(driver.findElement(By.xpath("//select[@id='city-list']")));
		s.selectByValue("KOHLAPUR");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@id='contact_no']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Santoshi@123");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input[@id='next']")).click();
		System.out.println("Feedback done successfully");
		Thread.sleep(1500);
		
		driver.get("https://www.dominos.co.in/");
		Thread.sleep(1500);
	}
	
//============TC86 - Ads Option==============
	public void ads() throws Exception
	{
		JavascriptExecutor js4 = (JavascriptExecutor)driver;
		js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js4.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1500);
		
		driver.findElement(By.linkText("Ads")).click();
		System.out.println("ADS page open successfully");
		Thread.sleep(1500);
		
		driver.get("https://www.dominos.co.in/");				
	}
}
