package com.mycompany.clinic.modules.users.domain;

import com.mycompany.clinic.modules.contacts.domain.ContactRequest;
import com.mycompany.clinic.modules.documents.domain.DocumentRequest;

public record UserRequest(String firstName,
                          String lastName,
                          Role role,
                          DocumentRequest document,
                          ContactRequest contact) { }
