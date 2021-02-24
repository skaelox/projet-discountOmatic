package fr.dawan.discountomatic.mappers;

import org.modelmapper.ModelMapper;

import fr.dawan.discountomatic.beans.Customer;
import fr.dawan.discountomatic.dto.CustomerDto;

public class CustomerMapper {
    
    private static ModelMapper mapper  = new ModelMapper();

    public static CustomerDto toDto(Customer c) {
        
        System.out.println(c);
        System.out.println(mapper);
        mapper.typeMap(Customer.class, CustomerDto.class).addMappings(mapper -> {
            mapper.map(src->src.getCustomerId(), CustomerDto::setCustomerId);
            mapper.map(src->src.getFirstName(), CustomerDto::setFirstName);
            mapper.map(src->src.getLastName(), CustomerDto::setLastName);
            mapper.map(src->src.getPhoneNumber(), CustomerDto::setPhoneNumber);
            mapper.map(src->src.getPassword(), CustomerDto::setPassword);
            mapper.map(src->src.getMail(), CustomerDto::setMail);
            mapper.map(src->src.getGender(), CustomerDto::setGender);
            mapper.map(src->AddressMapper.toDto(src.getAddress()), CustomerDto::setAdress);
        });
        System.out.println(mapper.map(c, CustomerDto.class));
        return mapper.map(c, CustomerDto.class);
    }
        
    public static Customer fromDto(CustomerDto cDto) {
        mapper.typeMap(CustomerDto.class, Customer.class).addMappings(mapper -> {
            mapper.map(src->src.getCustomerId(), Customer::setCustomerId);
            mapper.map(src->src.getFirstName(), Customer::setFirstName);
            mapper.map(src->src.getLastName(), Customer::setLastName);
            mapper.map(src->src.getPhoneNumber(), Customer::setPhoneNumber);
            mapper.map(src->src.getPassword(), Customer::setPassword);
            mapper.map(src->src.getMail(), Customer::setMail);
            mapper.map(src->src.getGender(), Customer::setGender);
            mapper.map(src-> AddressMapper.fromDto(src.getAdress()), Customer::setAddress);
        });
        return mapper.map(cDto, Customer.class);
    }
}

    