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
public class Ejercicio_2 {
    
    public void Ejercicio_2(){
        float pagoPorHora, totalHoras, totalPago;
        
        pagoPorHora = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el Pago Por Hora:"));
        totalHoras = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el total de horas trabajadas"));
        
        totalPago = pagoPorHora * totalHoras;
        
        JOptionPane.showMessageDialog(null, totalPago);
    }
}
