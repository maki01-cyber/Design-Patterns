/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_iterator;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ProfesoresIterator <T> implements Iterator<T> {
    ArrayList<T> profesores;
    
    public ProfesoresIterator(ArrayList profesores) {
        this.profesores = profesores;
    }
    @Override
    public boolean hasNext() { //al ser circular siempre tiene siguiente
        return true;
    }

    @Override
    public void remove() {
        System.out.println("lo borro");
    }

    @Override
    public T next() {
        System.out.println("soy siguiente");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
