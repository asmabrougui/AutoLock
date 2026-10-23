package com.esprit.tn.asmaabrouguicce2.Services.Imps;

import com.esprit.tn.asmaabrouguicce2.Domain.Vehicule;
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
        return List.of();
    }
}