package GettersAndSetters;

public class Costumer {
    private String name;
    private String lastName;
    private int age;
    private Address address;



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address addressParameter) {
        address = addressParameter;
    }

    public void setAge(int ageParameter) throws IllegalArgumentException {
        if (ageParameter < 0) throw new IllegalArgumentException( "wiek nie moze byc liczba ujemną" );
        age = ageParameter;

    }

    public String getAge() {
        return age + " lat";
    }


}






