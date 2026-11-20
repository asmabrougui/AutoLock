package com.esprit.tn.asmaabrouguicce2.Services.Imps;

import com.esprit.tn.asmaabrouguicce2.Domain.Agence;
import com.esprit.tn.asmaabrouguicce2.Domain.Equipement;
import com.esprit.tn.asmaabrouguicce2.Domain.Vehicule;
import com.esprit.tn.asmaabrouguicce2.Repository.IAgenceRepository;
import com.esprit.tn.asmaabrouguicce2.Repository.IEquipementRepository;
import com.esprit.tn.asmaabrouguicce2.Repository.IVehiculeRepository;
import com.esprit.tn.asmaabrouguicce2.Services.IVehiculeService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServices implements IVehiculeService {

    private final IVehiculeRepository iVehiculeRepository;
    private final IAgenceRepository iAgenceRepository;
    private final IEquipementRepository iEquipementRepository;

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getVehicule(Long id) {
        return iVehiculeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        iVehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return iVehiculeRepository.findAll();
    }
    @Override
    public Vehicule assignToAgence(Long idVehicule,Long idAgence) {
        Vehicule vehicule = getVehicule(idVehicule);
        Agence agence = iAgenceRepository.findById(idAgence)
                .orElseThrow(() -> new EntityNotFoundException());
        vehicule.setAgence(agence);
        return iVehiculeRepository.save(vehicule);

    }
    @Override
    public Vehicule assignToEquipements(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = getVehicule(idVehicule);
        Equipement equipement = iEquipementRepository.findById(idEquipement)
                .orElseThrow(() -> new EntityNotFoundException());
        vehicule.getEquipements().add(equipement);
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule unassignFromAgence(Long idVehicule) {
        Vehicule vehicule = getVehicule(idVehicule);
        vehicule.setAgence(null);
        return iVehiculeRepository.save(vehicule);
    }
    @Override
    public Vehicule unassignEquipement(Long idVehicule, Long idEquipement) {
        Vehicule vehicule = getVehicule(idVehicule);
        Equipement equipement = iEquipementRepository.findById(idEquipement)
                .orElseThrow(() -> new EntityNotFoundException());
        vehicule.getEquipements().remove(equipement);
        return iVehiculeRepository.save(vehicule);
    }


}