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
public class BufferedWriter extends CriptoWriter {
    Writer writer;
    
    public BufferedWriter(Writer writer){
        this.writer=writer;
    }
    
    @Override
    public void write(char c) throws IOException {
        System.out.print(c);
    }

    @Override
    public void write(String s) throws IOException {
        s= s + ", bufferedWriter adios\n";
        for(int i=0; i < s.length(); i++){
            write(s.charAt(i));
        }
    }
}
