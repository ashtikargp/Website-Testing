package Project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class ObjectFile 
{
	WebDriver driver;
	Menu mn ;
	StoreFinder sf;
	OrderOnline od;
	AddtoCart ac;
	ChatMessage cht;
	Coupon cp;
	GiftCard gf;
	CorporateEnquiry cnq;
	Contact ct;
	Company cmp;
	
	
  @Test(priority=1)
  public void TestMenu() throws Exception 
  {
	  mn.menu();
	  mn.vegpizza();
	  mn.nonvegpizza();
	  mn.sideorders();
	  mn.dips();
	  mn.desserts();
	  mn.more();
	  mn.bev();
	  mn.crusts();
	  mn.toppings();
	  mn.pasts();
	  mn.mania();
	  mn.burger();
	  mn.chwings();
	  mn.chpizza();
	  mn.prpizza();
  }
  
 @Test(priority=2)
  public void TestStoreFinder() throws Exception
  { 
	 sf.storefinder();
     sf.storenearby();
	 sf.advancesearch();
	 sf.navigate();		 
  }
	 
 @Test(priority=3)
  public void TestOrderOnline() throws Exception 
  {
	od.orderonline();
	od.deliver_locate_me();
  }
	 
 @Test(priority=4)
  public void TestAddtoCart() throws Exception 
  {
	ac.addtocart();
	ac.popup();
	ac.checkout();
	ac.add();
	ac.homepage();
	ac.partyoption();
	ac.nonvegpizzaoption();
	ac.meals();
	ac.mania();
	ac.valuecombo();
	ac.desserts();
	ac.checkoutfinal();
  }
	 
  @Test(priority=5)
   public void TestChatMessage() throws Exception 
   {
	 cht.chat();
   }
	 
  @Test(priority=6)
  public void TestCoupon() throws Exception 
  {
	 cp.selectcoupon();
	 cp.bestsellers();
	 cp.bestsellerscheckout();
  }
	
  @Test(priority=7)
  public void TestGiftCard() throws Exception 
  {
	 gf.giftcard();
	 gf.viewcards();
	 gf.faq();
	 gf.questions();
  }
	
  @Test(priority=8)
  public void TestCorporateEnquiry() throws Exception 
  {
	 cnq.corporatenqry();
	 cnq.details();
  }
	
  @Test(priority=9)
  public void TestContact() throws Exception 
  {
	 ct.contactoption();
	 ct.mailoption();
	 ct.searchoption();
	 ct.facebookcontact();
	 ct.googlecontact();
	 ct.instagramcontact();
	 ct.twittercontact();
  }

 @Test(priority=10)
 public void TestCompany() throws Exception 
 {
	cmp.blog();
	cmp.investor();
	cmp.feedback();
	cmp.ads();
 }
	
  @BeforeTest
  public void beforeTest() 
  {
	 
	 ChromeOptions option = new ChromeOptions();
	 option.addArguments("---disable-notifications");
	 
	 driver = new ChromeDriver(option); 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.dominos.co.in/");
	 
	 mn = new Menu(driver);
	 sf = new StoreFinder(driver);
	 od = new OrderOnline(driver);
	 ac = new AddtoCart(driver);
	 cht = new ChatMessage(driver);
	 cp = new Coupon(driver);
	 gf = new GiftCard(driver);
	 cnq = new CorporateEnquiry(driver);
	 ct = new Contact(driver);
	 cmp = new Company(driver);
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
