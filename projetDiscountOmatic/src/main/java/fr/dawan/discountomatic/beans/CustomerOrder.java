package fr.dawan.discountomatic.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_order_id")
    private long customerOrderId;
    
    @OneToOne(optional = false)
    private Customer customer;  
    
    @Column(name = "customer_order_purchase_date")
    private Date purchaseDate;
    
    @Column(name = "customer_order_delivery_address")
    private Address deliveryAddress;
    
    @ManyToMany
    @JoinTable(name="Order_Customer", joinColumns = {@JoinColumn(name="articleId")}, inverseJoinColumns = {@JoinColumn(name="customerOrderId")})
    @Column(name = "customer_order_list_article")
    private List<Article> listArticle;
    
    @Version
    private int version;
    
  

    public long getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(long customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<Article> getListArticle() {
        return listArticle;
    }

    public void setListArticle(List<Article> listArticle) {
        this.listArticle = listArticle;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public CustomerOrder() {
        super();
    }

	public CustomerOrder(long customerOrderId, Customer customer, Date purchaseDate, Address deliveryAddress,
			List<Article> listArticle, int version) {
		super();
		this.customerOrderId = customerOrderId;
		this.customer = customer;
		this.purchaseDate = purchaseDate;
		this.deliveryAddress = deliveryAddress;
		this.listArticle = listArticle;
		this.version = version;
	}

 
    
    
}
