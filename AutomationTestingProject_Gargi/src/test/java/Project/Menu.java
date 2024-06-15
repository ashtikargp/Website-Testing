package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Menu 
{
	WebDriver driver;

	public Menu(WebDriver driver) 
	{
		this.driver = driver;
	}
//=================TC02 - Menu================
	public void menu() throws Exception 
	{
		driver.findElement(By.partialLinkText("OUR MENU")).click();
	}
//=================TC03 - Veg Pizza================
	public void vegpizza() throws Exception 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"veg-pizzas\"]/div/div/div[1]/div/a")).click();
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);
	}
	
//=================TC04 - NonVeg Pizza================
	public void nonvegpizza() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[2]/a")).click();
		Thread.sleep(1500);
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);
	}
		
//=================TC05 - Side Orders================
	public void sideorders() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[3]/a")).click();
		Thread.sleep(1500);
						
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);		
	}
	
//=================TC06 - Side Orders - Dips================
	public void dips() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"pizza\"]/div[1]/div[1]/ul/li[2]/a/h2")).click();
		Thread.sleep(1500);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}
	
//=================TC07 - Side Orders - Desserts================
	public void desserts() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"pizza\"]/div[1]/div[1]/ul/li[3]/a/h2")).click();
		Thread.sleep(1500);
			
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}
		
//=================TC08 - Side Orders - more================
	public void more() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"pizza\"]/div[1]/div[1]/ul/li[4]/a/h2")).click();
		Thread.sleep(1500);
					
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}
	
//=================TC09 - Beverages================
	public void bev() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[4]/a")).click();
		Thread.sleep(1500);
						
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}
	
//=================TC10 - Choice of Crusts================
	public void crusts() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[5]/a")).click();
		Thread.sleep(1500);
							
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
		}
	
//=================TC11- Choice of Toppings================
	public void toppings() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[6]/a")).click();
		Thread.sleep(1500);
								
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}

//=================TC12- Pasts================
	public void pasts() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[7]/a")).click();
		Thread.sleep(1500);
									
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}
	
//=================TC13- Pizza Mania================
	public void mania() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[8]/a")).click();
		Thread.sleep(1500);
										
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}

//=================TC14- Burger Pizzas================
	public void burger() throws Exception 
	{
		driver.findElement(By.partialLinkText("BURGER PIZZA")).click();
		Thread.sleep(1500);
											
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}
	
//=================TC15- Chicken Wings================
	public void chwings() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[10]/a")).click();
		Thread.sleep(1500);
												
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}
	
//=================TC16- Chicken Pizzas================
	public void chpizza() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[11]/a")).click();
		Thread.sleep(1500);
													
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}
		
//=================TC17- Pizza Paratha================
	public void prpizza() throws Exception 
	{
		driver.findElement(By.xpath("//*[@id=\"our-menu\"]/ul/li[12]/a")).click();
		Thread.sleep(1500);
													
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-4000)");
		Thread.sleep(1000);	
	}
}
