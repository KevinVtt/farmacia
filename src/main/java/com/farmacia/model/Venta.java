package com.farmacia.model;


import org.bson.types.ObjectId;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;

@Entity("ventas")
@Data
public class Venta {

    @Id
    private ObjectId id;

    private String formaDePago;
    private Integer numeroTicket;
    private Float total;

    private Empleado empleadoAtencion;
    private Empleado empleadoCaja;
    private Sucursal sucursal;
    private Cliente cliente;

}
