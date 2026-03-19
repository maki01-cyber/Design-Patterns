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
public interface Logs <T>{
    public Iterator<T> createIterator();
    public int getSize ();
}
