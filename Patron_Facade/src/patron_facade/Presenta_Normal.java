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
public class Presenta_Normal implements Presenta{
    private boolean orden;
    private boolean grapado;
    @Override
    public void setOrdena(boolean orden) {
        this.orden=orden;
    }

    @Override
    public void setGrapa(boolean grapado) {
        this.grapado=grapado;
    }

    @Override
    public boolean isOrdena() {
        return this.orden;
    }

    @Override
    public boolean isGrapa() {
        return this.grapado;
    }
    
}
