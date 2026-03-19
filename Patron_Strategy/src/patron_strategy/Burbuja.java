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
public class Burbuja implements Ordenacion{
    @Override
    public void ordenar(int [] array){
        for(int i=0; i < array.length-1; i++){
            for(int j=array.length-1; j>i; j--){
                if(array[j-1] < array[j]){
                    int aux= array[j-1];
                    array[j-1]=array[j];
                    array[j]=aux;
                }
            }
        }
    }
}
