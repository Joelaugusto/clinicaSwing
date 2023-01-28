package com.mycompany.projectoclinica.modules.users.domain;


import com.mycompany.projectoclinica.modules.contacts.domain.Contact;
import com.mycompany.projectoclinica.modules.documents.domain.Document;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "document_id")
    private Document document;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "contact_id")
    private Contact contact;
}
