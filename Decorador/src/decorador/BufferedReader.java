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
public class BufferedReader extends CriptoReader {
    Reader reader;
    public BufferedReader(Reader reader){
        this.reader=reader;
    }
    
    @Override
    public int read () throws IOException{
        int i= 300;
        Writer writer1= new WriterNormal();
        writer1= new BufferedWriter(writer1);
        try{
            writer1.write("hola buenos dias");
        }catch(IOException ex){
            System.out.println("ERROR: no se ha podido escribir el mensaje");
        }  
        return i;
    }
}
