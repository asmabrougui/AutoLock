package com.esprit.tn.asmaabrouguicce2.Services;

import com.esprit.tn.asmaabrouguicce2.Domain.Vehicule;
import com.esprit.tn.asmaabrouguicce2.web.dto.VehiculeDto;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface IVehiculeService {
    Vehicule addVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    Vehicule getVehicule(Long id);
    void deleteVehicule(Long id);
    List<Vehicule> getAllVehicules();
    Vehicule assignToAgence(Long idVehicule,Long idAgence);
    Vehicule assignToEquipements(Long idVehicule,Long idEquipement);
    Vehicule unassignFromAgence(Long idVehicule);
    Vehicule unassignEquipement(Long idVehicule, Long idEquipement);
    Vehicule addVehiculeAndAssignToAgence(Vehicule vehicule, Long agenceId);
    //VehiculeDto toDto(Vehicule vehicule);
    VehiculeDto getVehiculeDto(Long id);
    }
