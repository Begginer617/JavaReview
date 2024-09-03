package AccessModifires1;

import org.junit.Test;

public class Tests {

    @Test
<<<<<<< HEAD
    public void addtoCartTest() {
        ProductPage productPage = new ProductPage();
        productPage.setAmount(3).addToCart().gotToCart();
        productPage.goTo("https://onedrive.live.com/login/");
        String productPrice = productPage.productPrice;

        // Assuming you want to do something with productPrice
        System.out.println("Product Price: " + productPrice);

        HomePage homePage = new HomePage();
    }

    @Test
    public void productPageTest() {
        ProductPage productPage = new ProductPage();
        // Uncomment and use if needed
        // productPage.productName = "Product Name";
        // productPage.productPrice = "Product Price";

        productPage.goTo("https://onedrive.live.com/login/");
        String productPrice = productPage.productPrice;

        HomePage homePage = new HomePage();
    }
=======
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

>>>>>>> e8e2e58fb02184f55dba35d20dd9956b01f29346
}
