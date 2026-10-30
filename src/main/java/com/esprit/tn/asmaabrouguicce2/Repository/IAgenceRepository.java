package com.esprit.tn.asmaabrouguicce2.Repository;

import com.esprit.tn.asmaabrouguicce2.Domain.Agence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAgenceRepository extends JpaRepository<Agence, Long> {
}