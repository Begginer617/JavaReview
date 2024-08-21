package AccessModifires1;

import org.junit.Test;

public class Tests {

    @Test
    public void productPage(){
        ProductPage productPage = new ProductPage();
//        productPage.productName = ""
//        productPage.productName = ""
        productPage.goTo( "https://onedrive.live.com/login/" );
         String productPrice = productPage.productPrice;

         HomePage homePage = new HomePage();
    }

}
