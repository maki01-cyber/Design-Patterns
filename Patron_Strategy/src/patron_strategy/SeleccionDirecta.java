/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_strategy;

/**
 *
 * @author PC
 */
public class SeleccionDirecta implements Ordenacion{
    @Override
    public void ordenar(int [] array){
        for(int i=0; i < array.length; i++){
            int min=i;
            for(int j= i+1; j< array.length; j++){
                if(array[j] < array[min]){
                    min= j;
                }
            }
            if(i != min){
                    int aux=array[i];
                    array[i]= array[min];
                    array[min]= aux;
            }
        }
    }
}
