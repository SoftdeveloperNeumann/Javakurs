package de.wbs.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person extends Parent implements Serializable {
    private static final long serialVersionUID = 2787123L;

    private String name;

    private Integer myInt = 55;

    private transient Adress adress ;

    private transient String pwd = "leer";
    private transient int age;

    public Person(String name, String firstname) {
        super(firstname);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void writeObject(ObjectOutputStream oos){
        try {
            oos.defaultWriteObject();
            oos.writeObject("Hallo");
            oos.writeInt(age);
            oos.writeObject(adress.city);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream ois){
        try {
            ois.defaultReadObject();
            pwd = (String) ois.readObject();
            age = ois.readInt();
            String tmp = (String) ois.readObject();
            setAdress(new Adress(tmp));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

class Parent{
    String firstname = "Default";
    public Parent(){}

    public Parent(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}

final class Adress{ // implements Serializable{
    String city;

    public Adress(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}