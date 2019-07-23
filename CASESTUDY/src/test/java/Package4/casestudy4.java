package Package4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy4 {

	public static WebDriver driver;
	Actions action ;
@Given("Alex has registered in to TestMeApp")
public void alex_has_registered_in_to_TestMeApp() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://192.168.40.4:8083/TestMeApp1/fetchcat.htm");
	
	driver.findElement(By.xpath(".//a[contains(text(),\"SignIn\")]")).click();
	   
	
	driver.findElement(By.name("userName")).sendKeys(("AlexUser"));
	driver.findElement(By.name("password")).sendKeys(("Alex@123"));
	driver.findElement(By.name("Login")).click();
    
}

@When("Alex search a particuolar product like headphone")
public void alex_search_a_particuolar_product_like_headphone() {
	
	driver.findElement(By.name("products")).sendKeys("Headphone");
	driver.findElement(By.xpath(".//input[@value=\"FIND DETAILS\"]")).click();
}

@When("try to proceed to payment without adding any item in the cart")
public void try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
	
	if (driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0)
	{
		driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
	}
	else {
		System.out.println("\n\n ICON NOT VISIBLE\n\n");
	}
	
}

@Then("TestMeApp doesn't display the cart icon")
public void testmeapp_doesn_t_display_the_cart_icon() {
    
	Assert.assertEquals(0,driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size());
}

}
