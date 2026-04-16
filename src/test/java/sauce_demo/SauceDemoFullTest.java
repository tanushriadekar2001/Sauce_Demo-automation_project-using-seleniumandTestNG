package sauce_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemoFullTest {
	  WebDriver driver;

	    @BeforeTest
	    public void setup() {

	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com");
	    }

	    @Test
	    public void fullWebsiteAutomation() throws InterruptedException {

	        Thread.sleep(5000);

	        // Login
	        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

	        Thread.sleep(2000);

	        driver.findElement(By.xpath("//input[@id='login-button']")).click();

	        Thread.sleep(5000);

	        // Sort products
	        driver.findElement(By.xpath("//select[@class='product_sort_container']")).click();

	        Thread.sleep(2000);

	        // Add products to cart
	        driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();

	        Thread.sleep(2000);

	        driver.findElement(By.xpath("(//button[contains(text(),'Add to cart')])[2]")).click();

	        Thread.sleep(3000);

	        // Open cart
	        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

	        Thread.sleep(5000);

	        // Remove one product
	        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();

	        Thread.sleep(2000);

	        // Checkout
	        driver.findElement(By.xpath("//button[@id='checkout']")).click();

	        Thread.sleep(3000);

	        // Fill customer details
	        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Test");

	        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("User");

	        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("440001");

	        Thread.sleep(2000);

	        // Continue
	        driver.findElement(By.xpath("//input[@id='continue']")).click();

	        Thread.sleep(3000);

	        // Finish order
	        driver.findElement(By.xpath("//button[@id='finish']")).click();

	        Thread.sleep(5000);

	        // Open menu
	        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();

	        Thread.sleep(3000);

	        // Logout
	        driver.findElement(By.xpath("//a[text()='Logout']")).click();

	        Thread.sleep(5000);
	    }

	    @AfterTest
	    public void closeBrowser() {

	        driver.quit();
	    }
}
