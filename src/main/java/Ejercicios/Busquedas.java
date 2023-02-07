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
public class Busquedas {
    
    public void secuencial(){
        
        int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        boolean found = false;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número a buscar: "));
        int pos = 0;
        for(int number : array){
           
            if( number == num ){
                found = true;
                break;
            }
            
             pos++;
        }
        
        if( found ){
            JOptionPane.showConfirmDialog(null,"Número encontrado en la posición: "+pos);
        } else{
            JOptionPane.showMessageDialog(null,"Número no encontrado.");
        }
    }
    
    public void binaria(){
        
        int array[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        boolean found = false;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número a buscar: "));
        int pos = 0;
        int min = 0;
        int max = array[array.length-1];
        int middle = (min+max)/2;
        
        while( pos < array.length-1 && found == false && min <= max ){
            
            if( array[middle] == num ){
                found = true;
                break;
            }
            
            if( array[middle] > num ){
                max = middle;
                middle = (min+max)/2;
            }
            
            if( array[middle] < num ){
                min = middle;
                middle = (min+max)/2;
            }
            
            pos++;
        }
        
        if( found ){
            JOptionPane.showConfirmDialog(null,"Número encontrado en la posición: "+middle);
        } else{
            JOptionPane.showMessageDialog(null,"Número no encontrado.");
        }
        
    }
}
