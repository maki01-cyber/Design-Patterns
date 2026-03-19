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
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeleccionDirecta sd = new SeleccionDirecta();
        Adaptador ad = new Adaptador(sd);
        MergeSort ms = new MergeSort();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(69);
        a.add(96);
        a.add(6);
        a.add(9);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(69);
        b.add(96);
        b.add(6);
        b.add(9);
        System.out.println("Orden inicial de array mergeSort: " + a);
        System.out.println("Orden inicial de array SeleccionDirecta: " + b);
        ms.ordena(a);
        System.out.println("Orden final de array mergeSort: " + a);
        ad.ordena(b);
        System.out.println("Orden final de array SeleccionDirecta: " + b);
    }
    
}
