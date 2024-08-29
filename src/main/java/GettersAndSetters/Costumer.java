package GettersAndSetters;

<<<<<<< HEAD
class Customer {

    private String name;
    private String lastname;
    private int age;
    private Address address;

=======
public class Costumer {
    private String name;
    private String lastName;
    private int age;
    private Address address;



>>>>>>> 3458f1e833d69039bada58507210ed99fa02de51
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address addressParameter) {
<<<<<<< HEAD
        address = copy( addressParameter );
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    private Address copy(@org.jetbrains.annotations.NotNull Address addressToCopy) {
        Address address = new Address( addressToCopy.getStreet() ,
                                       addressToCopy.getApartment() ,
                                       addressToCopy.getCity() );
        return address;
=======
        address = addressParameter;
    }

    public void setAge(int ageParameter) throws IllegalArgumentException {
        if (ageParameter < 0) throw new IllegalArgumentException( "wiek nie moze byc liczba ujemną" );
        age = ageParameter;

    }

    public String getAge() {
        return age + " lat";
>>>>>>> 3458f1e833d69039bada58507210ed99fa02de51
    }


}
<<<<<<< HEAD
=======






>>>>>>> 3458f1e833d69039bada58507210ed99fa02de51
