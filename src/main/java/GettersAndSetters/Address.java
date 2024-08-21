package GettersAndSetters;

public class Address {

    private String street;
    private int apartment;
    private String city;


    // w momencie towrzenie obiektu adres , wartosci mozna przupisac
    public Address(String street , String apartment , String cityName) {
        this.street = street;
        this.apartment = Integer.parseInt( apartment );
        this.city = cityName;

    }

    public String getStreet() {
        return street;
    }

    public int getApartment() {
        return this.apartment;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String cityName) {
        city = cityName;
    }

    public void setApartment(int apartmentNumber) {
        this.apartment = apartmentNumber;
    }



    public void setStreet(String streetName) {
        this.street = streetName;
    }

}
