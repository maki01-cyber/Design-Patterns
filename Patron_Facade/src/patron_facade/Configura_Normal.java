/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_facade;

/**
 *
 * @author PC
 */
public class Configura_Normal implements Configura{
    private String tipoHoja;
    private boolean color;
    private boolean borrador;
    @Override
    public void setTipoHoja(String tipoHoja) {
        this.tipoHoja=tipoHoja;
    }

    @Override
    public void setColor(boolean color) {
        this.color=color;
    }

    @Override
    public void setBorrador(boolean borrador) {
        this.borrador=borrador;
    }

    @Override
    public String getTipoHoja() {
        return this.tipoHoja;
    }

    @Override
    public boolean isColor() {
        return this.color;
    }

    @Override
    public boolean isBorrador() {
        return this.borrador;
    }
    
}
