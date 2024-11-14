package com.example.clinica_veterinaria.service;

import com.example.clinica_veterinaria.dto.MascoDuenioDTO;
import com.example.clinica_veterinaria.model.Mascota;
import com.example.clinica_veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;
    
    @Override
    public void createMascota(Mascota mascota) {
        mascoRepo.save(mascota);
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascoRepo.findAll();
    }

    @Override
    public Mascota getMascota(Long id_mascota) {
        return mascoRepo.findById(id_mascota).orElse(null);
    }

    @Override
    public void editMascota(Mascota mascota) {
        mascoRepo.save(mascota);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascoRepo.deleteById(id_mascota);
    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaCaniches = new ArrayList<Mascota>();
        for (Mascota masco : listaMascotas) {
            if (masco.getEspecie().equalsIgnoreCase("perro") && masco.getRaza().equalsIgnoreCase("caniche")) {
                listaCaniches.add(masco);
            }
        }
        return listaCaniches;
    }

    @Override
    public List<MascoDuenioDTO> getMascoDuenios() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<MascoDuenioDTO> listaMascoDuenio = new ArrayList<MascoDuenioDTO>();
        MascoDuenioDTO mascoDuenioDTO = new MascoDuenioDTO();
        
        for (Mascota masco : listaMascotas) {
            
            System.out.println(masco.getNombre());
            mascoDuenioDTO.setNombre_mascota(masco.getNombre());
            mascoDuenioDTO.setEspecie(masco.getEspecie());
            mascoDuenioDTO.setRaza(masco.getRaza());
            mascoDuenioDTO.setNombre_duenio(masco.getDuenio().getNombre());
            mascoDuenioDTO.setApellido_duenio(masco.getDuenio().getApellido());
            
            listaMascoDuenio.add(mascoDuenioDTO);
            mascoDuenioDTO = new MascoDuenioDTO(); //reseteo
        }
        return listaMascoDuenio;
    }
    
}
