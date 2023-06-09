
package Modelo;

import java.util.Date;


public class Producto {
    //Atributos
    private int idProducto;
    private String numActivoProducto;
    private String numSerieProducto;
    private String descProducto;
    private TipoProducto tipoProducto;
    private Empleado ultimaActualizacionProducto;
    private Date fechaLlegadaProducto;
    private int stockProducto;
    private Estado estadoProducto;
    private Ubicacion ubicacionProducto;
    private Color colorProducto;
    private int contNetoProducto;
    private int costoProducto;

    //Metodos Constructores
    public Producto() {
    }

    public Producto(int idProducto, String numActivoProducto, String numSerieProducto, String descProducto, TipoProducto tipoProducto, Empleado ultimaActualizacionProducto, Date fechaLlegadaProducto, int stockProducto, Estado estadoProducto, Ubicacion ubicacionProducto, Color colorProducto, int contNetoProducto, int costoProducto) {
        this.idProducto = idProducto;
        this.numActivoProducto = numActivoProducto;
        this.numSerieProducto = numSerieProducto;
        this.descProducto = descProducto;
        this.tipoProducto = tipoProducto;
        this.ultimaActualizacionProducto = ultimaActualizacionProducto;
        this.fechaLlegadaProducto = fechaLlegadaProducto;
        this.stockProducto = stockProducto;
        this.estadoProducto = estadoProducto;
        this.ubicacionProducto = ubicacionProducto;
        this.colorProducto = colorProducto;
        this.contNetoProducto = contNetoProducto;
        this.costoProducto = costoProducto;
    }

    //Metodos Getters & Setters

    public String getNumActivoProducto() {
        return numActivoProducto;
    }

    public void setNumActivoProducto(String numActivoProducto) {
        this.numActivoProducto = numActivoProducto;
    }

    public String getNumSerieProducto() {
        return numSerieProducto;
    }

    public void setNumSerieProducto(String numSerieProducto) {
        this.numSerieProducto = numSerieProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Empleado getUltimaActualizacionProducto() {
        return ultimaActualizacionProducto;
    }

    public void setUltimaActualizacionProducto(Empleado ultimaActualizacionProducto) {
        this.ultimaActualizacionProducto = ultimaActualizacionProducto;
    }

    public Date getFechaLlegadaProducto() {
        return fechaLlegadaProducto;
    }

    public void setFechaLlegadaProducto(Date fechaLlegadaProducto) {
        this.fechaLlegadaProducto = fechaLlegadaProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public Estado getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(Estado estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public Ubicacion getUbicacionProducto() {
        return ubicacionProducto;
    }

    public void setUbicacionProducto(Ubicacion ubicacionProducto) {
        this.ubicacionProducto = ubicacionProducto;
    }

    public Color getColorProducto() {
        return colorProducto;
    }

    public void setColorProducto(Color colorProducto) {
        this.colorProducto = colorProducto;
    }

    public int getContNetoProducto() {
        return contNetoProducto;
    }

    public void setContNetoProducto(int contNetoProducto) {
        this.contNetoProducto = contNetoProducto;
    }

    public int getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(int costoProducto) {
        this.costoProducto = costoProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }


    
    //Metodo toString
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", numActivoProducto=" + numActivoProducto + ", numSerieProducto=" + numSerieProducto + ", descProducto=" + descProducto + ", tipoProducto=" + tipoProducto + ", ultimaActualizacionProducto=" + ultimaActualizacionProducto + ", fechaLlegadaProducto=" + fechaLlegadaProducto + ", stockProducto=" + stockProducto + ", estadoProducto=" + estadoProducto + ", ubicacionProducto=" + ubicacionProducto + ", colorProducto=" + colorProducto + ", contNetoProducto=" + contNetoProducto + ", costoProducto=" + costoProducto + '}';
    }
    
    //Metodos Customer





}
