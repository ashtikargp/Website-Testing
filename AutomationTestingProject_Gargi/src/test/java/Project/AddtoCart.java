package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoCart 
{
	WebDriver driver;
	
	public AddtoCart(WebDriver driver)
	{
		this.driver = driver;
	}

//================TC024 - Add to Cart button===================
	public void addtocart() throws InterruptedException
	{
		//Select Veg Pizza 
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[2]/div/div[2]/div/div/div[2]/div[3]/div/button")).click();
		Thread.sleep(1500);
	}
	
//================TC025 - Popup - No Thanks button===================
	public void popup() throws InterruptedException
	{ 
		//Handle PopUp
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[2]/div/div[1]/div/div/div[2]/div[3]/div[1]/button")).click();
		Thread.sleep(1500);
	}

//================TC026 - Checkout button===================
	public void checkout() throws InterruptedException
	{
		//Click on Checkout button
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/button")).click();
		Thread.sleep(1500);
	}

//================TC027 - Add button===================
	public void add() throws InterruptedException
	{
		//Add more items
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/div[2]/div[3]/div[1]/div/div/div[2]/div[2]/div/div/div[2]/ul/li[1]/div/div[2]/div")).click();
		Thread.sleep(1500);
	}

//================TC028 - Home Page===================
	public void homepage() throws InterruptedException
	{
		//Go to homepage
		driver.navigate().to("https://www.dominos.co.in/");
		Thread.sleep(1500);
		
		//click on orderonline now
		driver.findElement(By.xpath("//*[@id=\"online-banner\"]/div/a/button")).click();
		Thread.sleep(1500);
	}
	
//================TC029 - Party Combo option and add to cart ===================
	public void partyoption() throws InterruptedException
	{
		//click on party combos
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[1]/div[11]/span")).click();
		Thread.sleep(1500);
		
		//Click on add to cart
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[20]/div/div/div/div/div[2]/div[2]/div/button")).click();
		Thread.sleep(1500);
	}
	
//================TC030 - Non Veg Pizza option and add to cart ===================	
	public void nonvegpizzaoption() throws InterruptedException
	{
		//click on non veg pizza option
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[1]/div[4]/span")).click();
		Thread.sleep(1500);
		
		//Select a pizza
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[6]/div/div[2]/div/div/div[2]/div[3]/div/button")).click();
		Thread.sleep(1500);
		
		//Handle popup
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[6]/div/div[1]/div/div/div[2]/div[3]/div[1]/button")).click();
		Thread.sleep(1500);
	}
	
//================TC031 - Meals option and add to cart ===================	
	public void meals() throws InterruptedException
	{
		//Click on meals option
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[1]/div[10]/span")).click();
		Thread.sleep(1500);
		
		//select meal and add to cart
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[18]/div/div[3]/div/div/div[2]/div[2]/div/button/span")).click();
		Thread.sleep(1500);
	}
	
//================TC032 - Meals option and add to cart ===================	
	public void mania() throws InterruptedException
	{
		//Click on pizza mania option
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[1]/div[7]/span")).click();
		Thread.sleep(1500);
		
		//Select mania and add to cart
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[12]/div/div[1]/div/div/div[2]/div[3]/div/button")).click();
		Thread.sleep(1500);
	}
	
//================TC033 - Value combo option and add to cart ===================	
	public void valuecombo() throws InterruptedException
	{
		//Click on Value combo option
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[1]/div[8]/span")).click();
		Thread.sleep(1500);
			
		//Select combo and add to cart
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[14]/div/div[1]/div/div/div[2]/div[2]/div/button")).click();
		Thread.sleep(1500);
	}
	
//================TC034 - desserts and add to cart ===================	
	public void desserts() throws InterruptedException
	{
		//Click on desserts option
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[1]/div[9]/span")).click();
		Thread.sleep(1500);
				
		//Select dessert and add to cart
		driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[16]/div/div[2]/div/div/div[2]/div[2]/div/button")).click();
		Thread.sleep(1500);
	}
	
//================TC035 - CheckOut ===================	
	public void checkoutfinal() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/button/span")).click();
		Thread.sleep(1500);
		
		driver.navigate().to("https://www.dominos.co.in/");
		
	}
}
	
