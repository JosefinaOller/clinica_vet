package com.example.clinica_veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Duenio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "table_gen_duenio")
    @TableGenerator(name = "table_gen_duenio", table = "hibernate_sequence", pkColumnName = "sequence_name", valueColumnName = "next_val", pkColumnValue = "duenio_seq", allocationSize = 1)
    private Long id_duenio;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;

    public Duenio() {
    }

    public Duenio(Long id_duenio, String dni, String nombre, String apellido, String celular) {
        this.id_duenio = id_duenio;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
    
}
