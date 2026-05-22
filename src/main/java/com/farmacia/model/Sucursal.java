package com.farmacia.model;

import java.util.List;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;

@Entity("sucursales")
@Data
public class Sucursal {
    @Id
    private Long id;
    private Integer puntoVenta;
    private Domicilio domicilio;
    //private Empleado encargado; 
    private List<Empleado> empleados; // Utilizo una lista para todos los empleados, incluyendo al encargado
    private List<Venta> ventas;
}
