package com.esprit.tn.asmaabrouguicce2.web.controller;

import com.esprit.tn.asmaabrouguicce2.Domain.Vehicule;
import com.esprit.tn.asmaabrouguicce2.Services.IVehiculeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;
@Tag(name = "VehiculeAsma" , description = "Gestion Vehicules")
@RestController
@RequestMapping("/vehicules")
@RequiredArgsConstructor
public class VehiculeController {
    private final IVehiculeService iVehiculeService;
    @Operation(summary = "Ajouter Vehicules")

    @PostMapping
    Vehicule createVehicule(@RequestBody Vehicule vehicule) {
        return iVehiculeService.addVehicule(vehicule);
    }
    @GetMapping("/{id}")
    Vehicule getVehicule(@PathVariable Long id) {
        return iVehiculeService.getVehicule(id);
    }
    @PutMapping("{id}")
    Vehicule modifyVehicule(@PathVariable Long id, @RequestBody Vehicule vehicule) {
        return iVehiculeService.updateVehicule(vehicule);
    }
    @DeleteMapping("{id}")
    void deleteVehicule(@PathVariable Long id) {
        iVehiculeService.deleteVehicule(id);
    }
    @GetMapping
    List<Vehicule> getAllVehicules() {
        return iVehiculeService.getAllVehicules();

    }
    @PutMapping("/assign/{idVehicule}/{idAgence}")
    Vehicule assignToAgence(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        return iVehiculeService.assignToAgence(idVehicule, idAgence);
    }
    @PutMapping("/assign-equipement/{idVehicule}/{idEquipement}")
    Vehicule assignToEquipements(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return iVehiculeService.assignToEquipements(idVehicule, idEquipement);
    }
    @PutMapping("/unassign/{idVehicule}")
    Vehicule unassignFromAgence(@PathVariable Long idVehicule) {
        return iVehiculeService.unassignFromAgence(idVehicule);
    }
    @PutMapping("/unassign-equipement/{idVehicule}/{idEquipement}")
    Vehicule unassignEquipement(@PathVariable Long idVehicule, @PathVariable Long idEquipement) {
        return iVehiculeService.unassignEquipement(idVehicule, idEquipement);
    }
}
