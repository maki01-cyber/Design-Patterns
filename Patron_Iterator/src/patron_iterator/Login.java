/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_iterator;
import java.util.Iterator; 
/**
 *
 * @author PC
 */
public class Login <T> {
    AlmacenProfesores profesores;
    AlmacenAlumnos alumnos;
    SimpleNode administrador;
    int N;
    T prueba= (T) "Hola";
    T prueba1= (T) "Adios";
    T prueba3= (T) "pepe";
    T prueba4= (T) "infiltrado";
    T prueba5= (T) "el espacio de isma";
    T prueba6= (T) "sa matao paco";
    public Login (AlmacenProfesores profesores, AlmacenAlumnos alumnos, SimpleNode administrador){
        this.profesores= profesores;
        this.alumnos=alumnos;
        this.administrador=administrador;

        this.profesores.addProfesor(prueba);
        this.profesores.addProfesor(prueba1);
        this.profesores.addProfesor(prueba3);
        this.profesores.addProfesor(prueba4);
        this.profesores.addProfesor(prueba5);
        this.profesores.addProfesor(prueba6);
        
        this.alumnos.addItem(prueba6);
        this.alumnos.addItem(prueba5);
        this.alumnos.addItem(prueba4);
        this.alumnos.addItem(prueba3);
        this.alumnos.addItem(prueba1);
        this.alumnos.addItem(prueba);
        
    }
    public void imprimir(){
        Iterator <T> profesores2 = profesores.createIterator();
        Iterator <T> alumnos2 =  alumnos.createIterator();
//        Iterator <T> admin2= administrador.createIterator();
        
        profesores2.next();
        this.administrador.setElement(prueba);
        

    }
}
