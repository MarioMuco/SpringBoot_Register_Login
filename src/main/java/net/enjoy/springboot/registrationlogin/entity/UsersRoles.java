package net.enjoy.springboot.registrationlogin.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "users_roles")
@IdClass(UserRolesId.class)
public class UsersRoles {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "ID", nullable = false)
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "ID", nullable = false)
    private Role role;
}
