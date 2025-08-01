package com.proyecto.crudfullstack.crud_fullstack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String name;
    private String email;
    private String password;
    
    @ManyToOne // esto se define demuchos a uno 
    @JoinColumn(name = "id_role", nullable = false)
    private Roles role;

    public User() {
    }

    public User(Long idUser, String name, String email, String password, Roles role) {
        this.idUser = idUser;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User [idUser=" + idUser + ", name=" + name + ", email=" + email + ", password=" + password + ", role="
                + role + "]";
    }

    

    

    
    
    

}
