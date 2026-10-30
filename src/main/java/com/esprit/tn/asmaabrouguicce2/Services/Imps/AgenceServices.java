package com.esprit.tn.asmaabrouguicce2.Services.Imps;

import com.esprit.tn.asmaabrouguicce2.Domain.Agence;
import com.esprit.tn.asmaabrouguicce2.Repository.IAgenceRepository;
import com.esprit.tn.asmaabrouguicce2.Services.IAgenceService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServices implements IAgenceService {

    private final IAgenceRepository iAgenceRepository;

    @Override
    public Agence addAgence(Agence agence) {
        return iAgenceRepository.save(agence);
    }

    @Override
    public Agence getAgence(Long id) {
        return iAgenceRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException());
    }

    @Override
    public List<Agence> getAllAgences() {
        return iAgenceRepository.findAll();
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return iAgenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(Long id) {
        iAgenceRepository.deleteById(id);
    }
}