/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import java.math.BigDecimal;
import java.sql.Date;

    
/**
 *
 * @author Administrador
 */
public class Producto_A extends Producto{
    private Date fech_v;
    
    public Date getFechaVen(){
        return this.fech_v;
    }
    public void setFechaVen(Date fech_v){
        this.fech_v = fech_v;
    }
    
    public Producto_A(){
        
    }

    public Producto_A(String cod, BigDecimal costo, BigDecimal gan, Date fech_v){
        super(cod, costo, gan);
        this.fech_v = fech_v;

    }
    
}
