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
public interface Configura {
    
    public void setTipoHoja(String tipoHoja);
    public void setColor(boolean color);
    public void setBorrador (boolean borrador);  
    public String getTipoHoja();
    public boolean isColor();
    public boolean isBorrador();
}
