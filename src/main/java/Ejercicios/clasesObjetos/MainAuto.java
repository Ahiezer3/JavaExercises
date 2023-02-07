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
public class MainAuto {
    
    public static void main(String[] args){
        
        int numeroAutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autos a registrar: "));
        int numeroAuto = 1;
        Auto autos[] = new Auto[numeroAutos];
        
        while( numeroAuto-1 < numeroAutos){
            
            String modelo = JOptionPane.showInputDialog("Ingrese el modelo del auto "+numeroAuto);
            String marca = JOptionPane.showInputDialog("Ingrese la marca del auto "+numeroAuto);
            Float precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del auto "+numeroAuto));
            
            Auto nuevoAuto = new Auto(modelo, marca, precio);
            
            autos[numeroAuto-1] = nuevoAuto;
            numeroAuto++;
        }
        
        Auto masBarato = Auto.masBarato(autos);
        
        if( masBarato != null ){
             JOptionPane.showConfirmDialog(null, "El auto más barato es: "+masBarato.getModelo()+", marca: "+masBarato.getMarca()+", precio: "+masBarato.getPrecio());
        } else {
            JOptionPane.showConfirmDialog(null, "No se encontraron autos");
        }
    }
}
