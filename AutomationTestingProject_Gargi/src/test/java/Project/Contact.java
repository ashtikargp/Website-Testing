package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Contact 
{
	WebDriver driver;
	
	public Contact(WebDriver driver)
	{
		this.driver = driver;
	}
	
//============TC76 - Contact Option==============
	public void contactoption() throws Exception
	{
		//Click on contact option
		driver.findElement(By.partialLinkText("CONTACT")).click();
		Thread.sleep(1500);
	}
	
//============TC77 - Mail option==============
	public void mailoption() throws Exception
	{	
		//Hover on mail button
		WebElement mail = driver.findElement(By.xpath("//*[@id=\"content-box\"]/section/div[3]/ul/li[1]/div/img"));
		Actions A = new Actions(driver);
		A.moveToElement(mail).perform();
		Thread.sleep(1500);
		
		//Click on mail button
//		driver.findElement(By.xpath("//*[@id=\"content-box\"]/section/div[3]/ul/li[1]/p/a")).click();
//		Thread.sleep(1500);
	}
	
//============TC78 - search nearest option option==============
	public void searchoption() throws Exception
	{	
		//Hover on search option
		WebElement search = driver.findElement(By.xpath("//*[@id=\"content-box\"]/section/div[3]/ul/li[2]/div/img"));
		Actions A1 = new Actions(driver);
		A1.moveToElement(search).perform();
		Thread.sleep(1500);
			
		//Click on search option
//		driver.findElement(By.xpath("//*[@id=\"content-box\"]/section/div[3]/ul/li[2]/p/strong/a")).click();
//		Thread.sleep(1500);
	}

//============TC79 - Facebook button on contact page==============
	public void facebookcontact() throws Exception
	{
		//Click on facebook
		driver.findElement(By.xpath("/html/body/div/div[2]/section/div[4]/section/div[3]/div/div[1]/p/a")).click();
		Thread.sleep(1500);
		
		//Print msg and back
		System.out.println("facebook page opened successfully");
		driver.navigate().back();
		Thread.sleep(1500);
	}

//============TC80 - googleplus button on contact page==============
	public void googlecontact() throws Exception
	{
		//Click on Google Plus
		driver.findElement(By.xpath("/html/body/div/div[2]/section/div[4]/section/div[3]/div/div[2]/p/a")).click();
		Thread.sleep(1500);
			
		//Print msg and back
		System.out.println("Google Plus page opened successfully");
		driver.navigate().back();
		Thread.sleep(1500);
	}
	
//============TC81 - Instagram button on contact page==============
	public void instagramcontact() throws Exception
	{
		//Click on Instagram
		driver.findElement(By.xpath("/html/body/div/div[2]/section/div[4]/section/div[3]/div/div[3]/p/a")).click();
		Thread.sleep(1500);
				
		//Print msg and back
		System.out.println("Instagram page opened successfully");
		driver.navigate().back();
		Thread.sleep(1500);
	}

//============TC82 - Twitter button on contact page==============
	public void twittercontact() throws Exception
	{
		//Click on Twitter
		driver.findElement(By.xpath("/html/body/div/div[2]/section/div[4]/section/div[3]/div/div[4]/p/a")).click();
		Thread.sleep(1500);
					
		//Print msg and back
		System.out.println("Twitter page opened successfully");		
		driver.navigate().back();
		Thread.sleep(1500);
	}
	
	
}
