/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.clasesObjetos;

/**
 *
 * @author abi_h
 */
public class Coche {
    String color;
    String marca;
    int km;
    
    public static void main(String[] args){
        
        Coche coche1 = new Coche();
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 10000;
        
        System.out.println("El color del coche es: "+coche1.color);
        System.out.println("La marca del coche es: "+coche1.marca);
        System.out.println("El km del coche es: "+coche1.km);
    
        Coche coche2 = new Coche();
        coche2.color = "Azul";
        coche2.marca = "VW";
        coche2.km = 0;
        
        System.out.println("El color del coche 2 es: "+coche2.color);
        System.out.println("La marca del coche 2 es: "+coche2.marca);
        System.out.println("El km del coche 2 es: "+coche2.km);
    }
}
