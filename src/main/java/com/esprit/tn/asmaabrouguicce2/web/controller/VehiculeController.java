package com.esprit.tn.asmaabrouguicce2.web.controller;

import com.esprit.tn.asmaabrouguicce2.Domain.Vehicule;
import com.esprit.tn.asmaabrouguicce2.Services.IVehiculeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicules")
@RequiredArgsConstructor
public class VehiculeController {
    private final IVehiculeService iVehiculeService;
    @PostMapping
    Vehicule createVehicule(@RequestBody Vehicule vehicule) {
        return iVehiculeService.addVehicule(vehicule);
    }
    @GetMapping("/{id}")
    Vehicule getVehicule(@PathVariable Long id) {
        return iVehiculeService.getVehicule(id);
    }

}
