package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.dto.MascoDuenioDTO;
import com.example.clinica_veterinaria.model.Duenio;
import com.example.clinica_veterinaria.model.Mascota;
import com.example.clinica_veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService mascoService;
    
    @PostMapping("/mascota/crear")
    public String createMascota(@RequestBody Mascota mascota){
        mascoService.createMascota(mascota);
        return "Mascota creada correctamente";
    }
    
    @GetMapping("/mascota/traer")
    public List<Mascota> getMascotas(){
        return mascoService.getMascotas();
    }
    
    @GetMapping("/mascota/traer/{id}")
    public Mascota getMascota(@PathVariable Long id){
        return mascoService.getMascota(id);
    }
    
    @PutMapping("/mascota/editar")
    public Mascota editMascota(@RequestBody Mascota mascota){
        mascoService.editMascota(mascota);
        return mascoService.getMascota(mascota.getId_mascota());
    }
    
    @DeleteMapping("/mascota/eliminar/{id}")
    public String deleteMascota(@PathVariable Long id){
        mascoService.deleteMascota(id);
        return "Mascota eliminada correctamente";
    }
    
    @GetMapping("/mascota/traer-caniches")
    public List<Mascota> getCaniches(){
        return mascoService.getCaniches();
    }
    
    @GetMapping("/mascota/traer-duenios")
    public List<MascoDuenioDTO> getMascoDuenios(){
        return mascoService.getMascoDuenios();
    }
    
}
