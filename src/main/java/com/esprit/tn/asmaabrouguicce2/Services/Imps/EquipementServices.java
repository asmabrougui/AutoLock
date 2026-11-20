package com.esprit.tn.asmaabrouguicce2.Services.Imps;

import com.esprit.tn.asmaabrouguicce2.Domain.Equipement;
import com.esprit.tn.asmaabrouguicce2.Repository.IEquipementRepository;
import com.esprit.tn.asmaabrouguicce2.Services.IEquipementService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementServices implements IEquipementService {

    private final IEquipementRepository iEquipementRepository;

    @Override
    public Equipement addEquipement(Equipement equipement) {
        return iEquipementRepository.save(equipement);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return iEquipementRepository.save(equipement);
    }

    @Override
    public Equipement getEquipement(Long id) {
        return iEquipementRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public void deleteEquipement(Long id) {
        iEquipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return iEquipementRepository.findAll();
    }
}