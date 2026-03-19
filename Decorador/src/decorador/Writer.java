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
public abstract class Writer {
    String s;
    char c;
    public abstract void write (char c) throws IOException;
    public abstract void write (String s) throws IOException;
}
