package com.esprit.tn.asmaabrouguicce2.Services;

import com.esprit.tn.asmaabrouguicce2.Domain.Vehicule;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface IVehiculeService {
    Vehicule addVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    Vehicule getVehicule(Long id);
    void deleteVehicule(Long id);
    List<Vehicule> getAllVehicules();
}
