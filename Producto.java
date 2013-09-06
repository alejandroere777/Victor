/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14;

import java.math.BigDecimal;

/**
 *
 * @author Administrador
 */
public class Producto {
    private String cod;
    private BigDecimal costo;
    private BigDecimal gan;
    
    public String getCodigo(){
        return this.cod;
    }
    public void setCodigo(String cod){
        this.cod = cod;
    }
    
    public BigDecimal getCosto(){
        return this.costo;
    }
    public void setCosto(BigDecimal costo){
        this.costo = costo;
    }
    
    public BigDecimal getGanan(){
        return this.gan;
    }
    public void setGanan(BigDecimal gan){
        this.gan = gan;
    }
    
    public Producto(){
        
    }

    public Producto(String cod, BigDecimal costo, BigDecimal gan) {
        this.cod = cod;
        this.costo = costo;
        this.gan = gan;
    }
    
}
