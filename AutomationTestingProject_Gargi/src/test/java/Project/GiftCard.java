package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GiftCard 
{
	WebDriver driver;

	public GiftCard(WebDriver driver)
	{
		this.driver = driver;
	}

//===============TC40 - Click on gift card option============
	public void giftcard() throws Exception
	{
		//Click on giftcard option
		driver.findElement(By.partialLinkText("GIFT CARD")).click();
		Thread.sleep(1500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		Thread.sleep(1500);
		
	}
	
//===============TC41 - view all ============
	public void viewcards() throws Exception
	{
		//Click on view all option
		driver.findElement(By.partialLinkText("View All")).click();
		Thread.sleep(1500);
		
//When view all is clicked user is navigated to top of the page only. All gift cards are not displayed
	}
	
//================TC42 - Gift Card FAQs=================
	public void faq() throws InterruptedException
	{
		//Scroll window down
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(1500); 
		
		//Click on FAQ option
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/label")).click();
		Thread.sleep(1500);
	}
	
//================TC43 - Check Questions=================
	public void questions() throws InterruptedException
	{
		//Click on Q1
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[1]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q2
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[2]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q3
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[3]/label")).click();
		Thread.sleep(1500);
				
		//Click on Q4
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[4]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q5
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[5]/label")).click();
		Thread.sleep(1500);
				
		//Click on Q6
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[6]/label")).click();
		Thread.sleep(1500);
				
	   //Click on Q7
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[7]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q8
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[8]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q9
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[9]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q10
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[10]/label")).click();
		Thread.sleep(1500);
		
		
		//Click on Q11
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[11]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q12
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[12]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q13
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[13]/label")).click();
		Thread.sleep(1500);
				
		//Click on Q14
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[14]/label ")).click();
		Thread.sleep(1500);
		
		//Click on Q15
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[15]/label")).click();
		Thread.sleep(1500);
				
		//Click on Q16
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[16]/label")).click();
		Thread.sleep(1500);
				
//	   //Click on Q17
//		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[17]/label")).click();
//		Thread.sleep(1500);
		
		//Click on Q18
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[17]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q19
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[18]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q20
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[19]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q21
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[20]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q22
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[21]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q23
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[22]/label")).click();
		Thread.sleep(1500);
				
		//Click on Q24
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[23]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q25
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[24]/label")).click();
		Thread.sleep(1500);
				
		//Click on Q26
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[25]/label")).click();
		Thread.sleep(1500);
				
	   //Click on Q27
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[26]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q28
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[27]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q29
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[28]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q30
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[29]/label")).click();
		Thread.sleep(1500);
		
		//Click on Q31
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[30]/label")).click();
		Thread.sleep(1500);
				
		//Click on Q32
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[31]/label")).click();
		Thread.sleep(1500);
				
		//Click on Q33
		driver.findElement(By.xpath("//*[@id=\"red\"]/div[1]/div/div[32]/label")).click();
		Thread.sleep(1500);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
