package com.mycompany.projectoclinica.modules.contacts.domain;


import com.mycompany.projectoclinica.modules.users.domain.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "contacts")
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String phone;
    private String emergencyNumber;
    private String email;
    private String country;
    private String city;
    private String neighborhood;
    private String addressNumber;

    @OneToOne(mappedBy = "contact", orphanRemoval = true)
    private User user;

}
