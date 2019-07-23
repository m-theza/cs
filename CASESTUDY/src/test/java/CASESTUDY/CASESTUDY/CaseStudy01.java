package CASESTUDY.CASESTUDY;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CaseStudy01 {


	public static WebDriver driver;
	Actions action ;
	@Given("Launch Google Chrome and Load TestMeApp URL")
	public void launch_Google_Chrome_and_Load_TestMeApp_URL() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://192.168.40.4:8083/TestMeApp1/fetchcat.htm");
		}

	@Given("Navigate to SignUp")
	public void navigate_to_SignUp() {
		
	driver.findElement(By.xpath(".//a[contains(text (),\"SignUp\")]")).click();;
	    
	}

	@Given("Enter the data in field")
	public void enter_the_data_in_field(io.cucumber.datatable.DataTable dataTable) {
		 
		List<Map<String,String>> list = dataTable.asMaps(String.class,String.class);
		//System.out.println(list.get(0).get("UserName"));
		
		driver.findElement(By.name("userName")).sendKeys(list.get(0).get("UserName"));
		driver.findElement(By.name("firstName")).sendKeys(list.get(0).get("FirstName"));
		driver.findElement(By.name("lastName")).sendKeys(list.get(0).get("LastName"));
		driver.findElement(By.name("password")).sendKeys(list.get(0).get("Password"));
		driver.findElement(By.name("confirmPassword")).sendKeys(list.get(0).get("ConfrimPassword"));
        driver.findElement(By.xpath(".//span[contains(text(),\"Male\")]")).click();
	    driver.findElement(By.name("emailAddress")).sendKeys(list.get(0).get("E-mail"));
	    driver.findElement(By.name("mobileNumber")).sendKeys(list.get(0).get("MobileNumber"));
	    driver.findElement(By.name("dob")).sendKeys(list.get(0).get("DOB"));
	    driver.findElement(By.name("address")).sendKeys(list.get(0).get("Address"));
	    
	    Select s=new Select(driver.findElement(By.id("securityQuestion")));
	    s.selectByIndex(1);
	    
	    driver.findElement(By.name("answer")).sendKeys(list.get(0).get("Answer"));
	}

	@Then("Click on Register Button")
	public void click_on_Register_Button() {
		driver.findElement(By.xpath(".//input[@value=\"Register\"]")).click();
		
	   
	}

	

}
