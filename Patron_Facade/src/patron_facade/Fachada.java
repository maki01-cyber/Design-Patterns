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
public class Fachada {
    private Configura configura;
    private Presenta presenta;
    private Imprime imprime;
    
    public Fachada(Configura configura, Presenta presenta, Imprime imprime){
        this.configura=configura;
        this.imprime=imprime;
        this.presenta=presenta;
    }
    
    public void imprimeLujo(String cadena){
        configura.setTipoHoja("A4");
        configura.setColor(true);
        configura.setBorrador(false);
        presenta.setOrdena(true);
        presenta.setGrapa(true);
        //Se llama al metodo para imprimir
        imprime.setTexto(cadena);
        imprime.imprimirDocumento();
    }
    
    public void imprimeBorrador(String cadena){
        configura.setTipoHoja("B5");
        configura.setColor(false);
        configura.setBorrador(true);
        presenta.setOrdena(false);
        presenta.setGrapa(false);
        //se llama al metodo para imprimir
        imprime.setTexto(cadena);
        imprime.imprimirDocumento();
    }
}
