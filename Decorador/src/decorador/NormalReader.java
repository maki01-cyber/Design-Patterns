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
public class NormalReader extends Reader{
    
    public NormalReader(){}
    @Override
    public int read (){
        Writer writer= new WriterNormal();
        try{
            writer.write("hola buenos dias \n");
        }catch(IOException ex){
            System.out.println("ERROR: no se ha podido escribir el mensaje");
        }
        int i = 200;
        return i;
    }
}
