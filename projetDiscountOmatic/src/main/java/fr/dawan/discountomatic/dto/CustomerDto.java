package fr.dawan.discountomatic.dto;

import java.io.Serializable;


public class CustomerDto implements Serializable{

    private static final long serialVersionUID = 1L;

    private String firstName;

    private String lastName;

    private int phoneNumber;
    
    private String password;

    private String mail;
    
    private String gender;
    

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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public CustomerDto() {
        super();
    }

    public CustomerDto(String firstName, String lastName, int phoneNumber, String password, String mail,
            String gender) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.mail = mail;
        this.gender = gender;
    }
    
    
}
