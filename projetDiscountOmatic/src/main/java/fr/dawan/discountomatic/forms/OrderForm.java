package fr.dawan.discountomatic.forms;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class OrderForm {
    
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
    
    @NotEmpty
    @Size(min = 2, max = 40)
    private String numCb;
    
    @NotEmpty
    @Size(min = 2, max = 40)
    private String ownerCb;
    
    @NotEmpty
    @Size(min = 2, max = 40)
    private String cryptoCb;

    public OrderForm() {

    }

    public OrderForm(@NotEmpty @Size(min = 2, max = 40) String street, @NotEmpty @Size(min = 1, max = 40) String number,
            @NotEmpty @Size(min = 2, max = 40) String city, @NotEmpty @Size(min = 2, max = 40) String country,
            @NotEmpty @Size(min = 2, max = 40) String numCb, @NotEmpty @Size(min = 2, max = 40) String ownerCb,
            @NotEmpty @Size(min = 2, max = 40) String cryptoCb) {
        super();
        this.street = street;
        this.number = number;
        this.city = city;
        this.country = country;
        this.numCb = numCb;
        this.ownerCb = ownerCb;
        this.cryptoCb = cryptoCb;
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

    public String getNumCb() {
        return numCb;
    }

    public void setNumCb(String numCb) {
        this.numCb = numCb;
    }

    public String getOwnerCb() {
        return ownerCb;
    }

    public void setOwnerCb(String ownerCb) {
        this.ownerCb = ownerCb;
    }

    public String getCryptoCb() {
        return cryptoCb;
    }

    public void setCryptoCb(String cryptoCb) {
        this.cryptoCb = cryptoCb;
    }
}
