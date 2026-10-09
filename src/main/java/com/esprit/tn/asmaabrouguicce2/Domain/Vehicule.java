package com.esprit.tn.asmaabrouguicce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)



public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    @Enumerated(value = EnumType.STRING)
    private CategorieVehicule categorieVehicule;
    private BigDecimal tarifJournalier;
    @Enumerated(value = EnumType.STRING)

    private StatutVehicule statut;



}
