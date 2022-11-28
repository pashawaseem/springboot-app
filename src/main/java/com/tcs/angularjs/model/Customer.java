package com.tcs.angularjs.model;
public class Customer {
    private String firstname;
    private String lastname;
    private int age;
    
    public Customer() {}
    
    public Customer(String firstname, String lastname, int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this. age = age;
    }
    
    // firstname
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    // lastname
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
