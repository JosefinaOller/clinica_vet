package com.example.clinica_veterinaria.service;

import com.example.clinica_veterinaria.model.Duenio;
import com.example.clinica_veterinaria.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService {

    @Autowired
    private IDuenioRepository duenioRepo;
    
    @Override
    public void createDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public List<Duenio> getDuenios() {
        return duenioRepo.findAll();
    }

    @Override
    public Duenio getDuenio(Long id_duenio) {
        return duenioRepo.findById(id_duenio).orElse(null);
    }

    @Override
    public void editDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id_duenio) {
        duenioRepo.deleteById(id_duenio);
    }
    
}
