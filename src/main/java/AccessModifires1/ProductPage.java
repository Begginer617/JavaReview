package AccessModifires1;


// Product page roszerze base page
// mozna dziedziczyc tylko po 1 klasie
public class ProductPage extends BasePage{
    String productName;
    String productPrice;
    void addToCart () {
        BasePage basePage = new BasePage();
        basePage.searchForProduct( "product" );
        System.out.println( "Product added to cart" );
    }


}