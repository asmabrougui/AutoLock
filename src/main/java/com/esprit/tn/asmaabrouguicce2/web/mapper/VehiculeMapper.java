package com.esprit.tn.asmaabrouguicce2.web.mapper;

import com.esprit.tn.asmaabrouguicce2.Domain.Vehicule;
import com.esprit.tn.asmaabrouguicce2.web.dto.VehiculeDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface VehiculeMapper {
    @Mapping(source = "immatriculation", target = "immatriculation")
    @Mapping(source = "marque", target = "marque")
    @Mapping(source = "modele", target = "modele")
    @Mapping(source = "agence.nom", target = "nomAgence")
    @Mapping(source = "tarifJournalier", target = "tarif")
    VehiculeDto toDto(Vehicule vehicule);

}
