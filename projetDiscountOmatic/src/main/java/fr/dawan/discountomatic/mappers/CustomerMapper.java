package fr.dawan.discountomatic.mappers;

import org.modelmapper.ModelMapper;

import fr.dawan.discountomatic.beans.Customer;
import fr.dawan.discountomatic.dto.CustomerDto;

public class CustomerMapper {
    
    private ModelMapper mapper;
    
    public CustomerMapper() {
        mapper = new ModelMapper();
    }
    
    public CustomerDto toDto(Customer c) {
        mapper.typeMap(CustomerDto.class, CustomerDto.class).addMappings(mapper -> {
           mapper.map(src->src.getFirstName(), CustomerDto::setFirstName);
           mapper.map(src->src.getLastName(), CustomerDto::setLastName);
           mapper.map(src->src.getPhoneNumber(), CustomerDto::setPhoneNumber);
           mapper.map(src->src.getPassword(), CustomerDto::setPassword);
           mapper.map(src->src.getMail(), CustomerDto::setMail);
           mapper.map(src->src.getGender(), CustomerDto::setGender);
           //TODO à rajouter le getAddress() => voir avec Hugo
        });
        return mapper.map(c, CustomerDto.class);
    }
        
    public Customer fromDto(Customer cDto) {
        mapper.typeMap(CustomerDto.class, Customer.class).addMappings(mapper -> {
            mapper.map(src->src.getFirstName(), Customer::setFirstName);
            mapper.map(src->src.getLastName(), Customer::setLastName);
            mapper.map(src->src.getPhoneNumber(), Customer::setPhoneNumber);
            mapper.map(src->src.getPassword(), Customer::setPassword);
            mapper.map(src->src.getMail(), Customer::setMail);
            mapper.map(src->src.getGender(), Customer::setGender);
            //TODO à rajouter le getAddress() => voir avec Hugo
        });
        return mapper.map(cDto, Customer.class);
    }
}

    