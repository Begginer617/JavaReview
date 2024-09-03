package GettersAndSetters;

import java.util.Objects;

public class Customer {

    private String name;
    private String lastName;
    private int age;
    private Address address;

    // Getter for address
    public Address getAddress() {
        return address;
    }

    // Setter for address
    public void setAddress(Address addressParameter) {
        this.address = addressParameter;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int ageParameter) throws IllegalArgumentException {
        if (ageParameter < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.age = ageParameter;
    }

    // Method to get age as a string
    public String getAgeAsString() {
        return age + " years";
    }

    public Customer(String name, String lastName, int age, Address address) {
        this.name = name;
        this.lastName = lastName;
        setAge(age);  // Using setter for validation
        this.address = address;
    }


    @Override
    public String toString() {
        return "Customer{name='" + name + "', lastName='" + lastName + "', age=" + age + ", address=" + address + "}";
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && name.equals(customer.name) && lastName.equals(customer.lastName) && address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, address);
    }

}
