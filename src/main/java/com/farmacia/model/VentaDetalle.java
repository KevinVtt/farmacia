package com.farmacia.model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;

@Entity("ventas_detalles")
@Data
public class VentaDetalle {

    @Id
    private Long id;

    private Integer cantidad;
    private Float precioUnitario;
    private Float total;
    private Producto producto;
}
