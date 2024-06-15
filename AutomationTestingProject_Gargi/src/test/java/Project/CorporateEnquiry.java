package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CorporateEnquiry 
{
	WebDriver driver;

	public CorporateEnquiry(WebDriver driver)
	{
		this.driver = driver;
	}

//=============TC74 - Corporate Enquiry option===========
	public void corporatenqry() throws InterruptedException
	{
		//Click on corporate enquiry option
		driver.findElement(By.partialLinkText("CORPORATE ENQUIRY")).click();
		Thread.sleep(1500);
	}
	
//=============TC75 - Corporate Enquiry option===========
	public void details() throws InterruptedException
	{
		//Enter name
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Santoshi");
		Thread.sleep(1500);
		
		//Enter Organization name
		WebElement org = driver.findElement(By.id("organisation"));
		org.sendKeys("ABC");
		Thread.sleep(1500);
		
		//Enter number
		WebElement num = driver.findElement(By.id("mobile"));
		num.sendKeys("1234567890");
		Thread.sleep(1500);
				
				
		//Enter Email Id
		WebElement eid = driver.findElement(By.id("emailid"));
		eid.sendKeys("santoshi@gmail.com");
		Thread.sleep(1500);
				
				
		//Enter Locality
		WebElement locality = driver.findElement(By.id("location"));
		locality.sendKeys("Pune");
		Thread.sleep(1500);
		
		//Enter date
		WebElement date = driver.findElement(By.id("date"));
		date.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")).click();
		Thread.sleep(1500);
		
		//Enter Querry
		WebElement qry = driver.findElement(By.id("query"));
		qry.sendKeys("Pune");
		Thread.sleep(1500);
		
		//Click on Submit
		driver.findElement(By.id("corporatesubmit")).click();
		Thread.sleep(1500);
		
		//Print Message
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"content-box\"]/div[1]/div[3]/div/div"));
		System.out.println(msg.getText());
		
	}
}
