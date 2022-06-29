package com.deca.example.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "add_info")
@NoArgsConstructor
@Getter
@Setter
public class AdditionalInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // TODO SEQUENCE
    @Column(name = "info_id")
    private Long infoId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone_number", unique = true)
    private String phoneNumber;

    @OneToOne(mappedBy = "information",
            cascade = CascadeType.ALL, // TODO think about cascade
            fetch = FetchType.LAZY)
    private User user;

    //TODO toString
}
