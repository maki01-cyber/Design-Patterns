/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_iterator;

import java.util.Iterator;

/**
 *
 * @author PC
 */
public class AlmacenAlumnos <T> implements Logs<T>{
    private T alumnos [];
    private int posicion=0;
    static final int maxUsuarios= 5;
    
    public AlmacenAlumnos(){
       alumnos = (T[]) new Object[maxUsuarios];
    }

    public void addItem(T element) {
        if (posicion >= maxUsuarios) {
            System.err.println("Sorry, user are full! deleting the first user");
            alumnos[posicion % maxUsuarios]=element;
            posicion= (posicion + 1) % maxUsuarios;
        }else {
            alumnos[posicion] = element;
            posicion = posicion + 1; 
        }
    }

    public int getPosicion() {
        return posicion;
    }
    
    @Override
    public Iterator <T> createIterator () {
        return new AlumnosIterator (alumnos);
    }

    @Override
    public int getSize() {
        return this.getPosicion();
    }
}
