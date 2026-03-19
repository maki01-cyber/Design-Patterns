/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_facade;

/**
 *
 * @author PC
 */
public class Imprime_Normal implements Imprime{
    private String texto;
    @Override
    public void setTexto(String texto) {
        this.texto=texto; 
    }

    @Override
    public void imprimirDocumento() {
        System.out.println("Texto:" + this.texto);
    }   
}
