package com.mycompany.projectoclinica.modules.contacts.domain;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class ContactMapper {


    public static final ContactMapper CONTACT_MAPPER = Mappers.getMapper(ContactMapper.class);


    public Contact toContact(ContactRequest request) {

        Contact contact = new Contact();
        contact.setCity(request.city());
        contact.setCountry(request.country());
        contact.setEmail(request.email());
        contact.setNeighborhood(request.neighborhood());
        contact.setPhone(request.phone());
        contact.setAddressNumber(request.addressNumber());
        return contact;
    }

    public void toContact(ContactRequest request, Contact contact) {

        if (contact.getCity() != null)
            contact.setCity(request.city());
        if (contact.getCountry() != null)
            contact.setCountry(request.country());
        if (contact.getEmail() != null)
            contact.setEmail(request.email());
        if (contact.getNeighborhood() != null)
            contact.setNeighborhood(request.neighborhood());
        if (contact.getPhone() != null)
            contact.setPhone(request.phone());
        if (contact.getAddressNumber() != null)
            contact.setAddressNumber(request.addressNumber());
    }


}
