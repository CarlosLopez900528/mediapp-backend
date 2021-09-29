package com.mediapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    private Integer idUsuario;

    @Column(name = "nombre")
    private String username;

    @Column(name = "clave")
    private String password;

    @Column(name = "estado")
    private boolean enabled;
}
