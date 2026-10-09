package com.esprit.tn.asmaabrouguicce2.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPaiement;

    BigDecimal montant;
    LocalDate datePaiement;

    @Enumerated(EnumType.STRING)
    ModePaiement modePaiement;


}