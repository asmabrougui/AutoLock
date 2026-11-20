package com.esprit.tn.asmaabrouguicce2.Services;

import com.esprit.tn.asmaabrouguicce2.Domain.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement addEquipement(Equipement equipement);
    Equipement updateEquipement(Equipement equipement);
    Equipement getEquipement(Long id);
    void deleteEquipement(Long id);
    List<Equipement> getAllEquipements();
}