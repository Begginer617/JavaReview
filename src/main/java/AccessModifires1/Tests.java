package AccessModifires1;

import org.junit.Test;

public class Tests {

    @Test
<<<<<<< HEAD
    public void addtoCartTest(){
        ProductPage productPage = new ProductPage();
        productPage.setAmount( 3 ).addToCart().gotToCart();


=======
    public void productPage(){
        ProductPage productPage = new ProductPage();
//        productPage.productName = ""
//        productPage.productName = ""
>>>>>>> 3458f1e833d69039bada58507210ed99fa02de51
        productPage.goTo( "https://onedrive.live.com/login/" );
         String productPrice = productPage.productPrice;

         HomePage homePage = new HomePage();
    }

}
