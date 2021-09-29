package com.mediapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "rol")
public class Rol {

    @Id
    private Integer idRol;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

}
