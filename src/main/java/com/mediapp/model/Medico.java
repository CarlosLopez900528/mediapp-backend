package com.mediapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "medico")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMedico;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "cmp")
    private String cmp;

    @Column(name = "fotoUrl")
    private String fotoUrl;

}
