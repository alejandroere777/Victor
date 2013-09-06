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
public class Producto_B extends Producto{
    private String descri;
    private String pais_or;
    private BigDecimal tasa;
    
    public String getDescrip(){
        return this.descri;
    }
    public void setDescrip(String descri){
        this.descri = descri;
    }
    
    public String getPaisOr(){
        return this.pais_or;
    }
    public void setPaisOr(String pais_or){
        this.pais_or = pais_or;
    }
    
    public BigDecimal getTasa(){
        return this.tasa;
    }
    public void setTasa(BigDecimal tasa){
        this.tasa = tasa;
    }
    
    public Producto_B(){
        
    }
    
    public Producto_B(String cod, BigDecimal costo, BigDecimal gan, String descri, String pais_or, BigDecimal tasa){
            super(cod, costo, gan);
            this.descri = descri;
            this.pais_or = pais_or;
            this.tasa = tasa;
    }
}
