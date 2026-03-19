/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_iterator;

/**
 *
 * @author PC
 */
public class Patron_Iterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlmacenProfesores profesores= new AlmacenProfesores();
        AlmacenAlumnos alumnos= new AlmacenAlumnos();
        SimpleNode administrador= new SimpleNode("uala", null);
        Login login= new Login(profesores, alumnos, administrador);
        login.imprimir();
    }
    
}
