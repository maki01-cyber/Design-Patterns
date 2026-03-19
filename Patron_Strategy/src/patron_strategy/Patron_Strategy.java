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
public class Patron_Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Burbuja burbuja= new Burbuja();
        SeleccionDirecta sd= new SeleccionDirecta();
        int [] a= {0,1,100,98,68,69,-8,55,3};
        Ordenador ordenador= new Ordenador(burbuja, a);
        Ordenador ordenador1= new Ordenador(sd, a);
        System.out.println("Ordenacion burbuja:");
        ordenador.imprimirVector();
        ordenador.ejecutar();
        ordenador.imprimirVector();
        System.out.println("Ordenacion Seleccion Directa:");
        ordenador1.imprimirVector();
        ordenador1.ejecutar();
        ordenador1.imprimirVector();
    }
    
}
