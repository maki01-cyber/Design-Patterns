/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_adapter;

/**
 *
 * @author PC
 */
public class SeleccionDirecta {
    public void ordena(int [] v){
        int m;
        for (int i=0; i<v.length-1; i++) {
            m = i;
            for (int j=i+1; j<v.length; j++)
                if (v[j]<v[m])
                    m = j;
            int aux = v[i];
            v[i] = v[m];
            v[m] = aux;
        }
    }
}
