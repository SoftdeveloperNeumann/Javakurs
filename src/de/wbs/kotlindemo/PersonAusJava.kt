package de.wbs.kotlindemo

import java.util.*


class Person1(var lastname: String, var firstname: String, var street: String, var number: String, var zip: String, var city: String, var age: Int) : Cloneable {

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val person = o as Person
        return lastname == person.lastname &&
                firstname == person.firstname &&
                street == person.street &&
                number == person.number &&
                zip == person.zip &&
                city == person.city &&
                age == person.age
    }

    override fun hashCode(): Int {
        return Objects.hash(lastname, firstname, street, number, zip, city, age)
    }

    override fun toString(): String {
        return "Person{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", age='" + age + '\'' +
                '}'
    }

    @Throws(CloneNotSupportedException::class)
    override fun clone(): Any {
        return Person(lastname, firstname, street, number, zip, city, age)
    }

}
