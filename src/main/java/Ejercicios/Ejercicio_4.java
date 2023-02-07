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
public class Ejercicio_4 {
    
    public void ejercicio4(){
        
        float dolaresLuis, dolaresGuillermo, dolaresJuan, total;
        
        dolaresGuillermo = Float.parseFloat(JOptionPane.showInputDialog("Introduce la cantidad de Dólares para Guillermo"));

        dolaresLuis = dolaresGuillermo / 2;
        dolaresJuan = (dolaresLuis + dolaresGuillermo)/2;
        
        total = dolaresGuillermo + dolaresLuis + dolaresJuan ;
        
        JOptionPane.showMessageDialog(null, "Dolares de Guillermo: "+dolaresGuillermo+"\nDólares Luis: "+dolaresLuis+"\nDolares Juan: "+dolaresJuan+"\nTotal Dolares: "+total);
    }
}
