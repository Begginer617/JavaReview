package GettersAndSetters;

class Customer {

    private String name;
    private String lastname;
    private int age;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address addressParameter) {
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
    }


}
