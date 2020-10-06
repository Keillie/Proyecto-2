package modelo;

import modelo.Cliente;
import utils.ItemOrden;

import java.util.Date;

/**
 * Esta clase representa la orden de compra de algun cliente
 */
public class Orden {
    //Propiedades con su tipo de dato que seran utilizadas
    int id;
    public Cliente cliente;
    public ItemOrden item1;
    public ItemOrden item2;
    public Date fechaOrden;
    public double precioEnvio;
    public double total;
    public String tipoEnvio;
    public String estado;
    public static int sigIdOrden; //Llevar el orden correlativo id de la orden
    public int diasEnvio;

    /**
     * Constructor inicializamos propiedades
     */
    public Orden() {
        this.id = sigIdOrden++;
        this.fechaOrden = new Date();
        this.total = 0.0;
    }

    /**
     * Constructor para inicializar propiedadd
     * @param fechaOrden parametro para fecha de la orden
     */
    public Orden(Date fechaOrden){
        this.fechaOrden = fechaOrden;
    }

    /**
     *
     * @param cliente
     * @param fechaOrden
     */
    public Orden(Cliente cliente, Date fechaOrden) {
        this.cliente = cliente;
        this.fechaOrden = fechaOrden;
    }

    /**
     * Metodo que calcula el monto total de la orden
     *  se calculará en base a los precios de los productos y el descuento si es que aplica
     * @return
     */
    public void getTotalOrden(){ //falta implemtar metodo

    }
}
