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
public class Vehiculo{
    private int combustible;
    private int getVelocidad;
    
    Estados apagado;
    Estados parado;
    Estados enMarcha;
    Estados noFuel;
    Estados estado; //Estado actual del vehiculo
    
    public Vehiculo(int combustible){
        apagado= new Apagado(this);
        parado= new Parado(this);
        enMarcha= new En_Marcha(this);
        noFuel= new No_Fuel(this);
        this.getVelocidad=0;
        if(combustible<=0){
            this.combustible=0;
            estado=noFuel;
        }else{
            this.combustible=combustible;
            estado=apagado;
        }   
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public int getVelocidad() {
        return getVelocidad;
    }

    public void setVelocidad(int velocidad) {
        this.getVelocidad = velocidad;
    }

    public Estados getApagado() {
        return apagado;
    }

    public void setApagado(Estados apagado) {
        this.estado = apagado;
    }

    public Estados getParado() {
        return parado;
    }

    public void setParado(Estados parado) {
        this.estado = parado;
    }

    public Estados getEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(Estados enMarcha) {
        this.estado = enMarcha;
    }

    public Estados getNoFuel() {
        return noFuel;
    }

    public void setNoFuel(Estados noFuel) {
        this.estado = noFuel;
    }

    public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
    public void recogeEstados(){
        this.estado.soy();
    }
    public void aceleracion(){
        if(this.estado==this.apagado){ //si el vehiculo esta apagado
            this.apagado.acelerar();
        }else if(this.estado==this.noFuel){ //si el vehiculo no tiene gasolina
            this.noFuel.acelerar();
        }else if(this.estado==this.parado){
            this.parado.acelerar();
        }else{
            this.enMarcha.acelerar();
        }
            
    }
    
    public void frenado(){
        if(this.estado==this.apagado){ //si el vehiculo esta apagado
            this.apagado.frenar();
        }else if(this.estado==this.noFuel){
            this.noFuel.frenar();
        }else if(this.estado==this.parado){
            this.parado.frenar();
        }else{
            if(this.getVelocidad>20){ //si no esta apagado y la velocidad es superior a 20
                this.setVelocidad(this.getVelocidad-20);
            }else{ //cuando la velocidad es menor que 20
                this.setVelocidad(0);
                this.setEstado(this.parado);
            }
        }
    }
    
    public void repostar(){
        if(this.combustible==0){ //cuando no hay combustible, se reposta
            this.noFuel.repostar();
            this.estado=this.apagado;
        }else if(this.combustible>0 && this.estado==this.apagado){ // cuando hay combustible y esta apagado el vehiculo
            this.apagado.repostar();
        }else if(this.combustible>0 && this.estado==this.parado){ //cuando hay combustible y esta parado
            this.parado.repostar();
        }else if(this.combustible>0 && this.estado==this.enMarcha){// cuando hay combustible y esta en marcha
            this.enMarcha.repostar();
        }
    }
    public void contacto(){
        this.estado.contacto();
    }
}
