/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_iterator;

/**
 *
 * @author PC
 */
public interface Iterator <T> {
    public boolean hasNext();

    public void remove();

    public T next();
}
