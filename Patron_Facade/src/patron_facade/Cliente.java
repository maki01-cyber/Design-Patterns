/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_facade;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Cliente{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configura configura= new Configura_Normal();
        Presenta presenta= new Presenta_Normal();
        Imprime imprime= new Imprime_Normal();
        Fachada fachada= new Fachada(configura, presenta, imprime);
        int opcion;
        System.out.println("Pulsa 1 para imprimir lujosamente,pulsa 2 para imprimir un borrador, pulsa 3 para imprimir un texto cualquiera, pulsa 4 para salri");
        Scanner sc= new Scanner(System.in);
        opcion= sc.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Escribe el texto que se va a imprimir:");
                Scanner sc1= new Scanner(System.in);
                String cadena;
                cadena = sc1.nextLine();
                fachada.imprimeLujo(cadena);
                System.out.println("Tipo de hoja: " + configura.getTipoHoja() + " Color: " + configura.isColor()+ " Borrador: " + configura.isBorrador() + " Orden: " + presenta.isOrdena() + " Grapado: " + presenta.isGrapa());
                break;
            case 2:
                System.out.println("Escribe el texto que se va a imprimir: ");
                Scanner sc2= new Scanner(System.in);
                String cadena2;
                cadena2 = sc2.nextLine();
                fachada.imprimeBorrador(cadena2);
                System.out.println("Tipo de hoja: " + configura.getTipoHoja() + " Color: " + configura.isColor()+ " Borrador: " + configura.isBorrador() + " Orden: " + presenta.isOrdena() + " Grapado: " + presenta.isGrapa());
                break;
            case 3:
                System.out.println("Escribe el texto que se va a imprimir:");
                Scanner sc3= new Scanner(System.in);
                String cadena3;
                cadena3 = sc3.nextLine();
                fachada.imprimeLujo(cadena3);
                configura.setTipoHoja("A3");
                presenta.setGrapa(true);
                System.out.println("Tipo de hoja: " + configura.getTipoHoja() + " Color: " + configura.isColor()+ " Borrador: " + configura.isBorrador() + " Orden: " + presenta.isOrdena() + " Grapado: " + presenta.isGrapa());
                
                break;
            case 4:
                System.out.println("adios");
                break;
            default:
                System.out.println("Esta opcion no existe, eliga una de las mencionadas anteriormente");
        }
    }
    
}
