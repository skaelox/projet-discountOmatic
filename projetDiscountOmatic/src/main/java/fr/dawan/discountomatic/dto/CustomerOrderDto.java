package fr.dawan.discountomatic.dto;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import fr.dawan.discountomatic.beans.Address;
import fr.dawan.discountomatic.beans.Article;
import fr.dawan.discountomatic.beans.Customer;

public class CustomerOrderDto implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private long customerOrderId;
    
    private CustomerDto customerDto;
    
    private Date purchaseDate;
    
    private AddressDto deliveryAddress;
    
    private List<ArticleDto> listArticleDto;

    public CustomerOrderDto() {
        super();
    }

    

    public CustomerOrderDto(long customerOrderId, CustomerDto customerDto, Date purchaseDate,
            AddressDto deliveryAddress, List<ArticleDto> listArticleDto) {
        super();
        this.customerOrderId = customerOrderId;
        this.customerDto = customerDto;
        this.purchaseDate = purchaseDate;
        this.deliveryAddress = deliveryAddress;
        this.listArticleDto = listArticleDto;
    }



    public static long getSerialversionuid() {
        return serialVersionUID;
    }



    public void setDeliveryAddress(AddressDto deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }



    public long getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(long customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public CustomerDto getCustomerDto() {
        return customerDto;
    }

    public void setCustomerDto(CustomerDto customerDto) {
        this.customerDto = customerDto;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public List<ArticleDto> getListArticleDto() {
        return listArticleDto;
    }

    public void setListArticleDto(List<ArticleDto> listArticleDto) {
        this.listArticleDto = listArticleDto;
    }



    
}
