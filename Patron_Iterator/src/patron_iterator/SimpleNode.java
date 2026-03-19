package patron_iterator;

import java.util.Iterator;

public class SimpleNode <T> implements Logs <T>{ //aparente almacenAdmin
    
    private T element;
    private SimpleNode next;
    
    public SimpleNode (T element, SimpleNode next){
        this.element = element;
        this.next = next;
    }
    
    public T getElement(){
        return element;
    }
    
    public void setElement (T element){
        this.element = element;
    }
    
    public SimpleNode getNext(){
     return next;   
    }
    
    public void setNext (SimpleNode next){
        this.next=next;
    }

    @Override
    public Iterator <T> createIterator() {
        return (Iterator<T>) new AdminIterator();
    }

    @Override
    public int getSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}