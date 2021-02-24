package fr.dawan.discountomatic.forms;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UpdateAccountForm {    
    @NotEmpty
    private String gender;
    
    @NotEmpty
    @Size(min = 2, max = 50)
    private String prenom;
    
    @NotEmpty
    @Size(min = 2, max = 50)
    private String nom;
    
    @NotEmpty
    @Size(min = 2, max = 40)
    private String phone_number;
    
    @NotEmpty
    @Size(min = 2, max = 40)
    private String street;
    
    @NotEmpty
    @Size(min = 1, max = 40)
    private String number;
    
    @NotEmpty
    @Size(min = 2, max = 40)
    private String city;
    
    @NotEmpty
    @Size(min = 2, max = 40)
    private String country;
  
    public UpdateAccountForm() {
        
    }
    
    

    public UpdateAccountForm(@NotEmpty String gender, @NotEmpty @Size(min = 2, max = 50) String prenom,
            @NotEmpty @Size(min = 2, max = 50) String nom, @NotEmpty @Size(min = 2, max = 40) String phone_number,
            @NotEmpty @Size(min = 2, max = 40) String street, @NotEmpty @Size(min = 1, max = 40) String number,
            @NotEmpty @Size(min = 2, max = 40) String city, @NotEmpty @Size(min = 2, max = 40) String country) {
        super();
        this.gender = gender;
        this.prenom = prenom;
        this.nom = nom;
        this.phone_number = phone_number;
        this.street = street;
        this.number = number;
        this.city = city;
        this.country = country;
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



    public String getCity() {
        return city;
    }



    public void setCity(String city) {
        this.city = city;
    }



    public String getCountry() {
        return country;
    }



    public void setCountry(String country) {
        this.country = country;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
   
}
