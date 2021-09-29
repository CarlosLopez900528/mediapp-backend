package com.mediapp.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "especialidad")
public class Especialidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEspecalidad;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;
}
