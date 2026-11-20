package com.esprit.tn.asmaabrouguicce2.Repository;

import com.esprit.tn.asmaabrouguicce2.Domain.Equipement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEquipementRepository extends JpaRepository<Equipement, Long> {
}