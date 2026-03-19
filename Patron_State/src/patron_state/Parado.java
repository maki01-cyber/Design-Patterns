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
public class Parado implements Estados{
    Vehiculo vehiculo;
    
    public Parado(Vehiculo vehiculo){
        this.vehiculo= vehiculo;
    }

    @Override
    public void soy(){
        System.out.println("parado");
    }
    
    @Override
    public void acelerar() { 
        if(this.vehiculo.getCombustible()>20){ //si el combustible es superior a 20 aumentamos la velocidad y disminuimos el combustible en 20 unidades
                this.vehiculo.setVelocidad(this.vehiculo.getVelocidad() + 20);
                this.vehiculo.setCombustible(this.vehiculo.getCombustible() - 20);
                this.vehiculo.setEstado(this.vehiculo.enMarcha); // el vehiculo ahora esta en marcha
            }else if(this.vehiculo.getCombustible()<=0){//si el combustible es 0 o menos
                System.out.println("te has quedado sin combustible");
                System.out.println("no se ha podido acelerar");
                this.vehiculo.setEstado(this.vehiculo.noFuel);
            }else{
                this.vehiculo.setVelocidad(this.vehiculo.getVelocidad() + 20); //en el resto de casos incrementa solo la velocidad
                this.vehiculo.setCombustible(0); //el combustible pasa a tener valor 0
                this.vehiculo.setEstado(this.vehiculo.noFuel); //el vehiculo ahora se mueve al estado de repostar
                
            }
        System.out.println("Acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("No se puede frenar mientras estas parado");
    }

    @Override
    public void repostar() {
        System.out.println("No se puede repostar");
    }

    @Override
    public void contacto() {
        vehiculo.setEstado(vehiculo.getApagado());
        System.out.println("El vehiculo ahora esta apagado");
    }
    
}
