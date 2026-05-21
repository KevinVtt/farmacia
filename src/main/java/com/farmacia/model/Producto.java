package com.farmacia.model;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;

@Entity("productos")
@Data
public class Producto {

    @Id
    private ObjectId id;

    private String descripcion;
    private String tipoProducto;
    private Integer codigo;
    private Float precio;
    private String laboratorio;
}
