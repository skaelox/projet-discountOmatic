package fr.dawan.discountomatic.mappers;

import org.modelmapper.ModelMapper;

import fr.dawan.discountomatic.beans.Supplier;
import fr.dawan.discountomatic.dto.SupplierDto;

public class SupplierMapper {
	
	
	
	public static SupplierDto toDto(Supplier s) {
		ModelMapper m = new ModelMapper();
		m.typeMap(Supplier.class, SupplierDto.class).addMappings(mapper -> {
			mapper.map(src -> src.getFirstName(), SupplierDto::setFirstName);
			mapper.map(src -> src.getLastName(), SupplierDto::setLastName);
			mapper.map(src -> src.getSiret(), SupplierDto::setSiret);
			mapper.map(src -> src.getPhoneNumber(), SupplierDto::setPhoneNumber);
			mapper.map(src -> src.getPassword(), SupplierDto::setPassword);
			mapper.map(src -> src.getMail(), SupplierDto::setMail);
		});
		return m.map(s, SupplierDto.class);
	}

}
