package de.wbs.kotlindemo;

public class Main {

    public static void main(String[] args) {
        PersonKotlin p = new PersonKotlin("Neumann","Frank","hdh","45","12345","Berlin",44);

        System.out.println(p.getFirstname());
        System.out.println(p.toString());
    }
}
