package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
	 WebDriver driver;

	    public ProductsPage(WebDriver driver){
	        this.driver = driver;
	    }

	    By addToCart = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
	    By cartIcon = By.xpath("//a[@class='shopping_cart_link']");

	    public void addProduct(){

	        driver.findElement(addToCart).click();
	    }

	    public void openCart(){

	        driver.findElement(cartIcon).click();
	    }
}
