package com.esprit.tn.asmaabrouguicce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContrat;

    LocalDate dateSignature;
    BigDecimal montantTotal;
    boolean valide;
    @OneToMany (mappedBy = "contrat",cascade = CascadeType.ALL)
    Set<Paiement> paiements;
    @OneToOne(mappedBy = "contrat", fetch = FetchType.LAZY)
    Reservation reservation;



}