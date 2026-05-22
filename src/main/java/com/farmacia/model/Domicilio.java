package com.farmacia.model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;

@Entity("domicilios")
@Data
public class Domicilio {

    @Id
    private Long id;
    
    private String calle;
    private String localidad;
    private String provincia;
    private Integer numero;
}
