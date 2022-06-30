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

    @Email(message = "${not.valid.email}")
    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "phone_number", unique = true, columnDefinition = "User phone number.")
    private String phoneNumber;

    @OneToOne(mappedBy = "information",
            cascade = {CascadeType.PERSIST,
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    private User user;

    @Override
    public String toString() {
        return firstName + ", " +
                lastName + "[ " +
                email + ", " +
                phoneNumber + " ]";
    }
}
