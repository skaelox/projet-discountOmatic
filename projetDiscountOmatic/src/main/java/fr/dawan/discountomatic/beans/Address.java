package fr.dawan.discountomatic.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "address_id")
	private long addressId;
	
	@Column(name = "address_street")
	private String  street;
	
	@Column(name = "address_number")
	private int number;
	
	@Column(name = "address_city")
	private String city;
	
	@Column(name = "address_country")
	private String country;
	
	@Version
	private int version;

	public Address() {
		super();
	}

	public Address(long addressId, String street, int number, String city, String country) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.number = number;
		this.city = city;
		this.country = country;
	}
	
	@OneToOne
	private Supplier supplier;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
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

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	
	
	
}
