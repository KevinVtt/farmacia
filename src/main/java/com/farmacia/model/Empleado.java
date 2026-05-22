package com.farmacia.model;

import dev.morphia.annotations.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity("empleados")
@Data
@EqualsAndHashCode(callSuper = true)
public class Empleado extends Usuario {

    private String cuil;
    private ObraSocial obraSocial;
    // private Sucursal sucursal;
    private String cargo; // Agrego el campo cargo para diferenciar entre encargado y empleados
}
