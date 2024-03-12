package Tests;

import com.filip.worklearning.SeleniumConfig.Hooks;
import com.filip.worklearning.pages.*;
import org.testng.annotations.Test;

public class FirstTest extends Hooks {

    @Test
    public void endToEndTest() throws InterruptedException {

        HomePage homePg = new HomePage(driver);
        ShopHomePage shopHomepg = new ShopHomePage(driver);
        ShopProductsPage shopProdpg = new ShopProductsPage(driver);
        ShopContentPanel shopContent = new ShopContentPanel(driver);
        ShoppingCart shopCart = new ShoppingCart(driver);

        homePg.openTestStore();
        shopHomepg.clickProdOne();
        shopProdpg.selectSizeOption();
        Thread.sleep(3000);
        shopProdpg.increaseQuantitybyOne();
        Thread.sleep(3000);
        shopProdpg.clickAddToCart();
        shopContent.clickOnCheckout();
        Thread.sleep(3000);
        shopCart.clickHavePromo();
        shopCart.enterPromoCode();
        Thread.sleep(3000);
        shopCart.addPromoCode();
        Thread.sleep(3000);

    }

}
