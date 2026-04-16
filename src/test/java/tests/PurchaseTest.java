package tests;
import base.BaseTest;
import pages.LoginPage;
import pages.ProductsPage;
import pages.CheckoutPage;
import org.testng.annotations.Test;
public class PurchaseTest extends BaseTest {
	@Test
	public void buyProduct() throws InterruptedException {

	LoginPage login = new LoginPage(driver);
	login.login("standard_user","secret_sauce");

	Thread.sleep(10000);

	ProductsPage product = new ProductsPage(driver);

	product.addProduct();

	Thread.sleep(5000);

	product.openCart();

	Thread.sleep(5000);
	CheckoutPage checkout = new CheckoutPage(driver);

	checkout.checkout();

	Thread.sleep(3000);

	checkout.enterDetails("Tanushri","Adekar","440001");

	Thread.sleep(2000);

	checkout.continueCheckout();

	Thread.sleep(2000);

	checkout.finishOrder();

	Thread.sleep(5000);
	}

}
