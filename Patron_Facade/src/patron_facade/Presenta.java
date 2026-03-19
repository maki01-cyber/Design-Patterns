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
public interface Presenta {
    public void setOrdena (boolean orden);
    public void setGrapa (boolean grapado);
    public boolean isOrdena();
    public boolean isGrapa();
}
