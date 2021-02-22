package fr.dawan.discountomatic.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import fr.dawan.discountomatic.beans.Article;

public class CustomerOrderDto implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private long customerOrderId;
    
    private String customerId;
    
    private Date purchaseDate;
    
    private String deliveryAddress;
    
    private List<Article> listArticle;

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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    public CustomerOrderDto() {
        super();
    }

    public CustomerOrderDto(long customerOrderId, String customerId, Date purchaseDate, String deliveryAddress,
            List<Article> listArticle) {
        super();
        this.customerOrderId = customerOrderId;
        this.customerId = customerId;
        this.purchaseDate = purchaseDate;
        this.deliveryAddress = deliveryAddress;
        this.listArticle = listArticle;
    }
    
    
}
