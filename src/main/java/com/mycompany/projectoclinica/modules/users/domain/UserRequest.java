package com.mycompany.projectoclinica.modules.users.domain;

import com.mycompany.projectoclinica.modules.contacts.domain.ContactRequest;
import com.mycompany.projectoclinica.modules.documents.domain.DocumentRequest;

public record UserRequest(String firstName,
                          String lastName,
                          Role role,
                          DocumentRequest document,
                          ContactRequest contact) { }
