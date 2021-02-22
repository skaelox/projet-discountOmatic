package fr.dawan.discountomatic.mappers;

import org.modelmapper.ModelMapper;

import fr.dawan.discountomatic.beans.CustomerOrder;
import fr.dawan.discountomatic.dto.CustomerOrderDto;

public class CustomerOrderMapper {

    private static ModelMapper mapper;
    
    public CustomerOrderMapper() {
        mapper = new ModelMapper();
    }
    
    public static CustomerOrderDto toDto(CustomerOrder co) {
        mapper.typeMap(CustomerOrder.class, CustomerOrderDto.class).addMappings(mapper -> {
            mapper.map(src->src.getCustomerOrderId(), CustomerOrderDto::setCustomerOrderId);
            mapper.map(src->src.getCustomerId(), CustomerOrderDto::setCustomerId);
            mapper.map(src->src.getPurchaseDate(), CustomerOrderDto::setPurchaseDate);
            mapper.map(src->src.getDeliveryAddress(), CustomerOrderDto::setDeliveryAddress);
            mapper.map(src->src.getListArticle(), CustomerOrderDto::setListArticle);
            
        });
    return mapper.map(co, CustomerOrderDto.class);
    }
    
    public static CustomerOrder fromDto(CustomerOrderDto coDto) {
        mapper.typeMap(CustomerOrderDto.class, CustomerOrder.class).addMappings(mapper -> {
            mapper.map(src->src.getCustomerOrderId(), CustomerOrder::setCustomerOrderId);
            mapper.map(src->src.getCustomerId(), CustomerOrder::setCustomerId);
            mapper.map(src->src.getPurchaseDate(), CustomerOrder::setPurchaseDate);
            mapper.map(src->src.getDeliveryAddress(), CustomerOrder::setDeliveryAddress);
            mapper.map(src->src.getListArticle(), CustomerOrder::setListArticle);
            
        });
    return mapper.map(coDto, CustomerOrder.class);
    }
}
