package com.example.dataBaseAccess;

public class Customer {
    private long id;
    private String FirstName, LastName;

    // Constructor
    public Customer(long id, String firstName, String lastName) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
    }

    @Override
    public String toString(){
        return String.format(
                "Customer [id=%d, FirstName='%s', lastNmae='%s'",
                id,FirstName,LastName);
    }

    //Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
