
package Modelo;
import java.util.Date;


public class Movimiento {
    private int idMovimiento;
    private TipoMovimiento tpMovIdTipoMovimiento;
    private Producto productoIdProducto;
    private String ubicacionInicio;
    private String ubicacionFinal;
    private Date fechaMovimiento;

    //CONSTRUCTOR SIN PARAMETROS
    public Movimiento() {
    }

    public Movimiento(int idMovimiento, TipoMovimiento tpMovIdTipoMovimiento, Producto productoIdProducto, String ubicacionInicio, String ubicacionFinal, Date fechaMovimiento) {
        this.idMovimiento = idMovimiento;
        this.tpMovIdTipoMovimiento = tpMovIdTipoMovimiento;
        this.productoIdProducto = productoIdProducto;
        this.ubicacionInicio = ubicacionInicio;
        this.ubicacionFinal = ubicacionFinal;
        this.fechaMovimiento = fechaMovimiento;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public TipoMovimiento getTpMovIdTipoMovimiento() {
        return tpMovIdTipoMovimiento;
    }

    public void setTpMovIdTipoMovimiento(TipoMovimiento tpMovIdTipoMovimiento) {
        this.tpMovIdTipoMovimiento = tpMovIdTipoMovimiento;
    }

    public Producto getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(Producto productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    public String getUbicacionInicio() {
        return ubicacionInicio;
    }

    public void setUbicacionInicio(String ubicacionInicio) {
        this.ubicacionInicio = ubicacionInicio;
    }

    public String getUbicacionFinal() {
        return ubicacionFinal;
    }

    public void setUbicacionFinal(String ubicacionFinal) {
        this.ubicacionFinal = ubicacionFinal;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "idMovimiento=" + idMovimiento + ", tpMovIdTipoMovimiento=" + tpMovIdTipoMovimiento + ", productoIdProducto=" + productoIdProducto + ", ubicacionInicio=" + ubicacionInicio + ", ubicacionFinal=" + ubicacionFinal + ", fechaMovimiento=" + fechaMovimiento + '}';
    }


}
