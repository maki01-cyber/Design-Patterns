/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_state;

/**
 *
 * @author PC
 */
public class Patron_State {

    
    public static void main(String[] args){
        //Creamos un vehiculo
        Vehiculo vehiculo1= new Vehiculo(20);
        //No podemos acelerar sin poner el contacto
        vehiculo1.aceleracion();
        //No podemos frenar sin poner el contacto
        vehiculo1.frenado();
        //Todavia nos queda gasolina, no podemos repostar
        vehiculo1.repostar();
        //mostramos estado
        vehiculo1.recogeEstados();
        //Ponemos el contacto
        vehiculo1.contacto();
        //Ahora deberia estar parados
        vehiculo1.recogeEstados();
        //aceleramos y nos quedamos sin combustible, asi que se va a repostar automaticamente
        vehiculo1.aceleracion();
        //esta en repostaje
        vehiculo1.recogeEstados();
        //no puede acelerar porque no ha repostado
        vehiculo1.aceleracion();
        //sigue en repostaje
        vehiculo1.recogeEstados();   
        //Llena el deposito
        vehiculo1.repostar();
        //Ahora esta apagado, con el combustible al maximo
        vehiculo1.recogeEstados();
        //Enciende el contacto
        vehiculo1.contacto();
        //Acelera, velocidad +20
        vehiculo1.aceleracion();
        //Acelera, velocidad +20
        vehiculo1.aceleracion();
        //Frena, velocidad -20
        vehiculo1.frenado();
        //Sigue en marcha
        vehiculo1.recogeEstados();
        //Frena, velocidad -20
        vehiculo1.frenado();
        //Se ha detenido el vehiculo
        vehiculo1.recogeEstados();
    }
    
}
