package com.farmacia.model;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;

@Entity("domicilios")
@Data
public class Domicilio {

    @Id
    private ObjectId id;
    
    private String calle;
    private String localidad;
    private String provincia;
    private Integer numero;
}
