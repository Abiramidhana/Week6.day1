package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
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
@Given("Enter the username as DemosalesManager")
public void enter_the_username_as_demosales_manager() {
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
}
@Given("Enter the password as crmsfa")
public void enter_the_password_as_crmsfa() {
	driver.findElement(By.id("password")).sendKeys("crmsfa");
    
}
@When("Click on Login button")
public void click_on_login_button() {
	driver.findElement(By.className("decorativeSubmit")).click();
   
}
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
@When("Get the Value")
public void get_the_value() {
	String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
}
@When("click the value")
public void click_the_value() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
}
@When("click the Delete")
public void click_the_delete() {
	driver.findElement(By.linkText("Delete")).click();
}
@When("click the FindLeads")
public void click_the_find_leads() {
	driver.findElement(By.linkText("Find Leads")).click(); 
}
//@Given("the LeadId")
//public void the_lead_id(String leadID) {
//	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID); 
//}
//@When("Find the Leads")
//public void find_the_leads() {
//	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
//}
//@When("text is not equal")
//public void text_is_not_equal() {
//	String text = driver.findElement(By.className("x-paging-info")).getText();
//	if (text.equals("No records to display")) {
//		System.out.println("Text matched");
//	} else {
//		System.out.println("Text not matched");
//	} 
//}
//
//	
//	
//	
	
	
	
	
	
	
	
	
	

}