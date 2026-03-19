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
public class No_Fuel implements Estados{
    Vehiculo vehiculo;
    
    public No_Fuel(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
    }

    @Override
    public void soy(){
        System.out.println("repostaje");
    }
    
    @Override
    public void repostar(){
        this.vehiculo.setCombustible(this.vehiculo.getCombustible() + 120);
        this.vehiculo.setVelocidad(0);
        System.out.println("Repostando");
        System.out.println("Deposito Lleno");
    }
    //no se puede acelerar, frenar ni poner el contacto mientras estas repostando
    @Override
    public void acelerar() {
        System.out.println("No se puede acelerar sin combustible");
    }

    @Override
    public void frenar() {
        System.out.println("No se puede frenar sin combustible");
    }

    @Override
    public void contacto() {
        System.out.println("No se puede realizar contacto mientras no tengas combustible");
    }
}
