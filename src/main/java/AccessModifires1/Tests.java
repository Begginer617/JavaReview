package AccessModifires1;

import org.junit.Test;

public class Tests {

    @Test
    public void addtoCartTest(){
        ProductPage productPage = new ProductPage();
        productPage.setAmount( 3 ).addToCart().gotToCart();


        productPage.goTo( "https://onedrive.live.com/login/" );
         String productPrice = productPage.productPrice;

         HomePage homePage = new HomePage();
    }

}
