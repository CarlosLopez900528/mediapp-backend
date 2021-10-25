package com.mediapp.repo;

import com.mediapp.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicoRepo extends JpaRepository<Medico,Integer> {
}
