package com.farmacia;

import com.farmacia.config.MongoDBConnection;
import com.farmacia.model.Domicilio;
import com.farmacia.model.Usuario;

import dev.morphia.Datastore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            
            MongoDBConnection.connect();
            Datastore datastore = MongoDBConnection.getDatastore();

            System.out.println("Conexion exitosa a MongoDB");
            
            Usuario usuario = new Usuario();
            Domicilio domicilio = new Domicilio();
            domicilio.setCalle("Calle Falsa");
            domicilio.setNumero(123);
            domicilio.setLocalidad("null");
            domicilio.setProvincia(":sadasas");
            usuario.setNombre("Juan");
            usuario.setDni(11234566);
            usuario.setDomicilio(domicilio);
            usuario.setApellido("Leoms");
            
            datastore.save(usuario);
            System.out.println("Base de datos conectada correctamente");
            System.out.println("Se ingreso el dato");

        } catch (Exception e) {

            System.out.println("Error conectando a MongoDB");
            e.printStackTrace();
        }
    }
}
