package fr.dawan.discountomatic.beans;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
    @JoinColumn(name = "customer_id", unique = true, nullable = false, updatable = false)
    private String customerId;  
    
    @Column(name = "customer_order_purchase_date")
    private Date purchaseDate;
    
    @Column(name = "customer_order_delivery_address")
    private String deliveryAddress;
    
    @ManyToMany
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

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
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

    public CustomerOrder(long customerOrderId, String customerId, Date purchaseDate, String deliveryAddress,
            List<Article> listArticle, int version) {
        super();
        this.customerOrderId = customerOrderId;
        this.customerId = customerId;
        this.purchaseDate = purchaseDate;
        this.deliveryAddress = deliveryAddress;
        this.listArticle = listArticle;
        this.version = version;
    }
    
    
}
