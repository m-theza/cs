package Package2;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class casestudy02 {
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
		driver.findElement(By.xpath(".//a[contains(text(),\"SignIn\")]")).click();
	   
	}

	@Given("Enter the data in field")
	public void enter_the_data_in_field(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String,String>> list = dataTable.asMaps(String.class,String.class); 
		
		driver.findElement(By.name("userName")).sendKeys(list.get(0).get("UserName"));
		driver.findElement(By.name("password")).sendKeys(list.get(0).get("Password"));
		
	}

	@Then("Click on login")
	public void click_on_login() {
	 
		
		driver.findElement(By.name("Login")).click();
	}


}
