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
public class MainTablero {
    
    public static void main(String[] args){
        
        Tablero tablero = new Tablero(0, 0);
        
        int opcion = 1;
        int valor = 0;
        
        while( opcion != 0 ){
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opción: "+
            "\n '4' para mover a la izquierda."+
            "\n '6' para mover a la derecha."+
            "\n '8' para mover hacia arriba."+
            "\n '2' para mover hacia abajo."+
            "\n '0' para salir."));
            
            if( opcion != 0 ){
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor para moverse: "));
            
                tablero.validarMovimiento(opcion, valor);
            }
            
            System.out.println("Las nuevas coordenadas son: (X: "+tablero.getX()+",Y: "+tablero.getY()+")");
        }
    }
}
