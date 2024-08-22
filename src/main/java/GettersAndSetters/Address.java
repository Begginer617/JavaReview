package GettersAndSetters;

public class Address {


    private String street;
    private String apartmentNumber;
    private String city;

    private String postalCode;


    // Constructor with all parameters
    public Address(String street, String apartmentNumber, String city) {
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
    }

    // aby wywowyływac inny konstruktor nalezy najpierw w 1 linijsce kodu wywołac pola z 1 kontruktora.
    public Address(String street, String apartmentNumber, String city, String postalCode) {
        this(city, street, apartmentNumber);
        this.postalCode = postalCode;

    }


    // Getters
    public String getStreet() {
        return street;
    }

    public String getApartment() {
        return apartmentNumber;
    }

    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String cityName) {
        city = cityName;
    }
    // Setter for street

    public void setStreet(String street) {
        this.street = street;
    }
    // Setter for apartmentNumber

    public void setApartment(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

}
