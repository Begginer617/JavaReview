package AccessModifires1;

<<<<<<< HEAD
// Product page extends BasePage
// You can inherit from only one class
public class ProductPage extends BasePage {
    String productName;
    String productPrice;

    // Protected method to add a product to the cart, returning the ProductPage object
    protected ProductPage addToCart() {
        BasePage basePage = new BasePage();
        basePage.searchForProduct("product");
        System.out.println("Product added to cart");
        return this;
    }

    // Method to set the amount of a product, returning a new ProductPage object
    protected ProductPage setAmount(int amount) {
        System.out.println("Selected quantity: " + amount);
        return new ProductPage();
    }

    // Method to go to the cart
    protected void gotToCart() {
        System.out.println("Navigating to the cart");
    }
}
=======

// Product page roszerze base page
// mozna dziedziczyc tylko po 1 klasie
public class ProductPage extends BasePage{
    String productName;
    String productPrice;
<<<<<<< HEAD
    protected ProductPage addToCart () {
=======
    void addToCart () {
>>>>>>> 3458f1e833d69039bada58507210ed99fa02de51
        BasePage basePage = new BasePage();
        basePage.searchForProduct( "product" );
        System.out.println( "Product added to cart" );
    }


<<<<<<< HEAD

    protected ProductPage setAmount(int amount){
        System.out.println("wybrano ilosc: " + amount);
        return new ProductPage();
    }
    protected void gotToCart(){
        System.out.println("Przejscie do koszyka");
    }

=======
>>>>>>> 3458f1e833d69039bada58507210ed99fa02de51
}
>>>>>>> e8e2e58fb02184f55dba35d20dd9956b01f29346
