package com.mediapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    private Integer idMenu;

    @Column(name = "icono")
    private String icono;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "url")
    private String url;
}
