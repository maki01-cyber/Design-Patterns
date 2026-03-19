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
public class Apagado implements Estados{
    Vehiculo vehiculo;
    public Apagado(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
    }
    @Override
    public void soy() {
        System.out.println("apagado");
    }
    //si esta apagado no se puede acelerar
    @Override
    public void acelerar() {
        System.out.println("No puedes acelerar si no arrancas el vehiculo");
    }
    //tampoco se puede frenar estando apagado
    @Override
    public void frenar() {
        System.out.println("No puedes frenar si no arrancas el vehiculo");
    }
    //no se puede repostar estando apagado
    @Override
    public void repostar() {
        System.out.println("No se puede repostar mientras estas apagado");
    }
    //hay que dar el contacto para poder arrancar el coche, pero el combustible tiene que ser superior a 0
    @Override
    public void contacto() {
        if(vehiculo.getCombustible()==0){
            System.out.println("No hay combustible, redirigiendo a la estacion para repostar");
            vehiculo.setEstado(vehiculo.noFuel);
        }else{
            vehiculo.setEstado(vehiculo.parado);
        }
    }
}
