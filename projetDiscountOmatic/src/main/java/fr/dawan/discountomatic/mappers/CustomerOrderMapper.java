package fr.dawan.discountomatic.mappers;

import java.util.stream.Collectors;

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
            mapper.map(src->CustomerMapper.toDto(src.getCustomer()), CustomerOrderDto::setCustomerDto);
            mapper.map(src->src.getPurchaseDate(), CustomerOrderDto::setPurchaseDate);
            mapper.map(src->src.getDeliveryAddress(), CustomerOrderDto::setDeliveryAddress);
            mapper.map(src->src.getListArticle().stream().map(ArticleMapper::toDto).collect(Collectors.toList()), CustomerOrderDto::setListArticleDto);
            
        });
    return mapper.map(co, CustomerOrderDto.class);
    }
    
//    public static CustomerOrder fromDto(CustomerOrderDto coDto) {
//        mapper.typeMap(CustomerOrderDto.class, CustomerOrder.class).addMappings(mapper -> {
//            mapper.map(src->src.getCustomerOrderId(), CustomerOrder::setCustomerOrderId);
//            mapper.map(src->src.getCustomer(), CustomerOrder::setCustomer);
//            mapper.map(src->src.getPurchaseDate(), CustomerOrder::setPurchaseDate);
//            mapper.map(src->src.getDeliveryAddress(), CustomerOrder::setDeliveryAddress);
//            mapper.map(src->src.getListArticle(), CustomerOrder::setListArticle);
//            
//        });
//    return mapper.map(coDto, CustomerOrder.class);
//    }
}
