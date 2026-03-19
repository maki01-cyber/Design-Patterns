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
public class AlumnosIterator <T>implements Iterator <T> {
    T[] listaAlumnos;
    int posicion=0;
    
    public AlumnosIterator(T[] lista){
        this.listaAlumnos=lista;
        
    }
    @Override
    public T next() {
        T usuario = listaAlumnos[posicion];
        posicion = posicion + 1;
        return usuario;
    }
    @Override
    public boolean hasNext() {
        if (listaAlumnos[posicion] == null) {
            return false; 
        }else { 
            return true; 
        } 
    }
    public void remove(T element) throws Exception {
        T u=element;
        if (posicion <= 0) { throw new IllegalStateException ("You can't remove an item until you've done at least one  next()"); }
        if (listaAlumnos[posicion-1] != null) {
            for (int i = posicion-1; i < (listaAlumnos.length-1); i++) {
                listaAlumnos[i] = listaAlumnos[i+1]; 
            }
            listaAlumnos[listaAlumnos.length-1] = null; 
        }
    }
}