package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Coupon 
{
	WebDriver driver;
	
	public Coupon(WebDriver driver)
	{
		this.driver = driver;
	}

//===========TC37 - Select Coupon==========
	public void selectcoupon() throws Exception
	{
		//Click on coupon
		driver.findElement(By.xpath("//*[@id=\"offers-item0\"]")).click();
		Thread.sleep(1500);
		
		//click on select location
		driver.findElement(By.xpath("//*[@id=\"landscape-mode\"]/div[2]/div/a")).click();
		Thread.sleep(1500);
		
		//Click on enter locatlity
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[2]/div[1]/div/div[3]/input")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div/div[1]/input")).sendKeys("Nagpur");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div/div[1]/div/div[3]/div/div[1]/div[2]/div[1]/div[2]/button/span")).click();
		Thread.sleep(1500);
	}
	
//===========TC38 - Bestsellers option and add to cart==========
	public void bestsellers() throws Exception
	{
		//Select best pizza
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[2]/div/div[5]/div/div/div[2]/div[3]/div/button/span")).click();
		Thread.sleep(1500);
		
		//Handle with pop up
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[2]/div/div[1]/div/div/div[2]/div[3]/div[1]/button/span")).click();
		Thread.sleep(1500);
	}
	
//===========TC39 - Checkout and home page==========
	public void bestsellerscheckout() throws Exception
	{
		//Click on Checkout button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(1500);
			
		//Go to homepage
		driver.navigate().to("https://www.dominos.co.in/");
		Thread.sleep(1500);
	}

	
}
