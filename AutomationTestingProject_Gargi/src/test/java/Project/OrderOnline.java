package Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderOnline 
{
	WebDriver driver;
	
	public OrderOnline(WebDriver driver) 
	{
		this.driver = driver;
	}

	//================TC022 - Order online button===================	
	public void orderonline() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"online-banner\"]/div/a/button")).click();
		Thread.sleep(1500);
	}
	
//================TC023 - Locate me Button===================	
	public void deliver_locate_me() throws Exception
	{	
		WebElement location = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div[3]/input"));
		location.sendKeys("Nagpur");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div[3]/div/button/span")).click();
		Thread.sleep(1500);
	}
}
