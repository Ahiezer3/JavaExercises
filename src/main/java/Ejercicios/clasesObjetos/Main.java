/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.clasesObjetos;

/**
 *
 * @author abi_h
 */
public class Main {
    
    public static void main(String[] args){
    
//        Operacion op = new Operacion();
//        op.leerNumeros();
//        op.sumar(8,2);
//        op.multiplicar();
//        op.division();
//        op.resultados();
//        
//        int resta = op.restar(9,1);
//        
//        System.out.println("Resta: "+resta);

        Persona persona = new Persona("Abidan", 30);
        persona.mostrarDatos();
        persona.correr();
        persona.correr(10);
        
        Persona persona2 = new Persona("Adsf465");
        persona2.mostrarDatos();
    }
}
