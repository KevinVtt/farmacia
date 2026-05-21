package com.farmacia.model;

import java.util.List;

import org.bson.types.ObjectId;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;

@Entity("ventas_detalles")
@Data
public class VentaDetalle {
    @Id
    private ObjectId id;

    private Integer cantidad;
    private Float precioUnitario;
    private Float total;
    private Venta venta;
    private List<Producto> productos;
}
