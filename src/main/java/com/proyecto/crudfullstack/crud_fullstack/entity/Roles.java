package com.proyecto.crudfullstack.crud_fullstack.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;
    private String name;
    public Roles() {
    }
    public Roles(Long idRole, String name) {
        this.idRole = idRole;
        this.name = name;
    }
    public Long getIdRole() {
        return idRole;
    }
    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Roles [idRole=" + idRole + ", name=" + name + "]";
    }

    



    

}
