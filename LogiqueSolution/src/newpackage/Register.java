package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Register {

    public static void main(String[] args) {
      // declaration and instantiation of objects/variables
      //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	  //WebDriver driver = new FirefoxDriver();
	  //comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://qa-engineer.logique.co.id/";
        String expectedTitle = "Form Pendaftaran";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        WebElement email=driver.findElement(By.id("customer_email"));
       
        email.sendKeys("rar@gmail.com");
        
      
        
        WebElement firstname=driver.findElement(By.id("customer_firstname"));
         firstname.sendKeys("Winda");
        WebElement lastname=driver.findElement(By.id("customer_lastname"));
         lastname.sendKeys("Kristiana");
        WebElement address=driver.findElement(By.id("customer_address"));
         address.sendKeys("Bangirjo");
        WebElement city=driver.findElement(By.id("customer_city"));
         city.sendKeys("Yogya");
        WebElement phone=driver.findElement(By.id("customer_phone"));
         phone.sendKeys("93829");
        WebElement mobile=driver.findElement(By.id("customer_mobile"));
         mobile.sendKeys("2382");
        WebElement ktp=driver.findElement(By.id("customer_ktp"));
         ktp.sendKeys("2783723");
        WebElement sim=driver.findElement(By.id("customer_sim"));
         sim.sendKeys("234234");
        
        Select cstatus = new Select(driver.findElement(By.name("customer_status")));
		cstatus.selectByVisibleText("Other");

		WebElement cname=driver.findElement(By.id("company_name"));
		 cname.sendKeys("2382");
	    WebElement cphone=driver.findElement(By.id("company_phone"));
	     cphone.sendKeys("2382");
	    WebElement caddress=driver.findElement(By.id("company_address"));
	     caddress.sendKeys("2382");
        
        
	     WebElement upload = driver.findElement(By.id("customer_ktp_file"));
	     upload.sendKeys("E:\\image.jpg");
	     driver.findElement(By.id("agreement")).click();
	     driver.findElement(By.name("wp-view")).click();
        
    }

}