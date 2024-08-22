package AccessModifires1;


// Product page roszerze base page
// mozna dziedziczyc tylko po 1 klasie
public class ProductPage extends BasePage{
    String productName;
    String productPrice;
    protected ProductPage addToCart () {
        BasePage basePage = new BasePage();
        basePage.searchForProduct( "product" );
        System.out.println( "Product added to cart" );
    }



    protected ProductPage setAmount(int amount){
        System.out.println("wybrano ilosc: " + amount);
        return new ProductPage();
    }
    protected void gotToCart(){
        System.out.println("Przejscie do koszyka");
    }

}