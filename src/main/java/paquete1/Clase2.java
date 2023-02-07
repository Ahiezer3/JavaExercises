/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author abi_h
 */
public class Clase2 {
    
    public static void main(String[] args){
//        Clase1 clase1 = new Clase1(30);
//        clase1.atributo1 = 2;
//        clase1.getEdad();

        MiembrosEstaticos miembro = new MiembrosEstaticos();
        miembro.cadena = "Nueva cadena";
        
        MiembrosEstaticos miembro2 = new MiembrosEstaticos();
   
        System.out.println(miembro.cadena);
        System.out.println(miembro2.cadena);
        System.out.println(MiembrosEstaticos.cadena);
    }
}
