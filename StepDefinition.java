package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition  {
	public ChromeDriver driver;


@Given("Open the chrome browser")
public void open_the_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

}
@Given("Load the application url")
public void load_the_application_url() {
	driver.get("http://leaftaps.com/opentaps/");
}
//@Given("Enter the username as DemosalesManager")
//public void enter_the_username_as_demosales_manager() {
//	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//}
//@Given("Enter the password as crmsfa")
//public void enter_the_password_as_crmsfa() {
//	driver.findElement(By.id("password")).sendKeys("crmsfa");
//    
//}
@Given("Enter the username as{string}")
public void enter_the_username_as(String username) {
	driver.findElement(By.id("username")).sendKeys(username);
}
@Given("Enter the password as{string}")
public void enter_the_password_as(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
    
}
@When("Click on Login button")
public void click_on_login_button() {
	driver.findElement(By.className("decorativeSubmit")).click();
   
}
//@Then("Homepage should be displayed")
//public void verifyHomePage() {
//	
//	boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
//	
//	if(displayed) {
//		System.out.println("Homepage is displayed");
//	}else {
//		System.out.println("Homepage is not displayed");
//}
//}
@When("click on CRM\\/SFA")
public void click_on_crm_sfa() {
	driver.findElement(By.linkText("CRM/SFA")).click();
  
}
@When("click the Lead")
public void click_the_lead() {
	driver.findElement(By.linkText("Leads")).click();
   
}
@When("Find the Leads Button")
public void find_the_leads_button() {
	driver.findElement(By.linkText("Find Leads")).click();
   
}
@When("Find the Phone")
public void find_trhe_phone() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
  
}
@Given("Enter the phone no")
public void enter_the_phone_no() {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("12345"); 
}
@When("click the Find leads button")
public void click_the_find_leads_button() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();  
	Thread.sleep(2000);
}
//@When("click the Delete")
//public void click_the_delete() {
//	driver.findElement(By.linkText("Delete")).click();
//}
//@When("click the FindLeads")
//public void click_the_find_leads() throws InterruptedException {
//	driver.findElement(By.linkText("Find Leads")).click(); 
//	Thread.sleep(2000);
//}
@When("click the first text")
public void click_the_first_text() 
{
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
}
@When("click the Duplicate lead")
public void click_the_duplicate_lead() 
{
	driver.findElement(By.linkText("Duplicate Lead")).click();
}
@When("click the submit button")
public void click_the_submit_button() 
{
	driver.findElement(By.name("submitButton")).click();
}

//@When("click the edit")
//public void click_the_edit() {
//	driver.findElement(By.linkText("Edit")).click();  
//}
//@Given("Enter the TCS")
//public void enter_the_tcs() {
//	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
//
//}
//@When("click the Update")
//public void click_the_update() {
//	driver.findElement(By.name("submitButton")).click();  
//}
}