package de.wbs.kotlindemo;

import java.util.Objects;

public class Person {
    private String lastname;
    private String firstname;
    private String street;
    private String number;
    private String zip;
    private String city;

    public Person(String lastname, String firstname, String street, String number, String zip, String city) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.city = city;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(getLastname(), person.getLastname()) &&
                Objects.equals(getFirstname(), person.getFirstname()) &&
                Objects.equals(getStreet(), person.getStreet()) &&
                Objects.equals(getNumber(), person.getNumber()) &&
                Objects.equals(getZip(), person.getZip()) &&
                Objects.equals(getCity(), person.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLastname(), getFirstname(), getStreet(), getNumber(), getZip(), getCity());
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p = new Person(this.lastname,firstname,street,number,zip,city);
        return p;
    }
}
