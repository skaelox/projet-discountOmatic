package fr.dawan.discountomatic.dto;

import java.io.Serializable;

public class SupplierDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String firstName;

	private String lastName;

	private int siret;

	private int phoneNumber;

	private String password;

	private String mail;

	public SupplierDto() {
		super();
	}

	public SupplierDto(String firstName, String lastName, int siret, int phoneNumber, String password, String mail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.siret = siret;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.mail = mail;
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

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
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
	
	

}
