package com.mycompany.proyecto_progra_v2;
// @author MRobot404

public class EstadoProductos {
    private String ID;
    private float PrecioUnitario;
    private String NombreProducto;
    private String DescripcionProducto;
    private int CantidadVenta;
    private float total;

    /**
     * @return the PrecioUnitario
     */
    public float getPrecioUnitario() {
        return PrecioUnitario;
    }

    /**
     * @param PrecioUnitario the PrecioUnitario to set
     */
    public void setPrecioUnitario(float PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    /**
     * @return the NombreProducto
     */
    public String getNombreProducto() {
        return NombreProducto;
    }

    /**
     * @param NombreProducto the NombreProducto to set
     */
    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    /**
     * @return the DescripcionProducto
     */
    public String getDescripcionProducto() {
        return DescripcionProducto;
    }

    /**
     * @param DescripcionProducto the DescripcionProducto to set
     */
    public void setDescripcionProducto(String DescripcionProducto) {
        this.DescripcionProducto = DescripcionProducto;
    }

    /**
     * @return the CantidadVenta
     */
    public int getCantidadVenta() {
        return CantidadVenta;
    }

    /**
     * @param CantidadVenta the CantidadVenta to set
     */
    public void setCantidadVenta(int CantidadVenta) {
        this.CantidadVenta = CantidadVenta;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

}
