package GettersAndSetters;

import org.junit.Test;

public class Tests {
    @Test
    public void gettersAndSetters() {
        Costumer costumer = new Costumer();
        int age = 15;
        costumer.setAge( age );
        System.out.println( "Wiek to " + costumer.getAge() );
    }

    @Test
    public void gettersAndSettersObjectsTests() {
        Costumer costumer = new Costumer();
        Address address = new Address( "bobolowa" , "15/22" , "warsaw" );
        costumer.setAddress( address );
        System.out.println( "address: " + costumer.getAddress().getStreet() + " " + costumer.getAddress().getApartment() + " " + costumer.getAddress().getCity() );
        address.setCity( "Darłowo" );
        System.out.println( "address: " + costumer.getAddress().getStreet() + " " + costumer.getAddress().getApartment() + " " + costumer.getAddress().getCity() );

    }
}