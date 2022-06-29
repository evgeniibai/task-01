package com.deca.example.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "add_info")
@NoArgsConstructor
@Getter
@Setter
public class AdditionalInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // TODO SEQUENCE
    @Column(name = "info_id")
    private Long infoId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Email(message = "") // TODO message, mb? regex
    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone_number", unique = true, columnDefinition = "User phone number.")
    private String phoneNumber;

    @OneToOne(mappedBy = "information",
            cascade = CascadeType.ALL, // TODO think about cascade
            fetch = FetchType.LAZY)
    private User user;

    //TODO toString
}
