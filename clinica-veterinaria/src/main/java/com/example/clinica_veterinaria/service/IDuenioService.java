package com.example.clinica_veterinaria.service;

import com.example.clinica_veterinaria.model.Duenio;
import java.util.List;

public interface IDuenioService {
    
    public void createDuenio(Duenio duenio);
    
    public List<Duenio> getDuenios();
    
    public Duenio getDuenio(Long id_duenio);
    
    public void editDuenio(Duenio duenio);
    
    public void deleteDuenio(Long id_duenio);
    
    
}
