package com.esprit.tn.asmaabrouguicce2.Services;

import com.esprit.tn.asmaabrouguicce2.Domain.Agence;

import java.util.List;

public interface IAgenceService {
    Agence addAgence(Agence agence);
    Agence getAgence(Long id);
    List<Agence> getAllAgences();
    Agence updateAgence(Agence agence);
    void deleteAgence(Long id);
}