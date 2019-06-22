package com.akademiakodu.demo.models;

import com.akademiakodu.demo.models.Forms.PersonForm;

import javax.persistence.*;


@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String lastname;
    private int age;
    private String phone;
    private String email;

    public Person(){ }

    public Person(PersonForm personForm){
        name=personForm.getName();
        lastname=personForm.getLastname();
        age=personForm.getAge();
        phone=personForm.getPhone();
        email=personForm.getEmail();
    }

    public Person(String name, String lastname, int age, String phone, String email) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
