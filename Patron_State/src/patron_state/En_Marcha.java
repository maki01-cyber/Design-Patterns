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
public class En_Marcha implements Estados{
    Vehiculo vehiculo;
    
    public En_Marcha(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
    }

    @Override
    public void soy(){
        System.out.println("en marcha");
    }
    
    @Override
    public void acelerar() {
        if(this.vehiculo.getCombustible()>20){
                this.vehiculo.setVelocidad(this.vehiculo.getVelocidad() + 20);
                this.vehiculo.setCombustible(this.vehiculo.getCombustible() - 20);
                this.vehiculo.setEstado(this.vehiculo.enMarcha);
            }else if(this.vehiculo.getCombustible()<=0){
                System.out.println("te has quedado sin combustible");
                System.out.println("no se ha podido acelerar");
                this.vehiculo.setEstado(this.vehiculo.noFuel);
            }else{
                this.vehiculo.setVelocidad(this.vehiculo.getVelocidad() + 20);
                this.vehiculo.setCombustible(0);
                this.vehiculo.setEstado(this.vehiculo.noFuel);
            }
    }

    @Override
    public void frenar() {
        this.vehiculo.frenado();
    }

    @Override
    public void repostar() {
        System.out.println("No se puede repostar estando en marcha");
    }

    @Override
    public void contacto() {
        System.out.println("No se puede realizar contacto sin previamente detener el vehiculo");
    }
}
