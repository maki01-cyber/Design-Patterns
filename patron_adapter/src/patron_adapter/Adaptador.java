/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_adapter;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Adaptador implements Objetivo {
    private SeleccionDirecta seleccionDirecta;
    
    public Adaptador(SeleccionDirecta seleccionDirecta){
        this.seleccionDirecta=seleccionDirecta;
    }
    
    @Override
    public void ordena(ArrayList<Integer> a){
        int[] array = new int[a.size()];
        for(int i=0; i < a.size(); i++){
            array[i] = a.get(i);
        }
        this.seleccionDirecta.ordena(array);
        
        for(int i = 0; i < a.size(); i++ ){
            a.set(i, array[i]);
        }
    }
    
}
