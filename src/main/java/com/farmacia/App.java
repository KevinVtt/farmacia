package com.farmacia;

import java.util.List;

import com.farmacia.config.MongoDBConnection;
import com.farmacia.model.Cliente;
import com.farmacia.model.Domicilio;
import com.farmacia.model.Empleado;
import com.farmacia.model.ObraSocial;
import com.farmacia.model.Producto;
import com.farmacia.model.Sucursal;
import com.farmacia.model.Usuario;
import com.farmacia.model.Venta;
import com.farmacia.model.VentaDetalle;

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
            
            Domicilio domicilio1 = new Domicilio();
            domicilio1.setCalle("Calle Falsa1");
            domicilio1.setNumero(1231);
            domicilio1.setLocalidad("Springfield1");
            domicilio1.setProvincia("Provincia Ejemplo1");
            datastore.save(domicilio1);

            Domicilio domicilio2 = new Domicilio();
            domicilio2.setCalle("Calle Falsa2");
            domicilio2.setNumero(1232);
            domicilio2.setLocalidad("Springfield2");
            domicilio2.setProvincia("Provincia Ejemplo2");
            datastore.save(domicilio2);

            Domicilio domicilio3 = new Domicilio();
            domicilio3.setCalle("Calle Falsa3");
            domicilio3.setNumero(1233);
            domicilio3.setLocalidad("Springfield3");
            domicilio3.setProvincia("Provincia Ejemplo3");
            datastore.save(domicilio3);

            ObraSocial obraSocial1 = new ObraSocial();
            ObraSocial obraSocial2 = new ObraSocial();

            obraSocial1.setNombre("Obra Social Ejemplo");
            obraSocial1.setNumeroAfiliado("123456");

            obraSocial2.setNombre("Otra Obra Social");
            obraSocial2.setNumeroAfiliado("654321");
            datastore.save(obraSocial1);
            datastore.save(obraSocial2);

            Empleado empleado1 = new Empleado();
            empleado1.setNombre("Juan");
            empleado1.setApellido("Perez");
            empleado1.setCuil("20-12345678-9");
            empleado1.setObraSocial(obraSocial1);
            empleado1.setCargo("Encargado");
            empleado1.setDni(12345678);
            empleado1.setDomicilio(domicilio1);
            datastore.save(empleado1);

            Empleado empleado2 = new Empleado();
            empleado2.setNombre("Juan2");
            empleado2.setApellido("Perez2");
            empleado2.setCuil("20-12345678-92");
            empleado2.setObraSocial(obraSocial1);
            empleado2.setCargo("Encargado2");
            empleado2.setDni(12345678);
            empleado2.setDomicilio(domicilio2);
            datastore.save(empleado2);

            Empleado empleado3 = new Empleado();
            empleado3.setNombre("Juan3");
            empleado3.setApellido("Perez3");
            empleado3.setCuil("20-12345678-93");
            empleado3.setObraSocial(obraSocial1);
            empleado3.setCargo("Encargado3");
            empleado3.setDni(12345678);
            empleado3.setDomicilio(domicilio1);
            datastore.save(empleado3);

            Cliente cliente1 = new Cliente();
            cliente1.setNombre("Maria");
            cliente1.setApellido("Gomez");
            cliente1.setDni(87654321);
            cliente1.setDomicilio(domicilio3);
            cliente1.setObraSocial(obraSocial2);
            datastore.save(cliente1);

            Producto producto1 = new Producto();
            producto1.setDescripcion("Producto 1");
            producto1.setPrecio(500.0f);
            producto1.setCodigo(10);
            producto1.setLaboratorio("JP MORGAN");
            producto1.setTipoProducto("Medicamento");
            datastore.save(producto1);

            Producto producto2 = new Producto();
            producto2.setDescripcion("Producto 2");
            producto2.setPrecio(500.0f);
            producto2.setCodigo(10);
            producto2.setLaboratorio("JP MORGAN");
            producto2.setTipoProducto("Medicamento");
            datastore.save(producto2);

            Producto producto3 = new Producto();
            producto3.setDescripcion("Producto 3");
            producto3.setPrecio(500.0f);
            producto3.setCodigo(10);
            producto3.setLaboratorio("JP MORGAN");
            producto3.setTipoProducto("Medicamento");
            datastore.save(producto3);

            Producto producto4 = new Producto();
            producto4.setDescripcion("Producto 4");
            producto4.setPrecio(500.0f);
            producto4.setCodigo(10);
            producto4.setLaboratorio("JP MORGAN");
            producto4.setTipoProducto("Medicamento");
            datastore.save(producto4);

            VentaDetalle ventaDetalle1 = new VentaDetalle();

            ventaDetalle1.setCantidad(2);
            ventaDetalle1.setPrecioUnitario(500.0f);
            ventaDetalle1.setTotal(1000.0f);
            ventaDetalle1.setProducto(producto1);
            datastore.save(ventaDetalle1);

            VentaDetalle ventaDetalle2 = new VentaDetalle();

            ventaDetalle2.setCantidad(2);
            ventaDetalle2.setPrecioUnitario(500.0f);
            ventaDetalle2.setTotal(1000.0f);
            ventaDetalle2.setProducto(producto2);
            datastore.save(ventaDetalle2);

            VentaDetalle ventaDetalle3 = new VentaDetalle();

            ventaDetalle3.setCantidad(2);
            ventaDetalle3.setPrecioUnitario(500.0f);
            ventaDetalle3.setTotal(1000.0f);
            ventaDetalle3.setProducto(producto3);
            datastore.save(ventaDetalle3);

            VentaDetalle ventaDetalle4 = new VentaDetalle();

            ventaDetalle4.setCantidad(2);
            ventaDetalle4.setPrecioUnitario(500.0f);
            ventaDetalle4.setTotal(1000.0f);
            ventaDetalle4.setProducto(producto4);
            datastore.save(ventaDetalle4);

            Venta venta = new Venta();
            venta.setFormaDePago("Efectivo");
            venta.setNumeroTicket(12345);
            venta.setTotal(1500.0f);
            venta.setEmpleadoAtencion(empleado3);
            venta.setEmpleadoCaja(empleado2);
            venta.setCliente(cliente1);
            venta.setDetallesVenta(List.of(ventaDetalle1, ventaDetalle2, ventaDetalle3, ventaDetalle4));
            datastore.save(venta);

            Sucursal sucursal1 = new Sucursal();
            sucursal1.setPuntoVenta(1);
            sucursal1.setDomicilio(domicilio3);
            sucursal1.setEmpleados(List.of(empleado1,empleado2,empleado3));
            sucursal1.setVentas(List.of(venta));
            datastore.save(sucursal1);


            System.out.println("Base de datos conectada correctamente");
            System.out.println("Se ingreso el dato");

        } catch (Exception e) {

            System.out.println("Error conectando a MongoDB");
            e.printStackTrace();
        }
    }
}
