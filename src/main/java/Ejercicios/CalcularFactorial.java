/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author abi_h
 */
public class CalcularFactorial {
    
    public void factorial(){
        
        long numeroInicial, factorial = 1;
        
        numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
        
        for(int i = 1; i <= numeroInicial; i++){
            factorial *= i;
        }
        
        JOptionPane.showMessageDialog(null,"El factorial de: '"+numeroInicial+"' es: '"+factorial+"'.");
    }
}
