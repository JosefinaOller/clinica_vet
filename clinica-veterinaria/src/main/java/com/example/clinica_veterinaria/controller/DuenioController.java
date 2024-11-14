package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.model.Duenio;
import com.example.clinica_veterinaria.service.IDuenioService;
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
public class DuenioController {
    
    @Autowired
    private IDuenioService duenioService;
    
    @PostMapping("/duenio/crear")
    public String createDuenio(@RequestBody Duenio duenio){
        duenioService.createDuenio(duenio);
        return "Dueño creado correctamente";
    }
    
    @GetMapping("/duenio/traer")
    public List<Duenio> getPersonas(){
        return duenioService.getDuenios();
    }
    
    @GetMapping("/duenio/traer/{id}")
    public Duenio getPersona(@PathVariable Long id){
        return duenioService.getDuenio(id);
    }
    
    @PutMapping("/duenio/editar")
    public Duenio editDuenio(@RequestBody Duenio duenio){
        duenioService.editDuenio(duenio);
        return duenioService.getDuenio(duenio.getId_duenio());
    }
    
    @DeleteMapping("/duenio/eliminar/{id}")
    public String deleteDuenio(@PathVariable Long id){
        duenioService.deleteDuenio(id);
        return "Dueño eliminado correctamente";
    }
}
