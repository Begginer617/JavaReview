package AccessModifires1;


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