package com.mycompany.projectoclinica.modules.documents.domain;

import com.mycompany.projectoclinica.modules.users.domain.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "documents")
@Getter
@Setter
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "document_type")
    private DocumentType documentType;

    @Column(name = "number", length = 32)
    private String number;

    @Column(name = "valid_until")
    private LocalDate validUntil;

    @OneToOne(mappedBy = "document", orphanRemoval = true)
    private User user;

}
