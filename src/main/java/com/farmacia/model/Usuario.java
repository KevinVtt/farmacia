package com.farmacia.model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;

@Entity("usuarios")
@Data
public class Usuario {
    @Id
    private Long id;

    private String nombre;
    private String apellido;
    private Integer dni;

    private Domicilio domicilio;

}
