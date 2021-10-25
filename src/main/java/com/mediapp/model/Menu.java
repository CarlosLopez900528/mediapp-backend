package com.mediapp.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "menu_rol", joinColumns = @JoinColumn(name = "id_menu", referencedColumnName = "idMenu"), inverseJoinColumns = @JoinColumn(name = "id_rol", referencedColumnName = "idRol"))
    private List<Rol> roles;

}
