package fr.dawan.discountomatic.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Supplier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "supplier_id")
	private long supplierId;
	
	@Column(name = "supplier_first_name")
	private String firstName;
	
	@Column(name = "supplier_last_name")
	private String lastName;
	
	@Column(name = "supplier_siret_number")
	private int siret;
	
	@Column(name = "supplier_phone_number")
	private int phoneNumber;
	
	@Column(name = "supplier_password")
	private String password;
	
	@Column(name = "supplier_mail")
	private String mail;
	
	@OneToOne
	private Address address;
	

	public Supplier(long supplierId, String firstName, String lastName, int siret, int phoneNumber, String password,
			String mail) {
		super();
		this.supplierId = supplierId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.siret = siret;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.mail = mail;
	}

	public Supplier() {
		super();
	}

	public long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
	
	
	
}
