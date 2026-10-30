package com.esprit.tn.asmaabrouguicce2.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

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
    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    @Enumerated(value = EnumType.STRING)
    private CategorieVehicule categorieVehicule;
    private BigDecimal tarifJournalier;
    @Enumerated(value = EnumType.STRING)

    private StatutVehicule statut;
    @JsonBackReference
    @ManyToOne
    Agence agence;
    @ManyToMany
    List<Equipement> equipements;
    @OneToMany(mappedBy = "vehicule" , cascade = CascadeType.PERSIST , fetch = FetchType.LAZY)
    List<Maintenance> maintenances;






}
