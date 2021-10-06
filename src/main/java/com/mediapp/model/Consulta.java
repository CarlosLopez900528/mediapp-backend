package com.mediapp.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "id_medico", nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_medico"))
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "id_especialidad", nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_especialidad"))
    private Especialidad especialidad;

    @Column(name = "num_consultorio", length = 3, nullable = true)
    private String numConsultorio;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha; // ISODate yyyy-mm-ddTHH:mm:ss
    // Spring boot 1.5 -> pom.xml jsr310 UTC

    @OneToMany(mappedBy = "consulta", cascade = { CascadeType.ALL }, orphanRemoval = true)
    private List<DetalleConsulta> detalleConsulta;
}
