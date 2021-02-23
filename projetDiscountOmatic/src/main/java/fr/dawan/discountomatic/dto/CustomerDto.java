package fr.dawan.discountomatic.dto;

import java.io.Serializable;

import fr.dawan.discountomatic.beans.Address;


public class CustomerDto implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private long customerId;

    private String firstName;

    private String lastName;

    private String phoneNumber;
    
    private String password;

    private String mail;
    
    private String gender;  
    
    private AddressDto adress;

    public CustomerDto(long customerId, String firstName, String lastName, String phoneNumber, String password,
            String mail, String gender, AddressDto adress) {
        super();
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.mail = mail;
        this.gender = gender;
        this.adress = adress;
    }

    public AddressDto getAdress() {
        return adress;
    }

    public void setAdress(AddressDto aDto) {
        this.adress = aDto;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
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


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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

    
    
    
}
