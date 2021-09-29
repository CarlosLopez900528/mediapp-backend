package com.mediapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cosulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idConsulta;

    @ManyToOne
    @JoinColumn(name = "id_paciente", nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_paciente"))
    private Paciente paciente;
}
