package com.mediapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "examen")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idExamen;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;
}
