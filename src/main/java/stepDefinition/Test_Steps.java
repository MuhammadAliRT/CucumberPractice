package stepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps 
{
	public static WebDriver driver;
	@Given("^User is on Login Page$")
	public void user_is_on_LoginPage() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/lib/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://plugins.rolustech.com:4436/");
		driver.manage().window().maximize();
	}
	
	@When("^User enters \"(.*)\" as Username and \"(.*)\" as Password$")
	public void user_enters_UserName_and_Password(String username, String password) throws Throwable 
	{
		 driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username); 
	     driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
	     driver.findElement(By.cssSelector("a[name='login_button']")).click();
	     driver.findElement(By.cssSelector("#alerts button.close ")).click();   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully()
	{
		System.out.println("Login Successfully");	    
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable 
	{
		 driver.findElement(By.cssSelector("#userActions .btn")).click(); 
		 driver.findElement(By.cssSelector(".dropdown-menu .profileactions-logout")).click(); 
	}

	@Then("^Message displayed LogOut Successfull$")
	public void message_displayed_LogOut_Successfull() throws Throwable 
	{
		System.out.println("Log out Successfully");	    
	}
}
