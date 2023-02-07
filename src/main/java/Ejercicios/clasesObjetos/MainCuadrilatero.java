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
public class MainCuadrilatero {
    
    public static void main(String[]args){
        
        float lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor para el lado 1: "));
        float lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor para el lado 2: "));
        Cuadrilatero cuadrilatero = null;
        
        if( lado1 == lado2 ){
            cuadrilatero = new Cuadrilatero(lado1);
        } else {
            cuadrilatero = new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("Área: "+cuadrilatero.getArea()+", perímetro: "+cuadrilatero.getPerimetro());
    }
}
