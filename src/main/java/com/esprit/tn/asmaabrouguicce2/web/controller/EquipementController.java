package com.esprit.tn.asmaabrouguicce2.web.controller;

import com.esprit.tn.asmaabrouguicce2.Domain.Equipement;
import com.esprit.tn.asmaabrouguicce2.Services.IEquipementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "EquipementAsma", description = "Gestion Equipements")
@RestController
@RequestMapping("/equipements")
@RequiredArgsConstructor
public class EquipementController {

    private final IEquipementService iEquipementService;

    @Operation(summary = "Ajouter Equipement")
    @PostMapping
    Equipement createEquipement(@RequestBody Equipement equipement) {
        return iEquipementService.addEquipement(equipement);
    }

    @Operation(summary = "Afficher un Equipement")
    @GetMapping("/{id}")
    Equipement getEquipement(@PathVariable Long id) {
        return iEquipementService.getEquipement(id);
    }

    @Operation(summary = "Modifier Equipement")
    @PutMapping("/{id}")
    Equipement modifyEquipement(@PathVariable Long id, @RequestBody Equipement equipement) {
        equipement.setIdEquipement(id);
        return iEquipementService.updateEquipement(equipement);
    }

    @Operation(summary = "Supprimer Equipement")
    @DeleteMapping("/{id}")
    void deleteEquipement(@PathVariable Long id) {
        iEquipementService.deleteEquipement(id);
    }

    @Operation(summary = "Afficher tous les Equipements")
    @GetMapping
    List<Equipement> getAllEquipements() {
        return iEquipementService.getAllEquipements();
    }
}