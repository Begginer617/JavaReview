package GettersAndSetters;

public class Address {

<<<<<<< HEAD
    private String street;
    private String apartmentNumber;
    private String city;
    private String postalCode;

    // Constructor with all parameters except postalCode
=======
<<<<<<< HEAD

    private String street;
    private String apartmentNumber;
    private String city;

    private String postalCode;


    // Constructor with all parameters
>>>>>>> e8e2e58fb02184f55dba35d20dd9956b01f29346
    public Address(String street, String apartmentNumber, String city) {
        this.street = street;
        this.apartmentNumber = apartmentNumber;
        this.city = city;
    }

<<<<<<< HEAD
    // Constructor with all parameters including postalCode
    public Address(String street, String apartmentNumber, String city, String postalCode) {
        this(street, apartmentNumber, city);  // Call the other constructor
        this.postalCode = postalCode;
    }

    // Getters
=======
    // aby wywowyływac inny konstruktor nalezy najpierw w 1 linijsce kodu wywołac pola z 1 kontruktora.
    public Address(String street, String apartmentNumber, String city, String postalCode) {
        this(city, street, apartmentNumber);
        this.postalCode = postalCode;

    }


    // Getters
=======
    private String street;
    private int apartment;
    private String city;


    // w momencie towrzenie obiektu adres , wartosci mozna przupisac
    public Address(String street , String apartment , String cityName) {
        this.street = street;
        this.apartment = Integer.parseInt( apartment );
        this.city = cityName;

    }

>>>>>>> 3458f1e833d69039bada58507210ed99fa02de51
>>>>>>> e8e2e58fb02184f55dba35d20dd9956b01f29346
    public String getStreet() {
        return street;
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e8e2e58fb02184f55dba35d20dd9956b01f29346
    public String getApartment() {
        return apartmentNumber;
    }

    public String getCity() {
        return city;
    }

<<<<<<< HEAD
    public String getPostalCode() {
        return postalCode;
    }

    // Setters
    public void setCity(String cityName) {
        this.city = cityName;
    }

    public void setStreet(String streetName) {
        this.street = streetName;
    }

    public void setApartment(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
=======
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
=======
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
>>>>>>> 3458f1e833d69039bada58507210ed99fa02de51
    }

>>>>>>> e8e2e58fb02184f55dba35d20dd9956b01f29346
}
