package fr.dawan.discountomatic.mappers;

import org.modelmapper.ModelMapper;

import fr.dawan.discountomatic.beans.Address;
import fr.dawan.discountomatic.dto.AddressDto;


public class AddressMapper {
	
	public static AddressDto toDto(Address a) {
		ModelMapper m = new ModelMapper();
		m.typeMap(Address.class, AddressDto.class).addMappings(mapper -> {
			mapper.map(src -> src.getStreet(), AddressDto::setStreet);
			mapper.map(src -> src.getNumber(), AddressDto::setNumber);
			mapper.map(src -> src.getCity(), AddressDto::setCity);
			mapper.map(src -> src.getCountry(), AddressDto::setCountry);
	
		});
		return m.map(a, AddressDto.class);
	}

}
