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
public class Ordenador {
    Ordenacion ordenacion;
    int[] array;
    
    public Ordenador(Ordenacion ordenacion, int [] array){
        setOrdenacion(ordenacion);
        this.array= array;
    }

    public Ordenacion getOrdenacion() {
        return ordenacion;
    }

    public void setOrdenacion(Ordenacion ordenacion) {
        this.ordenacion = ordenacion;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    
    public void ejecutar(){
        this.ordenacion.ordenar(array);
    }
    
    public void imprimirVector(){
        for(int i=0; i<array.length; i++){
            if(i== array.length-1){
                System.out.print(this.array[i] + ".");
            }else{
            System.out.print(this.array[i] + ", ");
            }
        }
    System.out.println("\n");
    }
}
