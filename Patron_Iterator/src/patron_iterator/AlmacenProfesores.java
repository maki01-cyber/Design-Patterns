/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author PC
 */

public class AlmacenProfesores <T> implements Logs<T>{
    ArrayList<T> profesores= new ArrayList<>();
    private int posicion=0;
    private final int maxProfesores=5;
    public AlmacenProfesores() {

    }
    public void addProfesor(T element) {
        profesores.add(posicion, element);
        this.posicion= (this.posicion + 1) % this.maxProfesores; 
    }
    public ArrayList<T> getProfesores() { 
        return profesores; 
    }

    @Override
    public Iterator <T> createIterator() {
       return (Iterator<T>) new ProfesoresIterator(profesores);
    }

    @Override
    public int getSize() {
        return profesores.size();
    }
}
