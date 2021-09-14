package com.mediapp.repo;

import com.mediapp.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepo extends JpaRepository<Paciente,Integer> {
}
