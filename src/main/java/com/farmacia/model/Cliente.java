package com.farmacia.model;

import dev.morphia.annotations.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity("clientes")
@Data
@EqualsAndHashCode(callSuper = true)
public class Cliente extends Usuario{

    private ObraSocial obraSocial;
}
