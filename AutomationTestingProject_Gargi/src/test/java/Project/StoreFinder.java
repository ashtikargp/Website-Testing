package Project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class StoreFinder 
{
	WebDriver driver;
	
	public StoreFinder(WebDriver driver) 
	{
		this.driver = driver;
	}

//================TC018 - Store Finder===================
	public void storefinder()
	{
		//Click on store finder option
		driver.findElement(By.partialLinkText("DOMINO'S STORES")).click();
	}
	
//================TC019 - Near by store===================	
	public void storenearby() throws Exception
	{
		//Enter address in locality input box
		WebElement wb = driver.findElement(By.xpath("//*[@id=\"normal-search-block\"]"));
		wb.sendKeys("Venenzia Pune Mumbai Highway Balewadi, Pune Mumbai Highway Balewadi - 411045");
		Thread.sleep(1500);
		
		//Click on Search button
		driver.findElement(By.xpath("//*[@id=\"normal-search-block-submit\"]")).click();
		Thread.sleep(1500);
	}
//Test case runs without failure but searching function is not proper. no address is being searched both manually and automatically
	
//================TC020 - Advanced Search===================	
	public void advancesearch() throws Exception
	{
		//Click on advanced search option
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[1]/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(1500);
		
		//Enter city in input box
		Select state = new Select(driver.findElement(By.id("advanced-search-block-state")));
		state.selectByVisibleText("Maharashtra");
		Thread.sleep(1500);
		
		Alert alt = driver.switchTo().alert();
		System.out.println("Alert Message is: "+alt.getText());
		alt.accept();
		Thread.sleep(1500);
		
		
//		Select city = new Select(driver.findElement(By.id("advanced-search-block-city")));
//		city.selectByVisibleText("Nagpur");
//		Thread.sleep(1500);
//		
//		Select local = new Select(driver.findElement(By.id("advanced-search-block-locality")));
//		local.selectByVisibleText("Khamla");
//		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"advanced-search-block-submit\"]")).click();
	}

//After entering state in the drop down, an alert pops up saying "Sorry! Some unknown error has been occurred."
//In advance search option, drop down for city and locality has no options to select. 
//When search button is clicked user is navigated back to "search nearby" option.
	
//================TC021 - Navigate Button===================	
		public void navigate() throws Exception
		{
//			driver.findElement(By.xpath("//*[@id=\"map-canvas-0\"]/div/div[3]/div[1]/div[2]/div/div[4]/div/div/div/div[1]/div[2]/div/div/div[3]/ul/li[2]/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[3]/div[1]/div[3]/div/div/div[1]/div[1]/div[3]/ul/li[2]/a")).click();
		}
		
//In navigation button, stores mentioned on the map are no clickable automatically but clickable manually
//Navigate button on stores mentioned on the same page is clicked and new windoe opens with the address of the store but user can not automatically go back to original window
}