package com.deca.example.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    //TODO think about implements Serializable interface
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // TODO SEQUENCE
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "uuid", nullable = false, unique = true, updatable = false)
    private String uuid;

    @NotBlank(message = "${Required}")
    @Size(min = 4, max = 32, message = "${Form.size.username}")
    @Column(name = "username", nullable = false, unique = true, updatable = false)
    private String username;

    @NotBlank(message = "${Required}")
    @Size(min = 8, message = "${Form.size.password}")
    @Column(name = "password", nullable = false)
    private String password;

    @Transient
    private String confirmedPassword;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(name = "user_info")
    private AdditionalInformation information;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "user_role")
    private Role role;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "user_status")
    private Status status;

    @ManyToMany
    @JoinTable(name = "users_fruits" ,
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "fruit_id"))
    private List<Fruit> fruits;

    @Override
    public String toString() {
        return uuid + ": " +
                username + " [ " +
                fruits + " ] " +
                "<" + status + ">";
    }
}
