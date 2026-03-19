/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorador;

import java.io.IOException;

/**
 *
 * @author PC
 */
public class Decorador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Writer writer= new WriterNormal();
        try{
            writer.write("hola buenos dias \n");
        }catch(IOException ex){
            System.out.println("ERROR: no se ha podido escribir el mensaje");
        }
        Writer writer1= new WriterNormal();
        writer1= new BufferedWriter(writer1);
        try{
            writer1.write("hola buenos dias");
        }catch(IOException ex){
            System.out.println("ERROR: no se ha podido escribir el mensaje");
        }
        
        Reader reader= new NormalReader();
        try{
            reader.read();
        }catch(IOException ex){
            System.out.println("ERROR: no se ha podido leer el mensaje");
        }
        Reader reader1= new NormalReader();
        reader1= new BufferedReader(reader1);
        try{
            reader1.read();
        }catch(IOException ex){
            System.out.println("ERROR: no se ha podido leer el mensaje");
        } 
    }
    
}
