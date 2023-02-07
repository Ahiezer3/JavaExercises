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
public class MainNumeroComplejo {
    public static void main(String[] args){

        int opcion = 9;
        
        while( opcion != 0 ){
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción a seleccionar: "+
                    "\n 1 para sumar"+
                    "\n 2 para multiplicar"+
                    "\n 3 para comparar igualdad"+
                    "\n 4 para multiplicar por entero"+
                    "\n 0 para salir"));
            
            int numero = 1;
            NumeroComplejo numeroA = null;
            NumeroComplejo numeroB = null;
            
            while(numero <= 2){
                double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor para la parte entera del número complejo: "+numero));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor para la parte imaginaria del número complejo: "+numero));
                
                if( numero == 1 ){
                    numeroA = new NumeroComplejo(a, b);
                } else {
                     numeroB = new NumeroComplejo(a, b);
                }
                
                numero++;
            }
                
            switch(opcion){
  
                case 1 :
                    NumeroComplejo suma = numeroA.calcularSuma(numeroB);
                    System.out.println("Suma: parte entera: "+suma.getA()+", parte imaginaria: "+suma.getB());
                    
                    break;
                
                case 2 :
                    NumeroComplejo producto = numeroA.calcularProducto(numeroB);
                    System.out.println("Producto: parte entera: "+producto.getA()+", parte imaginaria: "+producto.getB());
                    break;
                    
                case 3 :
                    boolean igualdad = numeroA.compararIgualdad(numeroB);
                    System.out.println("Igualdad: "+igualdad);
                    break;
                    
                case 4 :
                    int entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor entero para multiplicar: "));

                    NumeroComplejo multiplicarEntero = numeroA.multiplicarPorEntero(entero);
                    System.out.println("Multiplicar por entero: parte entera: "+multiplicarEntero.getA()+", parte imaginaria: "+multiplicarEntero.getB());
                    break;
                default :
                    break;
            }
        }
    }
}
