package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChatMessage 
{
	WebDriver driver;
	
	public ChatMessage(WebDriver driver)
	{
		this.driver = driver;
	}
	
//=========TC36 - chat option==============
	public void chat() throws Exception
	{
		//Click on chat option
		driver.findElement(By.className("removeBackground")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//iframe[@id='ymIframe']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//div[@id='ymDivCircle']")).click(); 
		Thread.sleep(1500);
	}
	
	

}
