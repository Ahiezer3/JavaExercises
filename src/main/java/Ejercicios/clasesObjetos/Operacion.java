/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.clasesObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author abi_h
 */
public class Operacion {
    
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public void leerNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita el número 1:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita el número 2:"));
    }
    
    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }
    
    public int restar(int numero1, int numero2){
        resta = numero1 - numero2;
        
        return resta;
    }
    public void multiplicar(){
        multiplicacion = numero1 * numero2;
    }
    
    public void division(){
        division = numero1 / numero2;
    }
    
    public void resultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación es: "+multiplicacion);
        System.out.println("La división es: "+division);
    }
}
