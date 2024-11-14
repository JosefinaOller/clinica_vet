package com.example.clinica_veterinaria.service;

import com.example.clinica_veterinaria.dto.MascoDuenioDTO;
import com.example.clinica_veterinaria.model.Mascota;
import java.util.List;


public interface IMascotaService {
    
    public void createMascota(Mascota mascota);
    
    public List<Mascota> getMascotas();
    
    public Mascota getMascota(Long id_mascota);
    
    public void editMascota(Mascota mascota);
    
    public void deleteMascota(Long id_mascota);
    
    public List<Mascota> getCaniches();
    
    public List<MascoDuenioDTO> getMascoDuenios();
    
}
