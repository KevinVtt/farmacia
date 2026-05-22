package com.farmacia.model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;

@Entity("obras_sociales")
@Data
public class ObraSocial {
    @Id
    private Long id;
    private String nombre;
    private String numeroAfiliado;
}
