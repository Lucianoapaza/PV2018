/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplcacion.form.beans;

import aplicacion.datos.ListaElectrodomestico;
import aplicacion.datos.ListaMarcas;
import aplicacion.dominio.Electrodomestico;
import aplicacion.dominio.Marca;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PCBOX
 */
@ManagedBean
@ViewScoped
public class ElectrodomesticoFormBean implements Serializable{
    private String cod;
    private String tipo;
    private Marca marca;
    private ListaElectrodomestico listadoElectrodomestico;
    private Electrodomestico unElectrodomestico;
    private ArrayList<Electrodomestico> listaAux;
    private ListaMarcas listadoMarcas;
    private Date fecha;

    /**
     * Creates a new instance of ElectrodomesticoFormBean
     */
    public ElectrodomesticoFormBean() {
        listadoElectrodomestico=new ListaElectrodomestico();
        listaAux=new ArrayList();
        listadoMarcas=new ListaMarcas();
        listadoMarcas.getListaMarca().add(new Marca("K123","Drean"));
        listadoMarcas.getListaMarca().add(new Marca("K321","Wirpool"));
        listadoMarcas.getListaMarca().add(new Marca("K982","Samsung"));
        listadoMarcas.getListaMarca().add(new Marca("K289","Koinor"));
        listadoMarcas.getListaMarca().add(new Marca("K951","Philips"));
    }
    
    public void agregarElectrodomestico(){
        setUnElectrodomestico(new Electrodomestico(getCod(), getTipo(), getMarca(),getFecha()));
        setListaAux(getListadoElectrodomestico().agregarElectrodomesticos(getUnElectrodomestico()));
    }
    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(String cod) {
        this.cod = cod;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tips to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * @return the listadoElectrodomestico
     */
    public ListaElectrodomestico getListadoElectrodomestico() {
        return listadoElectrodomestico;
    }

    /**
     * @param listadoElectrodomestico the listadoElectrodomestico to set
     */
    public void setListadoElectrodomestico(ListaElectrodomestico listadoElectrodomestico) {
        this.listadoElectrodomestico = listadoElectrodomestico;
    }

    /**
     * @return the unElectrodomestico
     */
    public Electrodomestico getUnElectrodomestico() {
        return unElectrodomestico;
    }

    /**
     * @param unElectrodomestico the unElectrodomestico to set
     */
    public void setUnElectrodomestico(Electrodomestico unElectrodomestico) {
        this.unElectrodomestico = unElectrodomestico;
    }

    /**
     * @return the listaAux
     */
    public ArrayList<Electrodomestico> getListaAux() {
        return listaAux;
    }

    /**
     * @param listaAux the listaAux to set
     */
    public void setListaAux(ArrayList<Electrodomestico> listaAux) {
        this.listaAux = listaAux;
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the listadoMarcas
     */
    public ListaMarcas getListadoMarcas() {
        return listadoMarcas;
    }

    /**
     * @param listadoMarcas the listadoMarcas to set
     */
    public void setListadoMarcas(ListaMarcas listadoMarcas) {
        this.listadoMarcas = listadoMarcas;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
