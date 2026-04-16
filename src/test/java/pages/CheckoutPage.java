package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	WebDriver driver;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
    }

    By checkoutBtn = By.xpath("//button[@id='checkout']");
    By firstName = By.xpath("//input[@id='first-name']");
    By lastName = By.xpath("//input[@id='last-name']");
    By postalCode = By.xpath("//input[@id='postal-code']");
    By continueBtn = By.xpath("//input[@id='continue']");
    By finishBtn = By.xpath("//button[@id='finish']");

    public void checkout(){

        driver.findElement(checkoutBtn).click();
    }

    public void enterDetails(String fname,String lname,String code){

        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
        driver.findElement(postalCode).sendKeys(code);
    }

    public void continueCheckout(){

        driver.findElement(continueBtn).click();
    }

    public void finishOrder(){

        driver.findElement(finishBtn).click();
    }
}
