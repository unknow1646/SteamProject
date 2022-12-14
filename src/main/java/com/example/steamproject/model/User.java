package com.example.steamproject.model;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Integer id;

    private String nombre;
    private String email;
    private String password;
}
