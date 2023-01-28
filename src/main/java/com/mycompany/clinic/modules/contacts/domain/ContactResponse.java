package com.mycompany.clinic.modules.contacts.domain;

public record ContactResponse(Long id,String phone, String emergencyNumber, String email, String country, String city, String neighborhood, String addressNumber) {
}
