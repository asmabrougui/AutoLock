package com.esprit.tn.asmaabrouguicce2.Repository;

import com.esprit.tn.asmaabrouguicce2.Domain.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IVehiculeRepository extends JpaRepository<Vehicule, Long> {
}
