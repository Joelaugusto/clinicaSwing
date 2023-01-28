package com.mycompany.projectoclinica.modules.contacts.domain;

public record ContactRequest(String phone, String emergencyNumber, String email, String country, String city, String neighborhood, String addressNumber) {
}
