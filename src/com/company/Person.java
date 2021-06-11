package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private Address address;

    public Person(String firstName, String secondName, Address address) {
        if (firstName == null) {
            throw new NullFieldException("строка имени пустая");
        }
        if (secondName == null) {
            throw new NullFieldException("строка имени пустая");
        }
        if (address == null) {
            throw new NullFieldException("строка имени пустая");
        }
        this.firstName = firstName;
        this.lastName = secondName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

}
