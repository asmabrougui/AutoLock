package com.esprit.tn.asmaabrouguicce2.web.controller;

import com.esprit.tn.asmaabrouguicce2.Domain.Agence;
import com.esprit.tn.asmaabrouguicce2.Services.IAgenceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "AgenceAsma", description = "Gestion Agences")
@RestController
@RequestMapping("/agences")
@RequiredArgsConstructor
public class AgenceController {

    private final IAgenceService iAgenceService;

    @Operation(summary = "Ajouter Agence")
    @PostMapping
    Agence createAgence(@RequestBody Agence agence) {
        return iAgenceService.addAgence(agence);
    }

    @Operation(summary = "Afficher une Agence")
    @GetMapping("/{id}")
    Agence getAgence(@PathVariable Long id) {
        return iAgenceService.getAgence(id);
    }

    @Operation(summary = "Afficher toutes les Agences")
    @GetMapping
    List<Agence> getAllAgences() {
        return iAgenceService.getAllAgences();
    }

    @Operation(summary = "Modifier Agence")
    @PutMapping("/{id}")
    Agence modifyAgence(@PathVariable Long id, @RequestBody Agence agence) {
        agence.setIdAgence(id);
        return iAgenceService.updateAgence(agence);
    }

    @Operation(summary = "Supprimer Agence")
    @DeleteMapping("/{id}")
    void deleteAgence(@PathVariable Long id) {
        iAgenceService.deleteAgence(id);
    }
}